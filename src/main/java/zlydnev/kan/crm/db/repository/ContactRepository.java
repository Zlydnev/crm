package zlydnev.kan.crm.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zlydnev.kan.crm.db.entity.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Long> {
}
