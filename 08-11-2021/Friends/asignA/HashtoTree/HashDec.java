package techno.java.collectin.asignA.HashtoTree;

import java.util.Comparator;

public class HashDec implements Comparator<Hash>{

	@Override
	public int compare(Hash o1, Hash o2) {
		// TODO Auto-generated method stub
		return o2.id-o1.id;
	}

}
