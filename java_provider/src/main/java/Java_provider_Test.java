import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Java_provider_Test {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:provider.xml");
        System.in.read();
    }
}
