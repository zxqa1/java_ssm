import com.it.dao.impl.BookDaoImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Object dataSource = applicationContext.getBean("dataSource");
//        System.out.println(dataSource);

        BookDaoImpl bookDao = applicationContext.getBean(BookDaoImpl.class);
        bookDao.save();
    }
}
