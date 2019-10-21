import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;

import java.io.IOException;

public class Java_ConsumerTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        OrderService o = ioc.getBean(OrderService.class);
        o.initOrder("1");
        System.out.println("调用完成,,,,");
        System.in.read();
    }
}
