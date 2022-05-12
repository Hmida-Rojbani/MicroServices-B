package de.tekup.order.services;

import java.util.List;

import org.springframework.stereotype.Service;

import de.tekup.order.entities.Order;
import de.tekup.order.repos.OrderRepos;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderService {
	
	private OrderRepos orderRepos;
	
	public List<Order> getOrders(){
		return orderRepos.findAll();
	}
	
	public Order saveOrder(Order order) {
		//process payment
		return orderRepos.save(order);
	}
	

}
