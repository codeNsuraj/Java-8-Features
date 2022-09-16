package com.Stream;

import java.util.Arrays;
import java.util.List;

public class Q4 {
	
	public static void main(String[] args) {
		
		List<Employee> al = Arrays.asList(new Employee(1, "emp1", 23, 100000), new Employee(2, "emp2", 26, 130000),
				new Employee(3, "emp3", 22, 800000), new Employee(4, "emp4", 40, 1000000));
		
		al.stream().filter(x->(x.getAge()>22))
			.map((x)->{
				x.setSalary(x.getSalary()*1.1);
				return x;
				})
			.forEach(System.out::println);	
	}
}