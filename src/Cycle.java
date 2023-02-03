
/**
 * Cycle
 * @Author Tron-Wesley Williams
 * @version 1.0
 * Course ITEC 2140 -05, Spring 2023
 *description: In the Cycle shop, there are 10 bicycles and X numbers of tricycles. Assume that you count the number of wheels of the bicycles and there are 47 wheels of the bicycles and tricycles. How many of tricycle does this Cycle shop have? Write a program named Cycle.java and compute the total number tricycles at the shop.
*/
public class Cycle {
    public static void main(String [] args){
        double Bicycles = 10; // number of bicylces in the store
        double Totalwheels = 47; // total number of wheel in store
        double Bicyclewheel= 2; // number of bicycle wheels
        double Tricyclewheels =3; // number of wheels on a tricycle
        double Bicyclestotalwheels = Bicycles * Bicyclewheel; // gives total of bicycles wheels varible

        System.out.println(" Total number of Tricycles are " + ((Totalwheels - Bicyclestotalwheels)/Tricyclewheels)); //Formula for number of tricycles and prints them




    }
}
