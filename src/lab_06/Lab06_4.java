package lab_06;

import java.util.Arrays;

public class Lab06_4 {

    public static void main(String[] args) {

        String url = "https://google.com";

        System.out.println("http:" + url.contains("http:"));
        System.out.println("https: " + url.contains("https:"));
        System.out.println(".net: " + url.contains(".net"));
        System.out.println(".com: " + url.contains(".com"));;
        System.out.println("domain: " + url.substring(8));

    }
}
