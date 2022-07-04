package characters;
import java.util.Random;
import java.util.random.*;
import java.util.Scanner;

public class currentChild {
    private String supers;
    private String supers2;
    private String supers3;
    private String name;
    private String gender;
    private Scanner scan = new Scanner(System.in);


    public currentChild() {
        setGender();
        setName();

        this.supers=supers;
        this.supers2= supers2;
        this.supers3= supers3;

        confirm();
        System.out.println("if you read this, the baby making process was successful!");
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender() {
        int roll = fiftyfifty();
        if(roll==1){
            this.gender="M";
        } else if(roll==2){
            this.gender="F";
        }
    }
    private int fiftyfifty(){
        Random rand = new Random();
        int roll= rand.nextInt(2)+1;
        return roll;
    }

    public String getName(){
        return this.name;
    }
    public void setName(){
        System.out.print("please, tell us the name of your newborn ");
        if (getGender().equalsIgnoreCase("m")){
            System.out.println("boy?");
        } else System.out.println("girl?");
        this.name= scan.next();
    }

    public void confirm(){
        System.out.print("here before you rests a ");
        if (getGender().equalsIgnoreCase("M")){
            System.out.print("male");
        } else if (getGender().equalsIgnoreCase("F")){
            System.out.print("female");
        }
        System.out.print(" baby named "+ getName()+"\n do you approve of them? type in Y/N\n");
        if(scan.next().equalsIgnoreCase("n")){
            System.out.println("you do not approve of this child. are you sure?\n");
            if (scan.next().equalsIgnoreCase("y")){
                System.out.println("you hid this baby in a dumpster..");
                currentChild child = new currentChild();
            } else confirm();
        }

    }


}

