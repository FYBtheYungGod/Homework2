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


public class MyAssignment {
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
    public String missingFront(String str) { // starts method
        if (str.length() <= 3) { // this takes the length of the string and if it is less than 3 it returns it empty
            return "";
        }
        return str.substring(3); // this take a substring and makes return the remaining inputed word
    }

    public String swapEnds(String str) { // this uses the previous method as a stepping stone to complete

        if (str.length() < 2) { // if the string length is less than 2 it just returns the string
            return str;
        }


        char first = str.charAt(0); // take index of first character
        char last = str.charAt(str.length() - 1); // takes index of the last character
        String middle = str.substring(1, str.length() - 1); // takes everything the middle
        String swapped = last + middle + first; // swaps the points


        return swapped;
    }




}
