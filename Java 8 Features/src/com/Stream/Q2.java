package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
	// Give the increment of 10% for those who has more than 30 years of age

	public static void main(String[] args) {

		List<Employee> al = Arrays.asList(new Employee(1, "emp1", 29, 100000), new Employee(2, "emp2", 34, 150000),
				new Employee(3, "emp3", 31, 340000));

		List<Employee> collect = al.stream().filter(x -> x.getAge() > 30)
				.map(x -> {
					x.setSalary(x.getSalary() * 1.10);
						return x;
						})
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}