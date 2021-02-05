package ur.veli.admin.entyty;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "account_id")
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    private String Login;
    private String password;
}
