
public class CreditCard {
    private Money balance; // Creates a balance object with the use of money object
    private Money creditLimit; // Creates a creditLimit object with the use of money object
    private Person owner; // Creates an owner object with the use of person object

public CreditCard(Money creditLimit, Person owner) {
    this.creditLimit = creditLimit;
    this.owner = owner;
    this.balance = new Money(0); // Creates money object with an initial value of 0
    // Constructor method, automatically called when "new" is written to create an object
}

}