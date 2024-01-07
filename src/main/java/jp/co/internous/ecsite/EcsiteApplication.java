package jp.co.internous.ecsite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("jp.co.internous.ecsite.model.mapper")
public class EcsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcsiteApplication.class, args);
	}

}
