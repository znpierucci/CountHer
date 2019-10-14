/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counther;

import java.lang.String;

/**
 *
 * @author zpierucci
 */
class CountHer
{
 
    // Driver method to test the counting of the string "her"
    public static void main(String args[])
    {
        CountHer countHer = new CountHer();
        String theInputStr = 
        	"My mother and father think that they are awesome, and I agree with him and her.";
        	
        int numOfOccurrences = countHer.searchString(theInputStr);
        
        System.out.println("The number of times I found her equals: " + numOfOccurrences);
    }
    
    int searchString(String inputString)
    {
        // Count the number of times the string "her" appears in the input string
        // Hint - look at this documentation to find a method or two that will help:
        // https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
        
        int length = inputString.length();
        int herCount = 0;
               
        for(int i = 0; i <= length - 1; i++){
            char current = inputString.charAt(i);
            if(inputString.charAt(i) == ('h')){
                //if there are no more letters after h, break the loop to prevent crashing
                if (i+1 == length){
                    break;
                }
                              
                if(inputString.charAt(i+1) == ('e')){
                    
                    //if there are no more letters after h, break the loop to prevent crashing
                    if (i+2 == length){
                        break;
                    }
                    
                    if(inputString.charAt(i+2) == ('r')){
                        herCount++;
                    }
                }
            }
        }
        
        
        
        return herCount;

    }
}
