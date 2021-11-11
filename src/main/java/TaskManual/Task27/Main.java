package TaskManual.Task27;

//Создать иерархию классов, описывающих банковские карточки.
// Иерархия должна иметь хотя бы три уровня.

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.assignPersonalAccount();
        creditCard.loanIssued();
        creditCard.transferMoney();

        System.out.println();

        CashBackCard cashBackCard = new CashBackCard();
        cashBackCard.assignPersonalAccount();
        cashBackCard.transferMoney();
        cashBackCard.ReturnCashBack();


    }
}
