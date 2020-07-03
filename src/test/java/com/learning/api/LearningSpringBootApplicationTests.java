package com.learning.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class LearningSpringBootApplicationTests {

	@Value("${pagination.n_items_per_pages}")
	private int nItemsPerPage;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testLoadContext() {
		assertEquals(100, this.nItemsPerPage);
	}

}
