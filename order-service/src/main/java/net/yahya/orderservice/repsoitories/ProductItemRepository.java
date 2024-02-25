package net.yahya.orderservice.repsoitories;

import net.yahya.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}
