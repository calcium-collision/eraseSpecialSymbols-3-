package com.company.calcium_collision;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Write some sentence:");
        String someSentence = in.nextLine();
        System.out.println("Ok. Now write symbols to erase e.g. !@#$&^)({}");
        String symbolsErase = in.nextLine();

        System.out.println(eraseSpecialSymbols(someSentence, symbolsErase));

    }

    public static String eraseSpecialSymbols(String sentence, String symbolsToErase) {

        for (char eraseSymbol: symbolsToErase.toCharArray()){
            sentence = sentence.replace(Character.toString(eraseSymbol), "");
        }
        return sentence;
    }

}
