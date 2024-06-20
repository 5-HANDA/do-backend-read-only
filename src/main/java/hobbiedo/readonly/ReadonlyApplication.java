package hobbiedo.readonly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReadonlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadonlyApplication.class, args);
	}

}
