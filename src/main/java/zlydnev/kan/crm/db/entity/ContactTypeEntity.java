package zlydnev.kan.crm.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zlydnev.kan.crm.db.base.BaseEntity;

import javax.persistence.*;

@Table(name = "contact_type")
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ContactTypeEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name ="type_name")
    private String typeName;
    @Column(name ="active")
    private Boolean active;
}
