package TaskManual.Task27;

public class MaestroCard extends BankCardAccount implements TransferToCard {

    @Override
    public void transferMoney() {
        System.out.println("Transfer money only MasterCard...");
    }
}
