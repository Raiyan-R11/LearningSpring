package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        //retrieving myBean object from context
        MyBean myBean = (MyBean) context.getBean("myBean");
        //property tag in config sets the property with the value using the setter
        System.out.println(myBean);

    }
}
