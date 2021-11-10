package ATM;


import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CashMachine {
    private int totalCash;

    private int bill_10_dollar;
    private int bill_20_dollar;
    private int bill_50_dollar;
    private int bill_100_dollar;

    private List<Person> people;
    int count=0;


    @Override
    public String toString() {
        return "Available cash: " +
                "\n bill 10 dollar=" + bill_10_dollar +
                "\n bill 20 dollar=" + bill_20_dollar +
                "\n bill 50 dollar=" + bill_50_dollar +
                "\n bill 100 dollar=" + bill_100_dollar +
                "\n totalCash=" + totalCash
                ;
    }

    public CashMachine(int bill_10_dollar,int bill_20_dollar, int bill_50_dollar, int bill_100_dollar) {
        this.bill_10_dollar = bill_10_dollar;
        this.bill_20_dollar = bill_20_dollar;
        this.bill_50_dollar = bill_50_dollar;
        this.bill_100_dollar = bill_100_dollar;
        setTotalCash((bill_10_dollar*10)+(bill_20_dollar*20)+(bill_100_dollar*100)+(bill_50_dollar*50));


    }
    public void setTotalCash(int totalCash) {
        this.totalCash += totalCash;
    }

    public void cashReplenishment(int bill_10_dollar,int bill_20_dollar, int bill_50_dollar, int bill_100_dollar){
        this.bill_20_dollar+=bill_20_dollar;
        this.bill_10_dollar+=bill_10_dollar;
        this.bill_50_dollar+=bill_50_dollar;
        this.bill_100_dollar+=bill_100_dollar;
        setTotalCash((bill_10_dollar*10)+(bill_20_dollar*20)+(bill_100_dollar*100)+(bill_50_dollar*50));


    }
    public void cashWithdrawal(int bill_10_dollar,int bill_20_dollar, int bill_50_dollar, int bill_100_dollar){
        this.bill_10_dollar-=bill_10_dollar;
        this.bill_20_dollar-=bill_20_dollar;
        this.bill_50_dollar-=bill_50_dollar;
        this.bill_100_dollar-=bill_100_dollar;
        setTotalCash(-((bill_10_dollar*10)+(bill_20_dollar*20)+(bill_100_dollar*100)+(bill_50_dollar*50)));
    }
    public void startMenu(List<Person> personList){
        this.people=personList;
        System.out.println("Please enter your card.");

            int personCartNumber = userInput();
            identification(personCartNumber);
    }
    public int userInput(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int input = scanner.nextInt();
            return input;
        }else{
            System.out.println("Incorrect data entered, please try again.");
            scanner.nextLine();
            }return userInput();
    }
    public  void identification(int personCartNumber){

        for (int i = 0; i <people.size(); i++) {
            if(personCartNumber==people.get(i).getCardNumber()){
                System.out.println("Enter your PIN");

                    int personPin = userInput();
                    if(personPin==people.get(i).getPin()){
                        System.out.println("Welcome "+people.get(i).getName());
                        operationMenu(people.get(i));
                    }else{
                        count++;
                        if(count<3){
                            System.out.println("Wrong pin, try again");
                            identification(personCartNumber);
                        }else {
                            System.out.println("The card is blocked, contact the bank.");
                            people.remove(i);
                            count=0;
                            startMenu(people);

                        }
                    }
            }
        }
        System.out.println("This card was not found.\nPlease try again"+"\n");
        startMenu(people);
    }
    public void operationMenu(Person person) {
        System.out.println("Entered your operation:\n" +
                "1.View balance.\n" +
                "2.Windraw cash.\n" +
                "3.Deposit cash.\n" +
                "4.Return card.");

            int personChose = userInput();
            if(personChose>0&&personChose<5){
            operationCase(person,personChose);
            }else {
                System.out.println("Operation failed, please try again\n\n");
                operationMenu(person);
            }
    }
    public void operationCase(Person person,int personChose){
        switch (personChose){
        case 1:
        System.out.println("Your balance: "+ person.getBalance()+" dollars\n\n");
        operationMenu(person);
        break;
        case 2:
            System.out.println("How much do you want to withdraw?\n\n\n" +
                    "0-return to main menu");

                int personWindraw = userInput();
                if(personWindraw>0&&personWindraw<=this.totalCash&&personWindraw<=person.getBalance()){
                    System.out.println("Take your money, please.\n\n");
                    person.setBalance(-personWindraw);
                    this.totalCash-=personWindraw;
                    checkingTheAmountOfCash();
                    operationMenu(person);
                }else if(personWindraw>this.totalCash){
                    System.out.println("Not enough cash, try again");
                    System.out.println(toString());
                    operationCase(person,personChose);
                }else if(personWindraw>person.getBalance()){
                    System.out.println("There are not enough funds on your card\n" +
                            "Please, try again. ");
                    operationCase(person,personChose);
                }else if (personWindraw==0){
                    operationMenu(person);
                }else {
                    System.out.println("Incorrect data entered, please, try again.");
                    operationCase(person,personChose);
                }
        case 3:
            System.out.println("Put bills in the bill acceptor\n\n");

                int personDeposit= userInput();
                if(personDeposit>0){
                cashReplenishment((((personDeposit%100)%50)%20)/10,((personDeposit%100)%50)/20,(personDeposit%100)/50,personDeposit/100);
                person.setBalance(personDeposit);
                System.out.println("Operation complite.\n");
                System.out.println(toString());
                operationMenu(person);
                }else {
                    operationCase(person,personChose);
                }

        default:
            System.out.println("Good luck!\n" +
                    "Take your card, please!\n\n");
            startMenu(people);
        }
    }
    public void checkingTheAmountOfCash(){
        if(this.totalCash<500){
            try{
            System.out.println("Incasation...");
                TimeUnit.SECONDS.sleep(2);
            System.out.println("Incasation...");
                TimeUnit.SECONDS.sleep(2);
            System.out.println("Incasation...\n\n");
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e ){}
        cashReplenishment((int)(Math.random()*20),(int)(Math.random()*20),(int)(Math.random()*20),(int)(Math.random()*20));
            System.out.println(toString());
        }else {

        }

    }
}
