package ur.veli.admin.entyty;

import lombok.Data;
import ur.veli.admin.enusm.OperationType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Operation {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private OperationType operationType;

}
