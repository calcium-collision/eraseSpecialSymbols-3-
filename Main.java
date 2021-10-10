package com.company.calcium_collision;

public class Main {

    public static void main(String[] args) {
        erase_special_symbols("sfd#adf s sefa # sf >@< >#@< fsd ", new String[]{"#","@","<",">"});
    }

    public static void erase_special_symbols(String sentence, String[] symbols_to_erase) {

        String[] array_sentence = sentence.split("");
        String clean_sentence = "";

        // Loop for every symbol
        for (int i1 = 0; i1 < symbols_to_erase.length; i1++){

            // Each loop to erase concrete symbol
            for (int i2 = 0; i2 < array_sentence.length; i2++) {
                if (!symbols_to_erase[i1].equals(array_sentence[i2])){
                    clean_sentence += array_sentence[i2];

                }
            }

            // Update 'array_sentence' variable
            array_sentence = clean_sentence.split("");

            // Clear 'clean_sentence' if its not last loop
            if (i1 != symbols_to_erase.length - 1){
                clean_sentence = "";
            }
        }

        System.out.println(clean_sentence);
    }

}
