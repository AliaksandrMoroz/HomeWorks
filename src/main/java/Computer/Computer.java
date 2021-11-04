package Computer;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Computer {
    private String processor;
    private int operative;
    private int hardDisk;
    private int maxResource;

    boolean power = false;
    int count=5;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(int processorValue) {
        if(processorValue==0){
            this.processor = "AMD";
        }else if(processorValue==1){
            this.processor = "RYZEN";
        }else {
            this.processor = "M1";
        }
    }

    public int getOperative() {
        return operative;
    }

    public void setOperative(int operative) {
        if(operative==0){
            this.operative =1024;
        }else if(operative==1){
            this.operative =2056;
        }
        else if(operative==2){
            this.operative =4128;
        }else if(operative==3){
            this.operative =8256;
        }else {
            this.operative =16512 ;
        }
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        if(hardDisk==0){
            this.hardDisk =100;
        }else if(hardDisk==1){
            this.hardDisk =200;
        }
        else if(hardDisk==2){
            this.hardDisk =400;
        }else if(hardDisk==3){
            this.hardDisk =800;
        }else {
            this.hardDisk =1600 ;
    }}

    public int getMaxResource() {
        return maxResource;
    }

    public void setMaxResource(int maxResource) {
        if(maxResource==0){
            this.maxResource =10;
        }else if(maxResource==1){
            this.maxResource =20;
        }
        else if(maxResource==2){
            this.maxResource =30;
        }else if(maxResource==3){
            this.maxResource =40;
        }else {
            this.maxResource =50 ;
        }}


    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", operative=" + operative +"mb"+
                ", hardDisk=" + hardDisk +"GB"+
                ", maxResource=" + maxResource +
                '}';
    }
    public void yourChoice(){
        System.out.println("Make your choice:\n" +
                            "1-Computer ON\n" +
                            "2-Computer OFF\n");
        Scanner scanner=new Scanner(System.in);
        String choice= new String(scanner.nextLine());
        if(choice.equals("1")&&power==false&&maxResource>0){
                int code= (int) (Math.random() * 2);
                System.out.println("Computer is loading...\n" +
                        "Errors code "+code);
                maxResource--;
                    if(code==0){
                    System.out.println("\n\nLoading is complete\n\n");
                    power=true;
                    yourChoice();
                    }else{
                    System.out.println("\n\nLoading is not complete\n\n");
                    yourChoice();
                    }
        }else if(choice.equals("2")&&power==true&&maxResource>0){
                int code= (int) (Math.random() * 2);
                System.out.println("Computer is shutting down...\n" +
                        "Errors code "+code);
                        maxResource--;
                    if(code==0){
                    System.out.println("\n\nBye bye\n\n");
                    power=false;
                    }else{
                    System.out.println("\n\nShutting down is not complete\n\n");
                    yourChoice();
                }
        }else if(maxResource<=0){
            computerOffErrors();
        } else
            System.out.println("Incorrect data entry, please try again");
            yourChoice();
        }


    public void computerOffErrors(){
        System.out.println("ERROR,ERROR,ERROR\nFire,Fire,Fire\n");
        try {
            if(count>0){
            TimeUnit.SECONDS.sleep(1);
            count--;
            computerOffErrors();}
            else {
            }System.exit(0);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
