/////////////////Morris Kimani

import java.util.Arrays;
import java.util.Scanner;

public class Q_1 {

    public static void main (String [] args){
        Scanner scan1 = new Scanner(System.in);

        int counter = 0;//useful for cycling through loops
        int arraySize = 0; //will hold the size of our array

        //1. get input for the array size and the array items
        System.out.println("Enter your array size: ");
        arraySize = scan1.nextInt();
        int [] array = new int [arraySize]; //The array that will hold the values we entered

        while (counter < arraySize){
            System.out.println("Enter a value for array point " + counter);
            array[counter] = scan1.nextInt();
            counter++;
        }
        counter = 0;// initialized to zero for reuse else where

        //2. sort the numbers in the array in ascending order
            // I will use the inbuilt methods for sorting an array
            Arrays.sort(array);

            // print out the sorted array
            System.out.print("\nThe sorted int array is: { ");
            for (int number : array) {
                System.out.print(number+" ");
            }
        System.out.print("}");

        //3. check their progression to determine inconsistencies
        int initProgression = 0; //will hold the first progression in the series of numbers
        int nextProgression = 0; //will hold the subsequent progression in the series
        int counter2 = 0;

        for (int i = 0; i < (arraySize -1); i++){

            int x = array[i + 1] - array[i];//get the difference between the two numbers

            System.out.println("\ndifference = " + x +"\t i = " + i + " \t i +1 = " + (i+1));

            if ( i == 0){
                initProgression = x;

            } else {

                //check if the initProgression is equal to the next
                if ((x == initProgression)){
                    counter++;//will give us how many times this progression occured

                } else {
                    nextProgression = x;
                    counter2++;
                }//end of if.. else

            }// end of if..else

        }//end for loop

        //check which progression occurred more and at what point
        if (nextProgression == 0) {
            //in this case, there was no anomally
            System.out.println("There was no missing number in the array");

        } else if (counter > counter2){
            System.out.println("The initial progression "+ initProgression + " occured " + counter+ " times");

            //go back and find where the anomaly happened, it will be the least occurring progression
            int x1 = 0; //will hold the difference we find through the second cycle
            int y = 0; //will hold the index for the array

            while(x1 != nextProgression){
                x1 = array[y + 1] - array[y];
                y++;
            }

            System.out.println("int where the anomaly occurred is after" + array[y]);

            //print out the missing number
            System.out.println("The missing number is ==> " + (array[y] + 1));

        }else {
            System.out.println("The next progression "+ nextProgression + " occured " + counter2+ " times");

            //go back and find where the anomaly happened
            int x1 = 0; //will hold the difference we find through the second cycle
            int y = 0; //will hold the index for the array

            while(x1 != initProgression){
                x1 = array[y + 1] - array[y];
                y++;
            }

            System.out.println("int where anomaly occurred is before " + array[y]);

            //print out the missing number
            System.out.println("The missing number is ==> " + (array[y] - 1));
        }//end if.. else

    }//end of main method
}
