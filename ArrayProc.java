/* Save this in a file called Main.java to compile and test it */

import java.util.*;
import java.io.*;

public class ArrayProc {
    public static int processArray(ArrayList<Integer> array) {

        /* 
         * Do not make any changes outside this method.
         *
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the size of the
         * array. 
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
          for(int i =0; i<array.size()-1;i++){
            if(array.get(i)%2==0 && array.get(i+1)%2==0)
            	{
            		if(array.get(i)>array.get(i+1)){
            			array.remove(i);
                        processArray(array);
            		}
            		else{
            		
                    	array.remove(i+1);
processArray(array);
            		}
 


}





          }






        return array.size();
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int new_length = processArray(arrayList);
        for(int i=0; i<new_length; i++)
            System.out.println(arrayList.get(i));
    }
}
