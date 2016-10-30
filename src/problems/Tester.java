package problems;

import java.util.HashMap;
import java.util.Map;

public class Tester {
	
	/* Main fuinction */
	public static void main(String[] args) {
		BoyerMooreHorspool bmh = new BoyerMooreHorspool("truth is most often used to truth being in ", "most");
		Map<Character, Integer> maMap = new HashMap<>();

		try {
			bmh.computeMoveAheadMap(maMap);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Map.Entry<Character, Integer> entry : maMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
	}
}
