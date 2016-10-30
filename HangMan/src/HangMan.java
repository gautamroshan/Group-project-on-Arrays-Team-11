import java.io.*;
// importing the io class from java API to read input from file
import java.util.Random;
// importing the Random class to generate random object.
import java.util.ArrayList;
// importing ArrayList to store multiple string objects
import java.util.Scanner;
// importing scanner object for file and user input.
public class HangMan {
	public static void main(String[]args){
		File WORDS = new File("Hangman_Words.txt");
		// using a file type 'WORDS' to store 'Hangman_Words.txt' 
		ArrayList<String> words = new ArrayList<String>();
		// defining a Arraylist 'words' to store multiple words
		String word;
		Random random=new Random();
		// defining a random object 'random'
		try{
			// try and catch used for displaying the error properly in case the file Hangman_Words.txt is not found
			Scanner inputfile = new Scanner(WORDS);
			// using the Scanner object 'inputfile' to take input from the file
		while (inputfile.hasNextLine()){
			word = inputfile.nextLine();
			words.add(word);
			// method for adding new words in the Arraylist
		}
		}
		catch (Exception e)
		//for displaying potential error.
		{
			System.out.println("The input file not found" + e.toString());
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to hangman!");
		System.out.println("Please enter (1) to Start the game or (0) to exit");
		int command = input.nextInt();
		if (command==0){
			System.out.println("Thank you! Please visit again!");
			System.exit(0);
		}
		String refresh="";
		String Gist=refresh;
		System.out.println("You have 10 chances to guess!");
		while (command == 1){
			int counter=10;
			Gist = words.get(random.nextInt(words.size()));
			//using random method defined above to produce random word from WORDS
			char [] letters = Gist.toCharArray();
			// using array of char type defined by toCharArray method for storing characters from Gist, which is our word.
			String tempGist=refresh;
			for (int j=0; j<Gist.length(); j++){
				tempGist=tempGist + "*";
			}
			// for displaying '*' version of word
				String OldGist = tempGist;
				while(!OldGist.equals(Gist)){
					System.out.println("Enter a letter in word: " + tempGist);
					System.out.println("You have "+counter+" chances to guess!");
					char letter=input.next().charAt(0);
					String Userletter=letter+"";
					tempGist=refresh;
						for (int k=0; k<Gist.length(); k++ ){
							String LetterFromGist=letters[k]+"";
								if (LetterFromGist.equalsIgnoreCase(Userletter)){
								tempGist+= letters[k];
								}
								else {
								tempGist= tempGist + OldGist.charAt(k);
					
								}
						}
						if(OldGist.equals(tempGist)){
							counter--;
							if (counter==0) break;
						}
						OldGist=tempGist;
			
				}
				if(OldGist.equals(Gist))
					System.out.println("You got it right");
				else System.out.println("You missed the word, it was "+ Gist);
				System.out.println("please enter (1) to continue to next word or (0) to exit");
				command = input.nextInt();
				
				if (command==0){
					System.out.println("Thank you! Please visit again!");
					System.exit(0);
					
				}
		}

	
		
	
	}
}