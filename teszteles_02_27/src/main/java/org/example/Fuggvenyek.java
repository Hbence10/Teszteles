package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Fuggvenyek {

    public static String middle(String word){
        if(word.length() % 2 == 1){
            return String.valueOf(word.charAt(Math.round(word.length()/2)));
        } else{
            return String.valueOf(word.charAt(Math.round(word.length()/2-1))) + String.valueOf(word.charAt(Math.round(word.length()/2)));
        }
    }

    public static Integer vowels(String word){
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int counter = 0;
        for (int i = 0; i < word.length(); i++){
            if (vowels.contains(word.charAt(i))){
                counter++;
            }
        }
        return counter;
    }

    public static Boolean checkLoopYear(int year){
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static Boolean passwordValidate(String password){
        password = password.toLowerCase();
        int numberCounter = 0;
        int isCharacterCounter = 0;

        ArrayList<Character> numberList = new ArrayList<>(Arrays.asList('0', '1', '2','3','4','5','6','7','8','9'));
        ArrayList<Character> characterList = new ArrayList<>();

        for (char i = 'a'; i <= 'z'; i++ ){
            characterList.add(i);
        }

        for(int i = 0; i < password.length(); i++){
            if (characterList.contains(password.charAt(i))){
                isCharacterCounter += 1;
            }
            if (numberList.contains(password.charAt(i))){
                numberCounter += 1;
            }
        }

        return password.length() >= 8 && numberCounter >=2 && isCharacterCounter + numberCounter == password.length();
    }

    public static Double triangleArea(double a, double b, double c){
        double s = (a + b + c) / 2;
        double asd =(s * (s-a) * (s-b) * (s-c));
        return Math.sqrt(asd);
    }
}

