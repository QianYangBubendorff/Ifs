package fh.campus02;

import java.util.Scanner;

public class ScannerVowel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Please enter a letter");
        String letter = s.next();

        while (!letter.equals("0")) {
            checkIFVowel(letter);
            letter = s.next();
        }

        System.out.println("Game over");
        s.close();
    }

    public static void checkIFVowel (String letter) {
        if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("u")) {
            System.out.println(" Your letter is a vowel. Please enter next letter!");
        } else {
            System.out.println(" Your letter is not a vowel, please enter next letter!");
        }
    }
}
