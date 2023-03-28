/**
 * SpeedLight
 * @Author Tron-Wesley Williams
 * @version 1.0
 * Course ITEC 2140 -05, Spring 2023
 *description: Calculate the volume and area of a cylinder with pi as 3.1416
 * A=2πrh+2πr2
 * V=πr2h
 */



public class CylinderCalculations {
    public static void main(String[] args){
        double pi = 3.1416; // vaule of pi
        double radiusofcylinder = 5.0; // random number given to radius one wasnt provided
        double hieghtofcylinder = 2.0; // random number given to cylinder radius wasn't provided
        double areaofcylinder = (2 * pi * radiusofcylinder * hieghtofcylinder) + (2 * pi * radiusofcylinder * hieghtofcylinder); // combines the two for the area
        double volumeofcylinder = pi * radiusofcylinder * 2 * hieghtofcylinder; // use formula to find volume
        System.out.println( "the area of a cylinder is " + areaofcylinder);
        System.out.println( " the volume of a cylinder is " + volumeofcylinder);







    }
}
