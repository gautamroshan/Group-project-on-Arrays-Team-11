
public class HangMan {
	public static void main(String[]args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Welcome to hangman!");
		System.out.println("Please enter (1) to Start the game or (0) to exit");
		int command = input.nextInt();
		String refresh="";
		String Gist=refresh;
		while (command == 1){
			String [] words = {"doctor", "pilot", "engineer", "teacher"};
			Gist=words[(int)(Math.random()*words.length)];
			System.out.println(Gist);
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
	public static String toshow(String gist){
		String value="";
		return value;
}
}
