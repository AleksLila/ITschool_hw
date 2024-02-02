package Lesson8;

public class Exercise7 {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.com.ua",
                         "https://google.com",
                         "http://wikipedia.org",
                         "facebook.com",
                         "https://instagram",
                         "codegym.cc"
        };
        for (String url : urls) {
            String protocol = checkProtocol(url);
            int domain = checkDomain(url);
            System.out.println("URL-адреса " + url + " містить мережевий протокол " + protocol + " і домен " + domain);
        }
    }
    public static String checkProtocol(String url) {
    //напишіть тут ваш код
        int value = url.indexOf("http");
        if(value==0) return "http";
        else return "невідомий";
    }
    public static int checkDomain(String url) {
    //напишіть тут ваш код
        int value = url.lastIndexOf("com");
        return value;
    }

}
