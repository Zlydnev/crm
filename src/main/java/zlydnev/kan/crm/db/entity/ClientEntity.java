package zlydnev.kan.crm.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zlydnev.kan.crm.db.base.BaseEntity;
import zlydnev.kan.crm.enums.Gender;

import javax.persistence.*;
import java.util.List;

@Table(name = "client")
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ClientEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "gender")
    private Gender gender;
    @OneToMany(cascade = CascadeType.DETACH)
    @JoinColumn(name = "client_id")
    private List<ContactEntity> contactEntity;
    @OneToMany(cascade = CascadeType.DETACH)
    @JoinColumn(name = "client_id")
    private List<AddressEntity> addressEntities;


}
