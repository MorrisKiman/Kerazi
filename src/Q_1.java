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
        int deviatedProgression = 0; //will hold the subsequent progression in the series
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
                    deviatedProgression = x;
                    counter2++;
                }//end of if.. else

            }// end of if..else

            //check which progression occured more and at what point
            if (counter > counter2){
                System.out.println("The initial progression "+ initProgression + " occured " + counter+ " times");
            } else {
                System.out.println("The dev progression "+ deviatedProgression + " occured " + counter2+ " times");
            }//end if.. else
        }


        //4. spit out the missing number


    }//end of main method
}
