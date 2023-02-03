/**
 * Chocolate
 * @Author Tron-Wesley Williams
 * @version 1.0
 * Course ITEC 2140 -05, Spring 2023
 *description:  Assume there are 9 bags of chocolate bars. Each bag has two chocolate bars. The bag is big enough to have three chocolate bars. If you want to take all the chocolates out of each bag and add three chocolate bars to each bag, how many bags will you need? Write a program to compute the number of bags you will need to add three chocolates instead of two chocolates.
 */



public class Chocolate {
    public static void main(String[] args ){
        double Maxbags = 9; // discribes the max number of bag that we can have. which is also the amount we start with
        double Chocolatebars = 2; // this just tells us the number of chocolate bar we start with.
        double totalchocolatebars = Maxbags * Chocolatebars; // this multiples the number of bag we have time the number of chocolate that is in each to give us the total about of chocolate bars

        double Newchocolatebags = totalchocolatebars/3; // this is the equation used to re distrubute the chocolate bars into the bags. 3 is for the new amount of chocolate per bag

        System.out.println("The new number of bags needed:" + Newchocolatebags); // displays the forumlas solution and give amount of bags needed




    }


}
