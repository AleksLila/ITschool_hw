import java.util.Arrays;
import java.util.Random;

public class GeneticAlgorithm2 {

    private static final int POPULATION_SIZE = 50;
    private static final int CHROMOSOME_LENGTH = 8; // Each gene will be 8 bits
    private static final double MUTATION_RATE = 0.01;

    private static Random random = new Random();

    public static void main(String[] args) {
        int[][] population = initializePopulation();

        for (int generation = 1; generation <= 100; generation++) {
            double[] fitnessValues = calculateFitness(population);
            int[][] newPopulation = new int[POPULATION_SIZE][CHROMOSOME_LENGTH];

            for (int i = 0; i < POPULATION_SIZE; i += 2) {
                int[] parent1 = selectParent(population, fitnessValues);
                int[] parent2 = selectParent(population, fitnessValues);

                int[] child1 = crossover(parent1, parent2);
                int[] child2 = crossover(parent1, parent2);

                mutate(child1);
                mutate(child2);

                newPopulation[i] = child1;
                newPopulation[i + 1] = child2;
            }

            population = newPopulation;

            if (generation % 10 == 0) {
                System.out.println("Generation " + generation + ": Best Fitness = " + getBestFitness(fitnessValues));
            }
        }

        double[] fitnessValues = calculateFitness(population);
        int bestIndex = getBestFitnessIndex(fitnessValues);
        double bestValue = decodeChromosome(population[bestIndex]);

        System.out.println("\nBest solution found:");
        System.out.println("x = " + bestValue);
        System.out.println("f(x) = " + fitnessValues[bestIndex]);
    }

    private static int[][] initializePopulation() {
        int[][] population = new int[POPULATION_SIZE][CHROMOSOME_LENGTH];

        for (int i = 0; i < POPULATION_SIZE; i++) {
            for (int j = 0; j < CHROMOSOME_LENGTH; j++) {
                population[i][j] = random.nextInt(2);
            }
        }

        return population;
    }

    private static double[] calculateFitness(int[][] population) {
        double[] fitnessValues = new double[POPULATION_SIZE];

        for (int i = 0; i < POPULATION_SIZE; i++) {
            double x = decodeChromosome(population[i]);
            double fx = -(Math.pow((4 * x * x - 4 * x + 2), 2) / 256);
            fitnessValues[i] = fx;
        }

        return fitnessValues;
    }

    private static int[] selectParent(int[][] population, double[] fitnessValues) {
        double totalFitness = Arrays.stream(fitnessValues).sum();
        double randomValue = random.nextDouble() * totalFitness;

        double cumulativeFitness = 0;
        for (int i = 0; i < POPULATION_SIZE; i++) {
            cumulativeFitness += fitnessValues[i];
            if (cumulativeFitness >= randomValue) {
                return population[i];
            }
        }

        return population[POPULATION_SIZE - 1];
    }

    private static int[] crossover(int[] parent1, int[] parent2) {
        int crossoverPoint = random.nextInt(CHROMOSOME_LENGTH);
        int[] child = new int[CHROMOSOME_LENGTH];

        System.arraycopy(parent1, 0, child, 0, crossoverPoint);
        System.arraycopy(parent2, crossoverPoint, child, crossoverPoint, CHROMOSOME_LENGTH - crossoverPoint);

        return child;
    }

    private static void mutate(int[] chromosome) {
        for (int i = 0; i < CHROMOSOME_LENGTH; i++) {
            if (random.nextDouble() < MUTATION_RATE) {
                chromosome[i] ^= 1; // Flip the bit
            }
        }
    }

    private static double decodeChromosome(int[] chromosome) {
        int decimalValue = 0;

        for (int i = 0; i < CHROMOSOME_LENGTH; i++) {
            decimalValue += chromosome[i] * Math.pow(2, CHROMOSOME_LENGTH - i - 1);
        }

        double x = decimalValue * (255.0 / (Math.pow(2, CHROMOSOME_LENGTH) - 1));
        return x;
    }

    private static double getBestFitness(double[] fitnessValues) {
        return Arrays.stream(fitnessValues).max().orElse(Double.MIN_VALUE);
    }

    private static int getBestFitnessIndex(double[] fitnessValues) {
        int bestIndex = 0;
        double bestFitness = Double.MIN_VALUE;

        for (int i = 0; i < POPULATION_SIZE; i++) {
            if (fitnessValues[i] > bestFitness) {
                bestFitness = fitnessValues[i];
                bestIndex = i;
            }
        }

        return bestIndex;
    }
}

