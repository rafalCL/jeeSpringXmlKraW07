package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld hw = ctx.getBean("helloWorld", HelloWorld.class);
        System.out.println(hw.getMessage());

        ctx.close();
    }
}
