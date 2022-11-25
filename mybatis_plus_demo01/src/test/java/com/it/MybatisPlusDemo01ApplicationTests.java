package com.it;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.it.dao.Book;
import com.it.dao.BookDao;
import com.it.dao.QueryBook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusDemo01ApplicationTests {

	@Autowired
	private BookDao bookDao;

	@Test
	void contextLoads() {
	}

	@Test
	void testPage(){
		IPage page = new Page(1,2); // 当前页数 每页几条
		bookDao.selectPage(page,null);
		System.out.println("当前页码值" + page.getCurrent());
		System.out.println("每页显示条数" + page.getSize();
		System.out.println("一共多少页" + page.getPages();
		System.out.println("一共多少条" + page.getTotal());
		System.out.println("数据" + page.getRecords());
	}

	@Test
	void getAll(){
		/**
		 * lt 小于
		 * gt 大于
		 * le 小于等于
		 * ge 大于等于
		 * eq 等于
		 */
		// 方式一 QueryWrapper
		// Wrapper 的实现类
		QueryWrapper qw = new QueryWrapper();
		qw.lt("age",18); // 条件: age 大于 18
		bookDao.selectList(qw);

		QueryWrapper<Book> qw2 = new QueryWrapper<Book>();
		qw2.lt("age",18).gt("age",10);
		qw2.lt("age",18).or().gt("age",30);

		// 方式二
		LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
		lqw.le(Book::getAge,18).ge(Book::getAge,10);
		lqw.le(Book::getAge,18).or().ge(Book::getAge,30);

		// null 值处理
//		Book book = new Book();
//		QueryBook queryBook = new QueryBook();
//		book.setAge(10);
//		queryBook.setAge2(30);
//		lqw.ge(null != book.getAge(), Book::getAge, book.getAge());
//		lqw.le(null != queryBook.getAge2(), Book::getAge, queryBook.getAge2());

		// null 值处理 -- 这里直接使用子类 QueryBook
		QueryBook queryBook = new QueryBook();
		queryBook.setAge(10);
		queryBook.setAge2(30);
		lqw.ge(null != queryBook.getAge(), Book::getAge, queryBook.getAge());
		lqw.le(null != queryBook.getAge2(), Book::getAge, queryBook.getAge2());
	}

}
