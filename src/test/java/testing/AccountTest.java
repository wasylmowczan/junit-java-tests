package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class AccountTest {

    @Test
    void myTest() {
        Account newAccount = new Account();
        assertFalse(newAccount.isActive(), "Check if account is not active");
    }
}
