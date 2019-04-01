package day7_28march_111016_fs;

import java.util.Comparator;

public class AmountComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getAvergaeSpendAmount() > o2.getAvergaeSpendAmount())
			return 1;
		if(o1.getAvergaeSpendAmount() == o2.getAvergaeSpendAmount())
			return 0;
		return -1;
	}
	
	
}
