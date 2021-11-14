package techno.java.collectin.asignA;
import java.util.*;
public class ArraySynchro {

	   public static void main (String[] args) {
	      List<String> list = new ArrayList<String>();
	      list.add("My");
	      list.add("Name is");
	      list.add("Sandesh");
	      list = Collections.synchronizedList(list);
	      synchronized(list) {
	         Iterator itr = list.iterator();
	         while (itr.hasNext())
	         System.out.print(itr.next()+" ");
	      }
	   }
	}

