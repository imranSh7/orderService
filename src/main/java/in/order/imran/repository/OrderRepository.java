package in.order.imran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.order.imran.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
