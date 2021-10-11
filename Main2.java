package com.company.calcium_collision;

public class Main2 {

    public static void main(String[] args) {
        eraseSpecialSymbols("sfd#adf s sefa # sf >@< >#@< fsd ", new String[]{"#","@","<",">"});
    }

    public static void eraseSpecialSymbols(String sentence, String[] symbolsToErase) {

        String[] arraySentence = sentence.split("");

        // Loop for every symbol
        for (int i1 = 0; i1 < symbolsToErase.length; i1++){

            // Each loop to erase concrete symbol
            for (int i2 = 0; i2 < arraySentence.length; i2++) {
                if (symbolsToErase[i1].equals(arraySentence[i2])){

                    sentence = sentence.substring(0,i2) + sentence.substring(i2+1, arraySentence.length);
                    arraySentence = sentence.split("");

                }
            }


        }

        System.out.println(sentence);
    }

}

