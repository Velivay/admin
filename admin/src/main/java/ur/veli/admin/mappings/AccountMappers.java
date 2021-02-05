package ur.veli.admin.mappings;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ur.veli.admin.dto.AccountDto;
import ur.veli.admin.dto.UserDto;
import ur.veli.admin.entyty.Account;


@Mapper
public interface AccountMappers {
    AccountMappers INSTANCE = Mappers.getMapper(AccountMappers.class);

    @Mapping(source = "userDto.account.login",target = "login")
    @Mapping(source = "userDto.account.password",target = "password")
    AccountDto userDtoToAccountDto(UserDto userDto);

    AccountDto toAccountDto(Account account);
    Account toAccount(AccountDto accountDto);
}
