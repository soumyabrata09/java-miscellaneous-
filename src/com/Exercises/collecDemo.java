/**
 * 
 */
package com.Exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Sam
 *
 */
public class collecDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		Set<Employee> set = new HashSet<Employee>();
		
		Employee e = new Employee(2);
		list.add(e);
		e.setId(3);
		list.add(e);
		System.out.println("list size : "+ list.size() + " and list value " + list.toString());
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(" Actual List value after iterating over the collection object<arrayList> : " + itr.next());
		
		set.add(e);
		e.setId(4);
		set.add(e);
		itr = set.iterator();
		System.out.println("set size : "+ list.size() + " and set value " + list.toString());
		while(itr.hasNext())
			System.out.println(" Actual List value after iterating over the collection object<set> : " + itr.next());
	}

}
