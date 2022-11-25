import com.it.config.SpringConfig;
import com.it.dao.UserDao;
import com.it.pojo.User;
import com.it.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class APP {
//    public static void main(String[] args) throws IOException {
//        String resource = "mybatis_config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sessionFactory.openSession();
//        UserDao userDao = sqlSession.getMapper(UserDao.class);
//        sqlSession.close();
//        User user = userDao.selectByID(1);
//        System.out.println(user);
//
//    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        User user = userService.selectByID(3);
        System.out.println(user);

    }
}
