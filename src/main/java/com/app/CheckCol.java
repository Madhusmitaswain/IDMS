package com.app.Thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CheckCol {
	public static void main(String[] args) {
		Predicate<Collection> pc=c->c.isEmpty();
		ArrayList<Integer> al=new ArrayList<>();
		al.add(89);
		System.out.println(pc.test(al));
	}

}
