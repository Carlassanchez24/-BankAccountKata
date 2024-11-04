import org.example.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


public class BankAccountTest {

    @Test
    @DisplayName("Cration of an account with unique number or an initial balance")
    void when_account_is_created_balance_is_zero() {
        //When
        Account account = new Account();

        //Then
        double  balance = account.getBalance();
        Assertions.assertEquals(0, balance);
    }
    @Test
    void when_account_is_created_balance_is_defined() {
        //When
        Account account = new Account(1000);

        //Then
        double balance = account.getBalance();
        Assertions.assertEquals(1000, balance);
    }
    @Test
    void when_deposit_account_must_be_sum_in_balance() {
        Account account = new Account(1000);

        account.deposit(500);

        double balance = account.getBalance();
        Assertions.assertEquals(1500, balance);

    }
    @Test
    void when_deposit_account_must_be_te_same_if_deposit_amount_is_negative() {
        Account account = new Account(1000);

        account.deposit(-500);

        double balance = account.getBalance();
        Assertions.assertEquals(1000, balance);
    }
    @Test
    void when_whithdraw_account_must_be_rest_in_balance() {
        Account account = new Account(1000);

        account.withdraw(500);

        double balance = account.getBalance();
        Assertions.assertEquals(500, balance);

    }
    @Test
    void when_whithdraw_amount_is_higher_than_balance() {
        Account account = new Account(1000);

        account.withdraw(2000);

        double balance = account.getBalance();
        Assertions.assertEquals(1000, balance);

    }


    @Test
    void when_consult_account_must_be_real_time_balance(){
        Account account = new Account(2000);

        account.deposit(500);
        account.withdraw(500);

        double balance = account.getBalance();
        Assertions.assertEquals(2000, balance);


    }
}
