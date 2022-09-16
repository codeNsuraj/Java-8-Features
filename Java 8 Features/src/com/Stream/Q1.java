package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
	
	//filter out the employees whose age is more than equal to the 30
	public static void main(String[] args) {

		List<Employee> al = Arrays.asList(new Employee(1, "emp1", 25, 11000), new Employee(2, "emp2", 29, 32999),
				new Employee(3, "emp3", 35, 42974), new Employee(4, "emp4", 32, 136432));

		List<Employee> collect = al.stream().filter(x -> x.getAge() >= 30).collect(Collectors.toList());

		System.out.println(collect);
	}
}