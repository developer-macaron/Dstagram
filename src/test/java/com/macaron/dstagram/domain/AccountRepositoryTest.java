package com.macaron.dstagram.domain;

import com.macaron.dstagram.domain.account.Account;
import com.macaron.dstagram.domain.account.AccountRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest // 안붙이면 Repository..autowired 할때 에러...이걸로 몇분을..
public class AccountRepositoryTest {
    @Autowired
    AccountRepository accountRepository;

//    @After
//    public void cleanup() {
//        accountRepository.deleteAll();
//    }

    @Test
    public void 회원_가입() {
        String name = "yjjeon";
        String password = "yjjeon";
        String status = "active";

        accountRepository.save(Account.builder()
                .name(name)
                .password(password)
                .status(status)
                .build());

        List<Account> accountList = accountRepository.findAll();

        Account account = accountList.get(0);
        System.out.println(accountList.size());
        System.out.println(account.getCreatedAt());
        assertThat(account.getName()).isEqualTo(name);
        assertThat(account.getStatus()).isEqualTo(status);
    }
}
