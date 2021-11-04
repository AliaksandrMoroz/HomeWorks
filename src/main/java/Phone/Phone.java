package Phone;

public class Phone {
    private int number;
    private String model;
    private int weight;

    void receiveCall(){
        System.out.println("Calling Hanna");
    }
    void receiveCall(int number, String name){
        System.out.println("Calling "+name+"\n"+number);
    }
    void sendMessage(int ... arg){
        for (int el:
             arg) {
            System.out.println("Message "+el);
        }
    }

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
