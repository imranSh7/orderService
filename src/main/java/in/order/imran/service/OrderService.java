package in.order.imran.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import in.order.imran.entity.Order;
import in.order.imran.event.PaymentCompletedEvent;
import in.order.imran.repository.OrderRepository;

@Service
public class OrderService {
	
    private final OrderRepository orderRepository;

	public OrderService(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}
    
	public void createOrder(PaymentCompletedEvent event) {

        Order order = new Order();

        order.setPaymentId(event.getPaymentId());
        order.setCheckoutId(event.getCheckoutId());

        order.setCustomerId(event.getCustomerId());
        order.setCustomerName(event.getCustomerName());

        order.setAmount(event.getAmount());

        order.setPaymentMethod(event.getPaymentMethod());

        order.setTransactionId(event.getTransactionId());

        order.setOrderStatus("ORDER_CREATED");

        order.setOrderDate(LocalDateTime.now());

        Order savedOrder = orderRepository.save(order);

        System.out.println("Order Created Successfully : "
                + savedOrder.getOrderId());

    }
		

	}




