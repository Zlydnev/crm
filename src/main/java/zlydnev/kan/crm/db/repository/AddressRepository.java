package zlydnev.kan.crm.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zlydnev.kan.crm.db.entity.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}
