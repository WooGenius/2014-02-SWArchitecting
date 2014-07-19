import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Sort sort = SortFactory.getInstance();
		
		 //Generate an integer array of length 7
	    ArrayList<Integer> input = generateRandomNumbers(7);
		
	    //Before sort
	    System.out.println(input);
		
		//After sort
	    System.out.println(sort.sort(input));
	}
	
	private static ArrayList<Integer> generateRandomNumbers(int n){
		
	    ArrayList<Integer> list = new ArrayList<Integer>(n);
	    Random random = new Random();
		
	    for (int i = 0; i < n; i++) {
		    list.add(random.nextInt(n * 10));
	    }
	
	    return list;
	}

}
