package zlydnev.kan.crm.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import zlydnev.kan.crm.db.base.BaseEntity;

import javax.persistence.*;

@Table(name = "client_order")
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "count")
    private Integer count;
    @Column(name = "order_state")
    private String orderState;
    @OneToOne
    @JoinColumn(name = "client_id")
    private ClientEntity clientEntity;
}
