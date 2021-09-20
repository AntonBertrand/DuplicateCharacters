package com.example.mypackage;

import java.util.ArrayList;

public class Main {

    //Accepts a string and returns an integer value representing the number of distinct duplicated characters within string.

    public static void main(String[] args) {
        System.out.println(duplicateCharacters("Aasdefsgh!!!"));
    }

    public static int duplicateCharacters(String input) {

        ArrayList<Character> array = new ArrayList<>();

        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = i + 1; j < input.length(); j++) {

                if (input.charAt(i) == input.charAt(j)) {
                    boolean flag = false;

                    for (char character : array) {
                        if (input.charAt(i) == character) {
                            flag = true;
                        }
                    }

                    if (!flag) {
                        array.add(input.charAt(i));
                    }
                }


            }
        }

        return array.size();
    }
}
