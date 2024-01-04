package zlydnev.kan.crm.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zlydnev.kan.crm.db.entity.ContactTypeEntity;

public interface ContactTypeRepository extends JpaRepository<ContactTypeEntity, Long> {
}
