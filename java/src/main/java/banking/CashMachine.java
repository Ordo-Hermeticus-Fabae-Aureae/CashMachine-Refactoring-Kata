package banking;

import java.math.BigDecimal;

class CashMachine {
    private final AccountAccessor accountAccessor = new AccountAccessor();

    public boolean withdraw(String town, String customerName, BigDecimal cashAmount) {
        return accountAccessor.withdraw(town, customerName, cashAmount);
    }
}
