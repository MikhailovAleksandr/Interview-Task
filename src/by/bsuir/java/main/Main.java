package by.bsuir.java.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        char answer;
        String inputLine;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the string\n");
        inputLine = input.nextLine();

        char[] currentSequence = inputLine.toCharArray();
        WorkWithInputLine workWithInputLine = new WorkWithInputLine();
        answer = workWithInputLine.findSingleSymbol(currentSequence);
        System.out.println(answer);
    }


}
