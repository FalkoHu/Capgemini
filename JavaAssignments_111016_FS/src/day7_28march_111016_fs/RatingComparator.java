package day7_28march_111016_fs;

import java.util.Comparator;

public class RatingComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getRating() > o2.getRating())
			return 1;
		if(o1.getRating() == o2.getRating())
			return 0;
		return -1;
	}

}
