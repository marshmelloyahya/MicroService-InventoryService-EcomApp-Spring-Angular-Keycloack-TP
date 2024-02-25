package net.yahya.orderservice.repsoitories;


import net.yahya.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
