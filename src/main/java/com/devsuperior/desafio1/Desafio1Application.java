package com.devsuperior.desafio1;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio1.entities.Order;
import com.devsuperior.desafio1.services.OrderService;
import com.devsuperior.desafio1.services.ShippingService;

@SpringBootApplication
public class Desafio1Application  implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private ShippingService shippingService;
	

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
			Locale.setDefault(Locale.US);
	        Scanner scanner  = new Scanner(System.in);

	        System.out.print("INFORME O CODIGO DO PRODUTO: ");
	        int code = scanner.nextInt();
	        
	        
	        System.out.print("INFORME O VALOR DO PRODUTO: ");
	        double basic = scanner.nextDouble();
	        
	        
	        System.out.print("INFORME O DESCONTO DO PRODUTO: ");
	        double discount = scanner.nextDouble();

	        Order order  = new Order(code,basic,discount);

	        orderService.total(order);
	        shippingService.shipment(order);
	        
	        System.out.println("Pedido código: " + order.getCode());
	        
	        
	        System.out.println("Valor Total: " + order.getBasic());
	        
	        scanner.close();

	}

}
