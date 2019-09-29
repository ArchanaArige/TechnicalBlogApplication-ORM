package technicalblog;


import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration

public class TechnicalBlogApplicationORM {
    public static void main(String[] args) {

        SpringApplication.run(TechnicalBlogApplicationORM.class, args);
    }
}