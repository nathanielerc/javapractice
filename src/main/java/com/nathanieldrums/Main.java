package com.nathanieldrums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");//println = function call
        int name = 737;//int = integer
        int x = 2;
        System.out.println(name + x);

        float y = 7.37f;//float = 32bit decimal number - double literal by default - f defines float
        double z = 3.20;//double = 64bit decimal number
        double result = y / z;//similar types but different sizes - compiler will use bigger size
        System.out.println(result);

        String next = "Anything we like";//String = text, non-primitive data type. Primitive data types have fixed size in RAM
        System.out.println(next);

        boolean line8 = name == 737;//boolean is always true or false
        boolean relevant = false || true;//|| (or) will always be true unless both inputs are false
        boolean and = true && true;// (and) && will always be false unless both inputs are true
        boolean nah = !false;// (not) inverts
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i = i + 1;
        }

        for (int j = 0; j<5; j += 1){//j+=1 is the same as j = j + 1
            System.out.println(j);
        }

        //Paint calculator

        Scanner userInput = new Scanner(System.in);//Creates new variable - Scanner. userInput allows input for width and height (userInput.next)
        int numberOfWalls;
        System.out.print("How many walls are in your room?");
        numberOfWalls = Integer.parseInt(userInput.next());//user enters number of rooms defining int numberOfWalls

        double tArea = 0;//tArea variable is created and defined as 0

        for (; numberOfWalls > 0; numberOfWalls-=1){//for loop repeats code while numberOfWalls variable is greater than 0
            System.out.println("Please enter the following values (m):");
            double width;
            System.out.print("Enter the width of your wall: ");
            width = Double.parseDouble(userInput.next());//userInput using Scanner variable
            double height;
            System.out.print("Enter the height of your wall: ");
            height = Double.parseDouble(userInput.next());

            double area = width * height;
            tArea+=area;//adds area for this loop to tArea variable
        }



        System.out.print(String.format("%.1f litres of paint",tArea / 6.5));//String.format = formatting (rounding and DP) and infusing (%.1f) of the string for better presentation

    }
}