package ro.uvt;

import ro.uvt.lab10.ClientComponent;
import ro.uvt.lab10.SingletonComponent;
import ro.uvt.lab10.TransientComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab10Application {
    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(Lab10Application.class, args);

        TransientComponent transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();


        SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

                singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();



        ClientComponent c = context.getBean(ClientComponent.class);

        c.operation();

        c = (ClientComponent)context.getBean("clientComponent");
        c.operation();
    }
}
