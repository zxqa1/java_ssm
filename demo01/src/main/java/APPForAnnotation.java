import com.it.config.SpringConfiguration;
import com.it.dao.impl.BookDaoImpl;
import com.it.service.BookService;
import com.it.service.impl.BookServiceImpl;
import jdk.nashorn.internal.ir.CallNode;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APPForAnnotation {
    public static void main(String[] args) {
        // 加载注解spring核心配置文件
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        BookDaoImpl bookDao = applicationContext.getBean(BookDaoImpl.class);
        BookServiceImpl bookService = applicationContext.getBean(BookServiceImpl.class);

        //bookDao.save();
        System.out.println(bookService);
        bookService.save();
        applicationContext.close();
    }
}
