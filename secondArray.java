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
             System.out.println("enter values, enter 0 to stop"); //ask user
             int n = scnr.nextInt(); //extract data from user
             array[i] = n; // store user data into array position i
        }
        int sum = getSum(array);
        System.out.println("the sum is " + sum);
        double avg = getAVG(array); 
        System.out.println("the avg is " + avg);

    } 
    // how many arguments will this take?
    public static int getSum(int[] a) {
        int sum = 0;
        //for loops and arrays are bffs!
        for(int i= 0; i< a.length; i++){
            sum += a[i]; //accumulate
        }
        return sum;

    }

    public static double getAVG(int[] a) {
        int sum = 0;
        //for loops and arrays are bffs!
        for(int i= 0; i< a.length; i++){
            sum += a[i]; //accumulate
        } 
        return ((double)sum)/((double)a.length); //typecast


    }

} 