package ur.veli.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ur.veli.admin.entyty.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account,String>{

    boolean existsByLogin(String login);

}

