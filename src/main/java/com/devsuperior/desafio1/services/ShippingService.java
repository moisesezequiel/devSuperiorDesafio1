package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class ShippingService {

    public double shipment (Order order){
   
    	if (order.getBasic() < 100 ) {
    		
    		order.setBasic(order.getBasic()+20);
    		
    	} else if (order.getBasic() >= 100 && order.getBasic() <= 200) {
    		
    		order.setBasic(order.getBasic()+12);
    		
		} 
    
        return order.getBasic();
    }
}
