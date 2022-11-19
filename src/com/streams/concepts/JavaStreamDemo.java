package com.streams.concepts;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = Arrays.asList("RAM","SIYA","JANKI","PRIYA","CHETNA","CHANAKYA","","arbi");
//System.out.println(list.stream().count());
//list.stream().filter(s->s.length()>0).map(s->s.toUpperCase()).filter(s->s.startsWith("C")).forEach(s->System.out.println(s));
//list.stream().filter(s->s.length()>3).forEach(System.out::println);
List<String> nonEmptyList = list.stream().filter(s->s.length()>0).collect(Collectors.toList());
//nonEmptyList.forEach(System.out::println);

String result = list.stream().filter(s->!s.isEmpty()).filter(s->s.startsWith("C")).map(s->s.toUpperCase()+"1").collect(Collectors.joining(":"));
//System.out.println(result);


List<Integer> intList = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
intList.stream().distinct().map(i->i*i).forEach(i->System.out.print(i+" "));
System.out.println();
//intList.stream().distinct().map(i->i*i).forEachOrdered(System.out::print);
System.out.println();
IntSummaryStatistics iss = intList.stream().mapToInt(i->i.intValue()).summaryStatistics();
System.out.println(iss.getAverage());
System.out.println(iss.getCount());
System.out.println(iss.getMax());
System.out.println(iss.getMin());
System.out.println(iss.getSum());


	}

}
