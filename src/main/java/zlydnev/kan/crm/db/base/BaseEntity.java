package zlydnev.kan.crm.db.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.Mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "created_by")
    private String createdBy;
    @Column(name ="created_date")
    private LocalDateTime createdDate;
    @Column(name ="updated_by")
    private String updatedBy;
    @Column(name ="last_modified_date")
    private LocalDateTime lastModifiedDate;

}
