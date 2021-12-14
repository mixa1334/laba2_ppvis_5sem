package model.wallet;

import java.math.BigDecimal;

public class Wallet {
    private int walletId;
    private BigDecimal countOfMoney;

    public Wallet() {
    }

    public boolean isWalletEmpty() {
        return true;
    }

    public boolean updateMoneyCount() {
        return true;
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public BigDecimal getCountOfMoney() {
        return countOfMoney;
    }

    public void setCountOfMoney(BigDecimal countOfMoney) {
        this.countOfMoney = countOfMoney;
    }
}
