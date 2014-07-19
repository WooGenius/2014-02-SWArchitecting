import java.util.ArrayList;
import java.util.Random;


public class QuickSort implements Sort{

	@Override
	public ArrayList<Integer> sort(ArrayList<Integer> a) {
		System.out.println("By Quick Sort");
		return quickSort(a);
	}
		
		
	private ArrayList<Integer> quickSort(ArrayList<Integer> a) {
		if(a.size() <= 1){
			return a;
		}
		
		int middle = (int) Math.ceil((double)a.size() / 2);
		int pivot = a.get(middle);
 
		ArrayList<Integer> less = new ArrayList<Integer>();
		ArrayList<Integer> greater = new ArrayList<Integer>();
		
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i) <= pivot){
				if(i == middle){
					continue;
				}
				less.add(a.get(i));
			}
			else{
				greater.add(a.get(i));
			}
		}
		
		return concatenate(quickSort(less), pivot, quickSort(greater));
	}
	
	private ArrayList<Integer> concatenate(ArrayList<Integer> less, int pivot, ArrayList<Integer> greater){
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < less.size(); i++) {
			list.add(less.get(i));
		}
		
		list.add(pivot);
		
		for (int i = 0; i < greater.size(); i++) {
			list.add(greater.get(i));
		}
		
		return list;
	}

}
