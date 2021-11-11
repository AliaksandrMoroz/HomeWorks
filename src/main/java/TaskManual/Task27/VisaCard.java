package TaskManual.Task27;

public class VisaCard extends BankCardAccount implements TransferToCard {
    @Override
    public void transferMoney() {
        System.out.println("Transfer money only Visa card...");
    }
}
