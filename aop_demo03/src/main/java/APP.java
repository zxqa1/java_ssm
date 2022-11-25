import com.it.config.SpringConfig;
import com.it.dao.BrandDao;
import com.it.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BrandDao brandDao = applicationContext.getBean(BrandDao.class);
        brandDao.findNameByID(100);


    }
}
