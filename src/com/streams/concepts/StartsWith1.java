package com.streams.concepts;

import java.util.ArrayList;
import java.util.List;

public class StartsWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> nums = new ArrayList<Integer>();
nums.add(23);
nums.add(15);
nums.add(13);
nums.add(35);


nums.stream().map(s-> s+"").filter(i->i.startsWith("1")).sorted((i,j)->j.compareTo(i)).forEach(System.out::println);;


	}

}
