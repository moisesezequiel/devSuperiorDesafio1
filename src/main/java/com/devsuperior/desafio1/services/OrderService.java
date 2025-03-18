package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class OrderService {

    public double total (Order order){
    	
        double discountValue = (order.getBasic() * order.getDiscount()) / 100;
        
        double finalPrice = order.getBasic()  - discountValue;
       
    	order.setBasic(finalPrice);
    	
        return order.getBasic();
    }
}
