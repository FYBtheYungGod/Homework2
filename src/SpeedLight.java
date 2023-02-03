/**
 * SpeedLight
 * @Author Tron-Wesley Williams
 * @version 1.0
 * Course ITEC 2140 -05, Spring 2023
 *description: The speed of sound is approximately 340 meter per second. Assume that you just saw a lightning flash and you heard the sound of thunder 5 seconds later. Write a program named SpeedLight.java that calculate the distance to a lightning strike based on the time elapsed between the flash and the sound of thunder
 */



public class SpeedLight {     // this is the name of the class
    public static void main(String[] args) {
        double Speedofsound = 340; // the speed of sound is giving in the prompt by giving it to a variable you can manipulate it later
        double Lightingdelay = 5;    // the delay in lighting in seconds is use to determine how the far lighting is.
                double Distanceaway = Speedofsound * Lightingdelay; // this is the way to calcuate the distance of somthing. velocity is = to distance over time we need to find the distance so we change the formula to find the distance then and meter to it beacause the sound was given to us in meters

        System.out.println( "The Distance of the lighting Strike is " + Distanceaway + "meters away."); // this simply just outputs the answer to the multiplcation above.






    }








}
