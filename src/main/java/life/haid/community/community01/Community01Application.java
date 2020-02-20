package life.haid.community.community01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("life.haid.community.community01.mapper")
public class Community01Application {

    public static void main(String[] args) {
        SpringApplication.run(Community01Application.class, args);
    }

}
