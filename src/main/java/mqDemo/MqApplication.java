package mqDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SpringBoot 启动程序
 *
 * @author Administratormvn
 * java -jar xx.jar --spring.profiles.active=dev
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableSwagger2
public class MqApplication {
	public static void main(String[] args) {
		SpringApplication.run(MqApplication.class, args);
	}

}



