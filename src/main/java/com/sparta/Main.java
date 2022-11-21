package com.sparta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String inputTime = "";

        boolean inputDone = false;

        System.out.println("Please enter a time in the format [hh:mm]:");

        int hours = 0;
        int minutes = 0;

        while (!inputDone) {
            inputTime = userInput.next();
            hours = Integer.parseInt(inputTime.substring(0, 2));
            minutes = Integer.parseInt(inputTime.substring(3));
            if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
                inputDone = true;
            } else {
                System.out.println("Please enter a valid time in the format [hh:mm]:");
            }
        }

        System.out.println(greeting(hours));
    }

    public static String greeting(int hours) {

        String greeting = "";

        switch (hours) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11:
                greeting = "Good Morning!";
                break;
            case 12, 13, 14, 15, 16, 17:
                greeting = "Good Afternoon!";
                break;
            case 18, 19, 20, 21, 22, 23:
                greeting = "Good Evening!";
                break;
        }

//        if (hours >= 0 && hours <= 11) {
//            greeting = "Good Morning!";
//        } else if (hours >= 12 && hours <= 17) {
//            greeting = "Good Afternoon!";
//        } else if (hours >= 18 && hours <= 23) {
//            greeting = "Good Evening!";
//        }

        return greeting;

    }
}