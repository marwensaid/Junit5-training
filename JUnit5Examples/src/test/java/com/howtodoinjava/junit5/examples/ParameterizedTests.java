package com.howtodoinjava.junit5.examples;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTests 
{
	boolean isPalindrome(String result) {
		return result != null && StringUtils.reverse(result).equals(result);
	}
	
	static Stream<String> argsProviderFactory() {
	    return Stream.of("alex", "brian");
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3 })
	void testValueSource(Integer argument) {
	    //test code
	}
	
	@ParameterizedTest
	@NullSource
	void testMethodNullSource(Integer argument) {
		assertTrue(argument == null);
	}
	
	@ParameterizedTest
	@EmptySource
	void testMethodEmptySource(String argument) {
		assertTrue(StringUtils.isEmpty(argument));
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	void testMethodNullAndEmptySource(String argument) {
		assertTrue(StringUtils.isEmpty(argument));
	}
	
	@ParameterizedTest
	@EnumSource(Direction.class)
	void testWithEnumSource(Direction d) {
	    assertNotNull(d);
	}
	
	@ParameterizedTest(name = "{index} - {0} is a palindrome")
	@ValueSource(strings = {"12321", "pop"})
	void palindromes(String word) {
	    assertTrue(isPalindrome(word));
	}
	
	@ParameterizedTest
	@CsvSource(value = {
	    "alex, 30",
	    "brian, 35",
	    "charles, 40"
	}, ignoreLeadingAndTrailingWhitespace = true)
	void testWithCsvSource(String name, int age) {
	    assertNotNull(name);
	    assertTrue(age > 0);
	}
	
	/*@ParameterizedTest
	@CsvFileSource(resources = "employeeData.csv", numLinesToSkip = 0)
	void testWithCsvFileSource(String name, int age) {
		assertNotNull(name);
	    assertTrue(age > 0);
	}*/

	
	@ParameterizedTest
	@ArgumentsSource(EmployeesArgumentsProvider.class)
	void testArgumentsSource(Employee employee, LocalDate date, Direction direction) {
	    assertTrue(Period.between(employee.getDob(), LocalDate.now()).get(ChronoUnit.YEARS) > 40);
	    assertNotNull(date);
	    assertNotNull(direction);
	}
	
	@ParameterizedTest
	@MethodSource("argsProviderFactory")
	void testWithMethodSource(String argument) {
	    assertNotNull(argument);
	}
}

enum Direction {
	EAST, WEST, NORTH, SOUTH
}

class EmployeesArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
          Arguments.of(new Employee(1, "Alex", LocalDate.of(1980, 2, 3)), LocalDate.now(), Direction.EAST),
          Arguments.of(new Employee(2, "Brian", LocalDate.of(1979, 2, 3)), LocalDate.now(), Direction.NORTH),
          Arguments.of(new Employee(3, "Charles", LocalDate.of(1978, 2, 3)), LocalDate.now(), Direction.SOUTH)
        );
    }
}

class Employee 
{
	private long id;
	private String name;
	private LocalDate dob;
	
	public Employee(long id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return this.dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + this.name + ", dob=" + this.dob + "]";
	}
}
