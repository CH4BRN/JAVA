package testMap;

import java.util.HashMap;
import java.util.Map;

import testMap.model.Key;
import testMap.model.Thing;

public class Main {

	public static void main(String[] args) {
		
		Map<Key,Thing> map = new HashMap<>();
		
		map.put(
				new Key("aa"),
				new Thing("AA") 
				);
		
		for (Thing t : map.values()) {
			System.out.print(t.Name);
		}
		
		for (Key key : map.keySet()) {
			System.out.print(key.Code);
		}
		
		

	}

}
