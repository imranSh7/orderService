package in.order.imran.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.order.imran.event.PaymentCompletedEvent;
import in.order.imran.model.OrderRequest;
import in.order.imran.model.OrderResponse;
import in.order.imran.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}

	@PostMapping
	public void createOrder(@RequestBody PaymentCompletedEvent event) {
		orderService.createOrder(event);
	}

}
