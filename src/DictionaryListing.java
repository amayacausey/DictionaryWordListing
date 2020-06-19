import java.util.Arrays;
import java.util.Scanner;

public class DictionaryListing {
    public static void main(String [] args){
        //Tell the user to input 10 words

        int i=0;
        String[] fruits = new String[10];
        Scanner sc=new Scanner(System.in);

        for (; i<fruits.length; i++){
            System.out.println("Enter 10 words: Please give me word  "+(i+1));
            fruits[i]=sc.nextLine(); }

        System.out.println("Here are the 10 words: " + Arrays.toString(fruits));
        System.out.println("Original order:"+ Arrays.toString(fruits));

        int size = fruits.length;
        for(int a=0;a <size-1;a++)
        {
            for(int b = a ; b < fruits.length; b++)
            {
                if(fruits[a].compareTo(fruits[b]) > 0)
                {
                    String temp = fruits[a];
                    fruits[a] = fruits[b];
                    fruits[b] = temp;
                }
            }
        }
        System.out.println( "Alphabetical Order: " +Arrays.toString(fruits));

        for(int a=0;a <size-1;a++)
        {
            for(int b = a ; b < fruits.length; b++)
            {
                if(fruits[a].compareTo(fruits[b]) < 0)
                {
                    String temp = fruits[a];
                    fruits[a] = fruits[b];
                    fruits[b] = temp;
                }
            }

        }
        System.out.println( "Reverse Alphabetical Order: " +Arrays.toString(fruits));













    }


}
