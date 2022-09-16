package com.Stream;

import java.util.Arrays;
import java.util.List;

//print the employees whose age is less than the 23

public class Q3 {
	public static void main(String[] args) {
		List<Employee> al = Arrays.asList(new Employee(1, "emp1", 23, 100000), new Employee(2, "emp2", 26, 130000),
				new Employee(3, "emp3", 22, 800000), new Employee(4, "emp4", 40, 1000000));
		al.stream().filter(x -> (x.getAge() < 23)).map(x -> x.getName()).forEach(System.out::println);
	}
}