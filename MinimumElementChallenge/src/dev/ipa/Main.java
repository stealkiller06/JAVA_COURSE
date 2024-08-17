package dev.ipa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[]  userNumbers = readIntegers();
        System.out.println(Arrays.toString(userNumbers));

        int minNumber = findMinNumber(userNumbers);
        System.out.println(minNumber);
    }

    public static int findMinNumber(int[] arrayIntegers){
        int minNumber = arrayIntegers[0];

        for(int currentNumber : arrayIntegers){
            if(currentNumber < minNumber){
                minNumber = currentNumber;
            }
        }

        return  minNumber;
    }
    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        String[] userInputSplit = userInput.split(",");

        int[] userInputIntegers = new int[userInputSplit.length];

        for(int i = 0; i < userInputIntegers.length; i++){
            userInputIntegers[i] = Integer.parseInt(userInputSplit[i]);
        }

        return userInputIntegers;

    }
}
