package springboot;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration
@Configuration
@ComponentScan
@MapperScan("springboot.dao")
public class App {

	private Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	/*
	 * @RequestMapping(value="/hello") public String hello(){
	 * logger.info("方法进入");
	 * 
	 * List<User> list=userService.get(); return list.get(0).getName(); }
	 */

}
