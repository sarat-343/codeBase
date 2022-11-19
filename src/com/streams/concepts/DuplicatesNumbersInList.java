package com.streams.concepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class DuplicatesNumbersInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> intList = Arrays.asList(10,20,30,40,50,60,70,80,90,45,89,30,70,20);
HashSet<Integer> duplicates =new HashSet<>();
intList.stream().filter(i->!duplicates.add(i)).forEach(System.out::print);
System.out.println();
Optional<Integer> num = intList.stream().findAny();
if(num.isPresent())
	System.out.println(num.get());
Optional<Integer> num2 = intList.stream().findFirst();
if (num2.isPresent()) {
	System.out.println(num2.get());
}
	}

}
