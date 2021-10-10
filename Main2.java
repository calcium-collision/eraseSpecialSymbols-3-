package com.company.calcium_collision;

public class Main2 {

    public static void main(String[] args) {
        erase_special_symbols("sfd#adf s sefa # sf >@< >#@< fsd ", new String[]{"#","@","<",">"});
    }

    public static void erase_special_symbols(String sentence, String[] symbols_to_erase) {

        String[] array_sentence = sentence.split("");
        int offset = 0;

        // Loop for every symbol
        for (int i1 = 0; i1 < symbols_to_erase.length; i1++){

            // Each loop to erase concrete symbol
            for (int i2 = 0; i2 < array_sentence.length; i2++) {
                if (symbols_to_erase[i1].equals(array_sentence[i2])){


                    sentence = sentence.substring(0,i2) + sentence.substring(i2+1, array_sentence.length);
                    array_sentence = sentence.split("");
                    ++offset;

                }
            }


        }

        System.out.println(sentence);
    }

}

