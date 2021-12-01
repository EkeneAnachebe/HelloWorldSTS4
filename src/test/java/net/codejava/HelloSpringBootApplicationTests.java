package net.codejava;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringBootApplicationTests {

	@Autowired
	private MvcController mvcController;
	
	@Test
	void contextLoads() {
		assertThat(mvcController).isNotNull();
	}

}
