package ur.veli.admin.sevice;

import ur.veli.admin.dto.AccountDto;

public interface AccountService {


    AccountDto save(AccountDto accountDto);
    boolean isUnique(String login);
}
