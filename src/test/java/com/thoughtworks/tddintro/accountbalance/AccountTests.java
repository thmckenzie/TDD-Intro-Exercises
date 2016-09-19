package com.thoughtworks.tddintro.account;
import org.junit.Test;

import org.junit.Ignore;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    private final Account account = new Account();

    String deposit = "deposit";
    String withdraw = "withdraw";

    @Test //PASSES
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){ assertThat(account.updateBalance(deposit, 100, 50), is(150));}


    @Test //PASSES
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){ assertThat(account.updateBalance(withdraw, 100, 50), is(50));}

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){ assertThat(account.updateBalance(withdraw, 50, 100), is(50));}
}
