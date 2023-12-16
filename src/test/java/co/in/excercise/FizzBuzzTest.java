package co.in.excercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	private FizzBuzz fizzBuzz = null;

	@BeforeEach
	void setUp() {
		fizzBuzz = new FizzBuzz();
	}

	@AfterEach
	void tearDown() {
		fizzBuzz = null;
	}

	@Test
	public void fizzBuzzConvertorZero() {
		assertEquals("", fizzBuzz.convert(0));
	}

	@Test
	public void fizzBuzzConvertorMultiplesOfFive() {
		assertEquals("Buzz", fizzBuzz.convert(5));
	}

	@Test
	public void fizzBuzzConvertorMultiplesOfThree() {
		assertEquals("Fizz", fizzBuzz.convert(3));
	}

	@Test
	public void fizzBuzzConvertorMultiplesOfThreeAndFive() {
		assertEquals("FizzBuzz", fizzBuzz.convert(15));
	}

	@Test
	public void fizzBuzzConvertorForEleven() {
		assertEquals("", fizzBuzz.convert(11));
	}

}
