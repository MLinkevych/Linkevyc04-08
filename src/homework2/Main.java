package homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();

        String result = phrase.replaceAll("\\s+", " ");

        System.out.println(result);
    }

}
