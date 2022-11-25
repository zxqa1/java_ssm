package com.it;

import com.it.dao.BookDao;
import com.it.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisplusDemo03ApplicationTests {

	@Autowired
	private BookDao bookDao;
	@Test
	void contextLoads() {
		Book book = bookDao.selectById(1);
		System.out.println(book);
	}

}
