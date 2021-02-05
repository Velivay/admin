package ur.veli.admin.entyty;

import lombok.Data;
import ur.veli.admin.dto.AccountDto;
import ur.veli.admin.enusm.Role;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user_id")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Role role;
    private AccountDto account;
}
