package cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
	@ResponseBody
	@RequestMapping(value="/aa")
	String home(){
		return "hello world";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
