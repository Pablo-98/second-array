import java.util.Scanner;

public class secondArray{

    /*
     * write a program that requests int values from user
     * the program will then store these int values from user into an array
     * then, calculate the sum and the average of the array 
     * create methods for getSum() and getAvg() that will perform these actions
     */
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("enter integer values");

        int total = scnr.nextInt();

        int [] array = new int[total]; //initialize the array with capacity

        //the purpose of this loop is to populate the array with user input 
        for (int i = 0; i < array.length; i++){
             System.out.println("enter value"); //ask user
             int n = scnr.nextInt(); //extract data from user
             array[i] = n; // store user data into array position i
        }

    } 
    // how many arguments will this take?
    public static int getSum(int[] a) {
        int sum = 0;
        return sum;

    }

}