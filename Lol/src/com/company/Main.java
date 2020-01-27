package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter string : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input += "`";
        ArrayList<String> parser = new ArrayList<>();
        ArrayList<Character> checker = new ArrayList<>();
        addData(checker);
        StringBuilder temp = new StringBuilder();
        for(int i=0;i<input.length();i++){

            if(checker.contains(input.charAt(i))){
                temp.append(input.charAt(i));
            }
            else {
                parser.add(temp.toString());
                temp = new StringBuilder();
            }
        }
        int answer = 0;
        for(String a : parser){
            if(a.compareTo("") == 0){
                continue;
            }
            answer += Integer.parseInt(a);
        }
        System.out.println("Answer : " + answer);
    }

    private static void addData(ArrayList<Character> checker) {
        checker.add('1');
        checker.add('2');
        checker.add('3');
        checker.add('4');
        checker.add('5');
        checker.add('6');
        checker.add('7');
        checker.add('8');
        checker.add('9');
        checker.add('0');
    }
}
