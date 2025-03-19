package com.devsuperior.desafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class OrderService {

	
	@Autowired
	private ShippingService shippingService;
	
    public double total (Order order){
    	
        double discountValue = (order.getBasic() * order.getDiscount()) / 100;
        
        double finalPrice = order.getBasic()  - discountValue;
       
    	order.setBasic(finalPrice);
    	
      	order.setBasic(shippingService.shipment(order));
        return order.getBasic();
    }
}
