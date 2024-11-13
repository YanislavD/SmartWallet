package app.skeleton.entities.wallet;

import java.util.Currency;
import java.util.UUID;

// TODO: Implement the entity
public class Wallet  {

 private UUID id;
 private UUID ownerId;
 private String ownerUsername;
 private Currency currency;
 private double balance;
 private WalletStatus WalletStatus;

    protected Wallet (UUID ownerId, String ownerUsername, Currency currency, double initialBalance){
      this.ownerId = ownerId;
      this.ownerUsername = ownerUsername;
      this.currency = currency;
      this.balance += initialBalance;
      this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public UUID getOwnerId() {
        return ownerId;
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public WalletStatus getStatus() {
        return WalletStatus;
    }







}
