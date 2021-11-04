package Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.setHardDisk((int) (Math.random() * 5));
        computer.setMaxResource((int) (Math.random() * 1));
        computer.setOperative((int) (Math.random() * 5));
        computer.setProcessor((int) (Math.random() * 3));
        System.out.println(computer.toString());
        computer.yourChoice();


    }
}
