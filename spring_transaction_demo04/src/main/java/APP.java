import com.it.configs.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class APP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

    }
}
