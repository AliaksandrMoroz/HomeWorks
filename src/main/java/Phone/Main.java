package Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1=new Phone(12345,"Iphone 6s", 150);
        Phone phone2=new Phone(34567,"Iphone 7s", 123);
        Phone phone3=new Phone(98766,"Iphone 8", 234);

        System.out.println(phone1.toString()+"\n"+phone2.toString()+"\n"+phone3.toString()+"\n");
        phone1.receiveCall();
        phone2.receiveCall();
        phone3.receiveCall();
        System.out.println();
        System.out.println(phone1.getNumber()+"\n"+phone2.getNumber()+"\n"+ phone3.getNumber()+"\n");
        phone1.receiveCall(3747575,"Hanna");
        phone2.receiveCall(3987575,"Alex");
        phone3.receiveCall(3767575,"Kira");

        phone1.sendMessage(234234,23424234,234234234,213234535,5674533,435435);
    }
}
