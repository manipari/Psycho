package org.col;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(10);
		li.add("Greens");
		li.add(true);
		li.add('M');
		System.out.println(li);
		
		List<Integer> lil = new ArrayList();
		lil.add(10);
		lil.add(10);
		lil.add(20);
		lil.add(30);
		lil.add(40);
		System.out.println(lil);
		
		
		
	}

}
