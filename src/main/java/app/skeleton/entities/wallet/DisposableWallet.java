package app.skeleton.entities.wallet;

import java.util.Currency;
import java.util.UUID;

public class DisposableWallet extends Wallet {

    private int withdrawAttempts;

    protected DisposableWallet(UUID ownerId, String ownerUsername, Currency currency, double initialBalance) {
        super(ownerId, ownerUsername, currency, initialBalance);
        this.withdrawAttempts = 0;
        WalletStatus walletStatus = WalletStatus.ACTIVE;
    }
    
    @Override
    public String toString() {
        return String.format("Wallet %s:%n" +
                "Owner: %s%n" +
                "Currency: %s%n" +
                "Balance: %.2f%n" +
                "Status:  %n" +
                "Max withdrawals: 2%n" +
                "Current withdrawals: %d%n", getOwnerId(), getOwnerUsername(),getCurrency(),getBalance(),getStatus(),withdrawAttempts);
    }
}
