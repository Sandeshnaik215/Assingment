package techno.java.collectin.asignA.HashtoTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class HashtoTree {
public static void main(String[] args) {
	Set<Hash>hashs=new HashSet<Hash>();
	hashs.add(new Hash("Sandesh", 309));
	hashs.add(new Hash("Vijay", 320));
	hashs.add(new Hash("Gourav", 306));
	hashs.add(new Hash("Monisha", 319));
	hashs.add(new Hash("Avinash", 308));
	
	Set set=new TreeSet(hashs);
	ArrayList ar= new  ArrayList(set);
	for(Object obj: ar) {
		System.out.println(obj);
	}
	ArrayList ara= new  ArrayList(set);
	Collections.sort(ar);
	System.out.println(ar);
	HashDec dec=new HashDec();
	Collections.sort(ar,dec);
	System.out.println(ar);
	
}
}
