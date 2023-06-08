package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class myEureka_Gateway_Mgmt_Main  
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(myEureka_Gateway_Mgmt_Main.class, args);
		
	}
}