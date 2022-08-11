package homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String phrase= scan.nextLine();
        System.out.println(WordClass.word(phrase));
        System.out.println(WordClass.count);
        System.out.println(WordClass.reversedWord(phrase));

    }

}
