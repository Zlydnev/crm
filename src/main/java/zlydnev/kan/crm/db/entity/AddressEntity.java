package zlydnev.kan.crm.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zlydnev.kan.crm.db.base.BaseEntity;

import javax.persistence.*;

@Table(name = "address")
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AddressEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "street")
    private String street;
    @Column(name = "house")
    private String house;
    @Column(name = "full_address")
    private String fullAddress;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "region_id")
    private RegionEntity regionEntity;
}
