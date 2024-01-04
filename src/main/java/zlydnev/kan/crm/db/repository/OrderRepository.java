package zlydnev.kan.crm.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zlydnev.kan.crm.db.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
