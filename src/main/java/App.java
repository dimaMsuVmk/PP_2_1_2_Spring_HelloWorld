import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorld_1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloWorld_2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHelloWorld_1 == beanHelloWorld_2);
        //System.out.println(beanHelloWorld_1.getMessage());
        Cat one = applicationContext.getBean(Cat.class);
        Cat two = applicationContext.getBean(Cat.class);
        System.out.println(one == two);
    }
}