/**
 * Circle
 * @Author Tron-Wesley Williams
 * @version 1.0
 * Course ITEC 2140 -05, Spring 2023
 *description:

Complete the following Java coding problems:
reverseDoubleChar
sumDigits
birthdayName
missingFront
swapEnds
everyOther
nonStart
fibonacci
luckySum
hasPalindrome
powerOfTwo

Write a Java class that contains the completed methods and test them by calling the methods with appropriate inputs in the main method.

 */


public class WeekendMethodHomework {
    public static void main( String []args){
        System.out.println(" hello ");


    }
    // i dont understand i need help
    public static String reverseDoubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) + "" + str.charAt(i);
        }
        return result;
    }

    public int sumDigits(int n) { // sets up the method to be run
        int sum = 0; // makes a varible for the inter sum and starts at 0
        while (n > 0) {   //  starts while loop make the number n while it is more than zero it run the loop
            sum += n % 10;  //  this take the the sum variable divides it by in and spit out the remainder
            n /= 10; // divides n by 10
        }
        return sum; // returns the interger  after the loop
    }

    public static String birthdayName(String name) {

        String message = "Happy Birthday " + name + "!"; // sets up string method

        return message;  // Returns the string

    }






}
