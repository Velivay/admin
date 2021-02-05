package ur.veli.admin.sevice;


import ur.veli.admin.dto.UserDto;
import ur.veli.admin.response.Response;

public interface UserService {
    Response save(UserDto userDto);

    Response newUser(Long id);

    Response editUser(Long id);

    Response deleteUser(Long id);

    UserDto getUser(Long Id);
}
