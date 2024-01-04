package zlydnev.kan.crm.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zlydnev.kan.crm.db.base.BaseEntity;

import javax.persistence.*;

@Table(name = "region")
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class RegionEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "region_name")
    private String regionName;
    @Column(name = "region_code")
    private Integer regionCode;
}

