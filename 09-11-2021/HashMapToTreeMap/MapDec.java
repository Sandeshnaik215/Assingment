package techno.java.Map;

import java.util.Comparator;

public class MapDec implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.id-o1.id;
	}

}
