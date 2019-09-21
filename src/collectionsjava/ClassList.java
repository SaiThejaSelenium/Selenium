package collectionsjava;

import java.util.LinkedList;
import java.util.List;

public class ClassList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new LinkedList<String>();

		list.add("Teja");
		list.add("Sai");
		list.add("Chennai");
		list.add("Hyd");

		// get method are used to retrive the data from list.
		String val = list.get(2);
		System.out.println(val);
		val = list.get(1);
		System.out.println(val);

		// size method are used to find the size of list
		int size = list.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {

			System.out.println(list.get(i));

		}

		for (int i = size-1; i >=0; i--) {

			System.out.println(list.get(i));

		}
		
//		list.clear();
//		
//		System.out.println(list.get(0));
		
		list.add(1, "OTP");
		System.out.println();
		size = list.size();
		
		for (int i = 0; i < size; i++) {

			System.out.println(list.get(i));

		}
		
		//remove method are used to remove the value in index
		list.remove(1);
		
		System.out.println();
		size = list.size();
		
		for (int i = 0; i < size; i++) {

			System.out.println(list.get(i));

		}
		
		

	}

}
