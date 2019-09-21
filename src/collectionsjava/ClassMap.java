package collectionsjava;

import java.util.HashMap;
import java.util.Map;

public class ClassMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map=new HashMap<>();
		
		//Using put method to store the values in map based on key and value
		map.put(1, "Teja");
		map.put(2, "Sai");
		map.put(3, "Chennai");
		
		//using get method to retrieve the values in map by using key value
		String val=map.get(2);
		System.out.println(val);

		int size=map.size();
		System.out.println(size);
		
		for(int i=1;i<=size;i++)
		{
			System.out.println(map.get(i));
		}
		
		
	}

}
