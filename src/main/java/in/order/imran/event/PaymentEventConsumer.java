package in.order.imran.event;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import in.order.imran.service.OrderService;

@Component
public class PaymentEventConsumer {

	private final OrderService orderService;

	public PaymentEventConsumer(OrderService orderService) {
		this.orderService = orderService;
	}

	@RabbitListener(queues = "${rabbitmq.queue}", containerFactory = "rabbitListenerContainerFactory")
	public void receivePaymentCompletedEvent(PaymentCompletedEvent event) {

		System.out.println(event.getPaymentId());

		orderService.createOrder(event);
	}

}
