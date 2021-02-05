package ur.veli.admin.sevice;

import ur.veli.admin.dto.AdminDto;
import ur.veli.admin.response.Response;

public interface EmloyeeSevice {
    Response save(AdminDto adminDto);

    AdminDto getEmployeeById(Long id);
}
