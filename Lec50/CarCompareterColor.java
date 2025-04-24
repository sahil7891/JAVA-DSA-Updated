package Lec50;

import java.util.Comparator;

public class CarCompareterColor implements Comparator<Cars> { // ☻ CarCompareterColor
	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o1.color.compareTo(o2.color); // "This" compared to "Other"
	}

}
