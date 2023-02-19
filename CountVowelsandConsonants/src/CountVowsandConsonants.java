/*
Jeffrey Janvier
COP2805 - Homework #5.1
3/4/2022
This program prompts the user to enter a string and displays the number of vowels and
consonants in the string.
 */

import java.util.*;

public class CountVowsandConsonants {

	public static void main(String[] args) {
		
		// Prompt the user to enter a string
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String text = input.nextLine();
	    text = text.toUpperCase();
	    
	    // Create an char array of only letters from string
	    char[]charArray = text.toCharArray();
	    char[] newCharArray = new char[charArray.length];
	    for (int i = 0; i < charArray.length; i++) {
	    	if (charArray[i] >= 'A' && charArray[i] <= 'Z')
	    		newCharArray[i] = charArray[i];
	    }
	    
	    // Create a string from char array
	    String text2 = String.valueOf(newCharArray);
	   
	    // Create a string array for the string
	    String[] arrayStr = text2.split("");
	    
	    // Create a set that to remove the duplicate of the string
	    Set<String> textSet = new HashSet<>(Arrays.asList(arrayStr));
	    
	    
	    // Create a string array from the hashset
	    String[] txtArray = new String[textSet.size()];
	    textSet.toArray(txtArray);
	    
	    // Create a variable for the vowels and consonants count
	    int vowelsCount = 0;
	    int consCount = -1;
	    
	    // Create a hashset that store the vowels
	    Set<String> vowels = new HashSet<>();
	    vowels.add("A");
	    vowels.add("E");
	    vowels.add("O");
	    vowels.add("I");
	    vowels.add("U");
	     
	    // Process that string to count the vowels and consonants
	    for (String element: txtArray ) {
	      if (vowels.contains(element))
	        vowelsCount++;
	      else
	        consCount++;
	    }

	    // Display the content
	    System.out.println("The number of vowels is " + vowelsCount);

	    System.out.print("The number of consonants is " + consCount);
	}
}
