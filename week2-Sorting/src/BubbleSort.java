import java.util.ArrayList;


public class BubbleSort implements Sort{

	@Override
	public ArrayList<Integer> sort(ArrayList<Integer> a) {
		System.out.println("By Quick Sort");
		return bubbleSort(a);
}
	
	
private ArrayList<Integer> bubbleSort(ArrayList<Integer> a) {
	    int n = a.size();
	    for (int pass=1; pass < n; pass++) {  // count how many times
	        // This next loop becomes shorter and shorter
	        for (int i=0; i < n-pass; i++) {
	            if (a.get(i) > a.get(i+1)) {
	                // exchange elements
	                int temp = a.get(i);  
	                a.set(i, a.get(i+1));  
	                a.set(i+1, temp);
	            }
	        }
	    }
		return a;
	}

}
