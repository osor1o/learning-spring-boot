package com.learning.api.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearningSpringBootApplicationTests {

	private String password = "123456";
	
	@Test
	public void generatePassword () {
		String encodedPassword1 = PasswordUtils.generate(password);
		String encodedPassword2 = PasswordUtils.generate(password);
		
		assertEquals(true, PasswordUtils.verify(password, encodedPassword1));
		assertEquals(true, PasswordUtils.verify(password, encodedPassword2));
		assertNotEquals(encodedPassword1, encodedPassword2);
	}

}
