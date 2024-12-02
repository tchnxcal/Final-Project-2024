
public class CreditCard {
    private Money balance; // Creates a balance object with the use of money object
    private Money creditLimit; // Creates a creditLimit object with the use of money object
    private Person owner; // Creates an owner object with the use of person object

    public CreditCard(Person owner, Money creditLimit) {
        this.creditLimit = creditLimit;
        this.owner = owner;
        this.balance = new Money(0); // Creates balance based on money object with an initial value of 0
        // Constructor method, automatically called when "new" is written to create an object
    }

    public Money getBalance() {
        return new Money(this.balance); // New object ensures that the owner cannot manipulate the actual values inside CreditCard
    }

    public Money getCreditLimit() {
        return new Money(this.creditLimit);
        // Returns a copy of the credit limit
    }

    public String getPersonals() {
        return owner.toString();
        // Returns the owner's details as a string
    }

    public void charge(Money amount) {
        Money newBalance = this.balance.add(amount);
        if (newBalance.compareTo(this.creditLimit) > 0) {
            System.out.println("Error: Charge exceeds credit limit. Transaction declined.");
        } else {
            this.balance = newBalance;
        }
        // Adds a charge to the balance if within the credit limit
    }

    public void payment(Money amount) {
        if (amount.compareTo(this.balance) > 0) {
            System.out.println("Error: Payment exceeds current balance.");
        } else {
            this.balance = this.balance.subtract(amount); // Subtract payment from balance
        }
    }
    // Deducts a payment amount from the balance
}