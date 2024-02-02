package Lesson9;

public class Exercise3 {


    public static void main(String[] args) {
        double earthDiameter = 12742.0;
        double lightSpeed = 299792458.0;
        double uraniumAtomicMass = 238.0289;
        double averageBeeWeight = 0.085;
        double javaDeveloperSalary = 10000.0;
        String formattedNumber1 = String.format("%.4e", earthDiameter);
        String formattedNumber2 = String.format("%.8e", lightSpeed);
        System.out.println(formattedNumber1+"\n"+formattedNumber2);
    }
}
