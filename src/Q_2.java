/////////////////Morris Kimani

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Q_2 {

    public static void main (String [] args){

        Scanner scan1 = new Scanner(System.in);
        String sentense; //will hold the sentense that will be entered

        //get input
        System.out.println("Enter a sentense: ");
        sentense = scan1.nextLine();

        String final_Sentense = reversed_String(sentense);

        System.out.println(final_Sentense);



    }//end of main method

    public static String reversed_String(String sent){
        //create two arrays for storing the broken string
        char[] strArray1 = new char[sent.length()];
        char[] strArray2 = new char[sent.length()];
        char [] temp_Array = new char[4];
        int counter = 0;

        strArray1 = sent.toCharArray();
        System.out.println("Size of the Array is " + strArray1.length);
        //check how many 4s go into our character array to determine how to handle the sentense

        if(strArray1.length % 4 == 0){
            //this means we can divide the whole sentence into groups of 4 without problems

            for (int i = 0; i < strArray1.length; i ++){
                temp_Array[counter] = strArray1[i];
                counter ++;

                if( counter == 4 ){

                    while (counter != 0){
                        strArray2[i - (counter-1)] = temp_Array[counter-1];
                        counter = counter - 1;

                    }//end while

                }//end if


            }//end of for loop

            sent = valueOf(strArray2);


        } else {
            //the number of chars gives a modulus
            int modulus = strArray1.length % 4; //the number of characters that will remain after the first full passes
            int exp_passes = Integer.parseInt(valueOf(strArray1.length % 4));//how many times should cycle through the array
            int done_passes = 0;//how many times we have cycled through the array

            System.out.println("The modulus => " +modulus);
            for (int i = 0; i < strArray1.length; i ++){
                temp_Array[counter] = strArray1[i];
                counter ++;

                if( counter == 4 ){

                    while (counter != 0){
                        strArray2[i - (counter-1)] = temp_Array[counter-1];
                        counter = counter - 1;

                    }//end while

                } else if (counter == modulus && done_passes == exp_passes){

                    while (counter != 0){
                        strArray2[i - (counter-1)] = temp_Array[counter-1];
                        counter = counter - 1;

                    }//end while
                }//end if

                done_passes ++;
            }//end of for loop

            sent = valueOf(strArray2);

        }// end if else


        return sent;
    }
}
