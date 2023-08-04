package com.example.br.RestSB;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class RestSbApplicationTests {
		private BigDecimal meuSalario = new BigDecimal("10.00");
		

	@Test
	void contextLoads() {
		System.out.println("meu salario é:" + meuSalario);
	}

}
