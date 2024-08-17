package ipa.dev;

import java.util.Scanner;

public class MinimunElement {
    public int readInteger(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers you want to enter:");

        return scanner.nextInt();
    }

    public int[] readElements(int numberOfElements){

        int[] integerArray = new int[numberOfElements];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i < numberOfElements; i++){
            integerArray[i] = scanner.nextInt();
        }

        return integerArray;

    }

    public int findMin(int[] arrayInteger){
        int minNumber = arrayInteger[0];

        for(int currentNumber : arrayInteger){
            if(currentNumber < minNumber){
                minNumber = currentNumber;
            }
        }
        return minNumber;
    }
}
