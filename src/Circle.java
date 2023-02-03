/**
 * Circle
 * @Author Tron-Wesley Williams
 * @version 1.0
 * Course ITEC 2140 -05, Spring 2023
 *description: Write a program named Circle.java that displays the area and perimeter of a Circle that has a radius of 9.5 using the following formula
 * area = radius * radius * Math.PI
 * perimeter = 2 * radius * Math.PI
 *
 */




public class Circle {
    public static void main(String [] args){
       double radius = 9.5; // radius of circle value
       double area = radius * radius * Math.PI; // formula to find area
       double perimeter = 2 * radius * Math.PI; // formula find perimeter
       System.out.println( "the area of the circle is " + area); //displays area formula
       System.out.println( "the perimeter of the circle is " + perimeter); // displays perimeter formula

    }
}

