package ur.veli.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ur.veli.admin.dto.UserDto;
import ur.veli.admin.response.Response;
import ur.veli.admin.sevice.UserService;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1/discount")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public Response saveUser(@Valid @RequestBody UserDto userDto){
        return userService.save(userDto);
    }
    @PutMapping("/Edit")
    public Response editUser(@Valid @RequestBody UserDto userDto){
        return userService.editUser(userDto.getId());
    }

    @DeleteMapping("/delete")
    public Response deleteUser (@RequestParam Long id){
        return userService.deleteUser(id);
    }
    @GetMapping("/new")
    public Response getOneUser(@RequestParam Long id){
        return  userService.newUser(id);
    }

    @GetMapping("/getUserById")
    public UserDto getUser(@RequestParam Long id){
        return userService.getUser(id);
    }
}
