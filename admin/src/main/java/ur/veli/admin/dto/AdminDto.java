package ur.veli.admin.dto;

import lombok.Data;
import ur.veli.admin.enusm.Role;

@Data
public class AdminDto {
    private Long id;
    private String name;
    private Role role;

}
