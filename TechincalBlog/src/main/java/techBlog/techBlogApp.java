package techBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class techBlogApp {
    public static void main(String[] args){
        SpringApplication.run(techBlogApp.class,args);
    }
}
