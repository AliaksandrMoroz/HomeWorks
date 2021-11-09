package ATM;

public class Person {
    private String name;
    private int cardNumber;
    private int pin;
    private int balance;

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    public Person(String name, int cardNumber, int pin, int balance) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
    }
}
