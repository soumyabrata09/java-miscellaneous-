/**
 * 
 */
package com.Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//import com.org.swingComponents.frameConstruct;
import com.org.swingComponents.tableConstruct;

/**
 * @author Sam
 *
 */
public class testFrameConstruct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		tableConstruct obj = tableConstruct.getInstance();
		Map<Integer, Integer> hmap = new HashMap<Integer,Integer>();
		for(int i =0; i<= 190; i++) {
			
			hmap.put(i+1, (new Random()).nextInt(100));
		}
		obj.getFrameTest(hmap);
		

	}

}
