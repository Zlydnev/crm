package zlydnev.kan.crm.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zlydnev.kan.crm.db.base.BaseEntity;

import javax.persistence.*;

@Table(name = "contact")
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ContactEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "contact")
    private String contact;
    @Column(name = "active")
    private Boolean active;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "contact_type_id")
    private ContactTypeEntity contactTypeEntity;
}
