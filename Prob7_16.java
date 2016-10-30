////This is code to sort an array and calculate the execution time.
//The main part of this code was sourced from github LuizGsa21
public class Prob7_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This sets the size of our array to 100000
		int size = 100000;
 
			
	        int[] numbers = new int[size];
	        //Randomly generates the array
	        int key = (int)(Math.random() * size);
	        for (int i = 0; i < size; i++) {
	            numbers[i] = (int)(Math.random() * size);
	        }
	        //Sets variable start as the time in miliseconds
	        long start = System.currentTimeMillis();
	        int index = linearSearch(numbers, key);
	        //Sets variable final time as currenttime minus the start line
	        long finalTime = System.currentTimeMillis() - start;
	        //Print line to show user the time of search
	        System.out.println("LinearSearch - Total time of search is: " + finalTime + " index = " + index);
	        
	        start = System.currentTimeMillis();
	        //Says it sorting the array
	        System.out.println("Sorting array...");
	        //Uses sort method to actually sorts the array
	        sort(numbers);
	       
	        finalTime = System.currentTimeMillis() - start;
	        //Says its finished sorting
	        System.out.println("Finished sorting.");
	        int index2 = binarySearch(numbers, key);
	        //Print line for final time of search
	        System.out.println("BINARY - Total time of search is: " + finalTime+ " index = " + index2);


	    }
	////Sort method to sort the array
	    public static int[] sort(int[] numbers) {

	        for (int i = 0; i < numbers.length - 1; i++) {

	            int swapIndex = i;
	            int low = numbers[i];
	            for (int k = i + 1; k < numbers.length; k++) {

	                if (low > numbers[k]) {
	                    low = numbers[k];
	                    swapIndex = k;
	                }
	            }
	            if (swapIndex != i) {
	               numbers[swapIndex] = numbers[i];
	               numbers[i] = low;
	            }

	        }
	        return numbers;
	    }


	    public static int linearSearch(int[] numbers, int key) {


	        for (int i = 0; i < numbers.length; i++) {
	             if (numbers[i] == key) return i;
	        }

	        return -1;
	    }
	    public static int binarySearch(int[] numbers, int key) {
	        int low = 0;
	        int high = numbers.length;


	        while (high >= low) {
	            int mid = (high + low) / 2;
	            if (key > numbers[mid]) {

	                low = mid + 1;

	            } else if (key == numbers[mid]) {
	                return mid;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return -low - 1;
	    }	

	}


