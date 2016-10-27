/*Hi Guys,
 * I decided to take lead on the program number 7.35
 * We need to add the following features to our program.
 * 1. Counting the missed letters.
 * 2. Putting an end to the game with some message or option for playing again
 * 3. Maybe provide some hints for the words 
 */
import java.io.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class HangMan {
	public static void main(String[]args){
		File WORDS = new File("Hangman_Words.txt");
		ArrayList<String> words = new ArrayList<String>();
		String word;
		Random random=new Random();
		try{
			Scanner inputfile = new Scanner(WORDS);
		while (inputfile.hasNextLine()){
			word = inputfile.nextLine();
			words.add(word);
		}
		}
		catch (Exception e)
		{
			System.out.println("The input file not found" + e.toString());
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to hangman!");
		System.out.println("Please enter (1) to Start the game or (0) to exit");
		int command = input.nextInt();
		String refresh="";
		String Gist=refresh;
		while (command == 1){
			Gist = words.get(random.nextInt(words.size()));
			System.out.println(Gist);
			// I added this statement just for debugging purpose.
			char [] letters = new char [Gist.length()];
			for (int i=0; i< Gist.length(); i++){
				letters[i]= Gist.charAt(i);
			}
			String tempGist=refresh;
			for (int j=0; j<Gist.length(); j++){
				tempGist=tempGist + "*";
			}
			while (tempGist != Gist){
				String OldGist = tempGist;
			System.out.println("Enter a letter in word: " + tempGist);
			char deko=input.next().charAt(0);
			tempGist=refresh;
			for (int k=0; k<Gist.length(); k++ ){
				if (deko == letters[k]){
					tempGist= tempGist + deko;
				}
				else {
					tempGist= tempGist + OldGist.charAt(k);
					
				}
			}
			System.out.println(tempGist);
	}
		System.out.println("please enter (1) to continue to next word or (0) to exit");
		command = input.nextInt();
	}

}
	
}
