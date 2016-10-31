/*Hi Guys,
 *Please add a method or edit the code for giving number of chances and counting them.
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
		if (command==0){
			System.out.println("Thank you! Please visit again!");
			System.exit(0);
		}
		String refresh="";
		String Gist=refresh;
		while (command == 1){
			Gist = words.get(random.nextInt(words.size()));
			System.out.println(Gist);
			// I added this statement just for debugging purpose.
			char [] letters = Gist.toCharArray();
			String tempGist=refresh;
			for (int j=0; j<Gist.length(); j++){
				tempGist=tempGist + "*";
			}
				String OldGist = tempGist;
				while(tempGist!=Gist){
			System.out.println("Enter a letter in word: " + tempGist);
			char deko=input.next().charAt(0);
			tempGist=refresh;
			for (int k=0; k<Gist.length(); k++ ){
				if (deko == letters[k]){
					tempGist+= deko;
				}
				else {
					tempGist= tempGist + OldGist.charAt(k);
					
				}
			}
			OldGist=tempGist;
			if (OldGist.matches(Gist)){
				System.out.println(Gist);
				System.out.println("You got it right!");
				break;
			}
	}
				System.out.println("please enter (1) to continue to next word or (0) to exit");
				command = input.nextInt();
				if (command==0){
					System.out.println("Thank you! Please visit again!");
					System.exit(0);
				}
		}
	}
}
