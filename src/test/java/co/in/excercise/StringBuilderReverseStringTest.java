package co.in.excercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringBuilderReverseStringTest {
	StringBuilderReverseString builderReverseString = null;

	@BeforeEach
	void setUp() {
		builderReverseString = new StringBuilderReverseString();
	}

	@Test
	public void builderReverseStringEmptyInput() {
		assertEquals("", builderReverseString.reverseString(""));
	}

	@Test
	public void builderReverseStringNull() {
		assertEquals("", builderReverseString.reverseString(null));
	}

	@Test
	public void builderReverseStringSingleWord() {
		assertEquals("iH", builderReverseString.reverseString("Hi"));
	}

	@Test
	public void builderReverseStringMultipleWords() {
		assertEquals("iH olleH", builderReverseString.reverseString("Hi Hello"));
	}
	@Test
	public void builderReverseStringSpecialCharacter() {
		assertEquals("olleH@iH", builderReverseString.reverseString("Hi@Hello"));
	}

	@AfterEach
	void tearDown() {
		builderReverseString = null;
	}
}
