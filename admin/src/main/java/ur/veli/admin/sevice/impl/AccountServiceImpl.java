package ur.veli.admin.sevice.impl;

import ur.veli.admin.dto.AccountDto;
import ur.veli.admin.sevice.AccountService;

public class AccountServiceImpl implements AccountService {
    @Override
    public AccountDto save(AccountDto accountDto) {
        return null;
    }

    @Override
    public boolean isUnique(String login) {
        return false;
    }
}
