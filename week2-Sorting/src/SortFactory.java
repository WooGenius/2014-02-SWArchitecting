import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;


public class SortFactory {

	public static Sort getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Serializer serializer = new Persister();
        File source = new File("./getSort.xml");
        String stString = null;
         
        SortType st = null;
        try {
            st = serializer.read(SortType.class, source);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        stString = st.getSortType();
        
//      // if-else
//        if (stString.equals("bubble")) {
//        	sort = new BubbleSort();   
//        	System.out.println("By Bubble Sort");
//        } else if (stString.equals("quick")) {
//        	sort = new QuickSort();        	
//        	System.out.println("By Quick Sort");
//        }
        
        // reflection
        Sort sort = (Sort)Class.forName(stString).newInstance();
        
		return sort;
	}

}
