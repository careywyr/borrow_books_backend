package cn.mingming.borrowbooks;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author carey
 */
@SpringBootApplication
@MapperScan("cn.mingming.borrowbooks.dao.mapper")
public class BorrowBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(BorrowBooksApplication.class, args);
	}

}
