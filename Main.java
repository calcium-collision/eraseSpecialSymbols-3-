package com.company.calcium_collision;

public class Main {

    public static void main(String[] args) {
        eraseSpecialSymbols("sfd#adf s sefa # sf >@< >#@< fsd ", new String[]{"#","@","<",">"});
    }

    public static void eraseSpecialSymbols(String sentence, String[] symbolsToErase) {

        String[] arraySentence = sentence.split("");
        String cleanSentence = "";

        // Loop for every symbol
        for (int i = 0; i < symbolsToErase.length; i++){

            // Each loop to erase concrete symbol
            for (int j = 0; j < arraySentence.length; j++) {
                if (!symbolsToErase[i].equals(arraySentence[j])){
                    cleanSentence += arraySentence[j];

                }
            }

            // Update 'arraySentence' variable
            arraySentence = cleanSentence.split("");

            // Clear 'cleanSentence' if its not last loop
            if (i != symbolsToErase.length - 1){
                cleanSentence = "";
            }
        }

        System.out.println(cleanSentence);
    }

}
