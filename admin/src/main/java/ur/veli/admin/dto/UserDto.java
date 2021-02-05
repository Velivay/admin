package ur.veli.admin.dto;

import lombok.Data;
import ur.veli.admin.entyty.Account;
import ur.veli.admin.enusm.Role;

@Data
public class UserDto {
    private Long id;
    private String name;
    private Account account;
    private Role role;
}
