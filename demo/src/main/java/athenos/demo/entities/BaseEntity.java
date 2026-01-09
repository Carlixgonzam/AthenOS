package athenos.demo.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;
import jakarta.persistence.GenerationType;

@Data
@MappedSuperclass
public abstract class BaseEntity {
    @PodamExclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return this.id;
    }

}
