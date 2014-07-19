import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class SortType {
	
	@Element
	private String sortType;
	
	public SortType() {
		super();
	}

	public String getSortType() {
        return sortType;
    }

}
