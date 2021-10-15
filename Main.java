package com.company.calcium_collision;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Write some sentence:");
        String someSentence = in.nextLine();
        System.out.println("Ok. Now write symbols to erase e.g. !@#$&^)({}");
        String symbolsErase = in.nextLine();

        // Check if sentence contain symbols to erase
        Pattern p = Pattern.compile(symbolsErase, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(someSentence);
        boolean symbolsToEraseExists = m.find();
        if (!symbolsToEraseExists) {
            System.out.println(eraseSpecialSymbols(someSentence, symbolsErase));
        }
        else {
            System.out.print("There is no symbols to erase");
        }
    }

    // Method accept string sentence and string symbols to erase
    public static String eraseSpecialSymbols(String sentence, String symbolsToErase) {

        // for-each loop for every symbol
        for (char eraseSymbol: symbolsToErase.toCharArray()){
            // Replacement symbol on null string
            // Used Character.toString cuz Character.MIN_VALUE result is crossed out square in console
            // Look Character.MIN_VALUE result.png
            sentence = sentence.replace(Character.toString(eraseSymbol), "");
        }
        return sentence;
    }

}
