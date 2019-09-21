package collectionsjava;

import java.util.HashSet;
import java.util.Set;

public class ClassSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
	
		for(Integer i:set) {
			System.out.println(i);
		}
		
		set.add(4);
		set.removeAll(set);
		for(Integer i:set) {
			System.out.println(i);
			
			
		}
		
		System.out.println(" set size is : "+set.size());
		

	}

}
