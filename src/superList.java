import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class superList {
    private ArrayList<String> supers;
    private String[][] multiSup;
    private String[][] triSup;
    private Scanner input = new Scanner(System.in);
    public String chosenSups;
    public String childName;
    public String childGender;

    public superList(){
        this.supers = new ArrayList<>();
        supers.add("Tail");
        supers.add("Heal");
        supers.add("invincibility");
        supers.add("Strength");
        supers.add("Speed");
        supers.add("Intelligence");
        supers.add("Eye lasers");
        supers.add("Control Explosions");
        supers.add("Control Fire");
        supers.add("Change Gravity");
        supers.add("Invisibility");
        supers.add("Teleporting");
        supers.add("Adaptive");
        supers.add("Poison Touch/resistance");
        supers.add("Thermal Touch/resistance");
        supers.add("Emotion touch/resistance");

        this.multiSup = new String[][]{
                //[0,0] [0,1] [0,2] [0,3] [0,4] [0,5] [0,6] [0,7]
                //[1,1] [1,1] [1,2] [1,3] [1,4] [1,5] [1,6] [1,7]

                {"Tail", "Heal", "invincibility", "Strength", "Speed", "Intelligence", "Eye lasers", "Control Explosions"},
                {"Control Fire", "Change Gravity", "Invisibility", "Teleporting", "Adaptive", "Poison Touch/resistance", "Thermal Touch/resistance", "Emotion touch/resistance"}
};

        this.triSup= new String[][]{
                //[0,0] [0,1] [0,2] [0,3] [0,4]
                //[1,0] [1,1] [1,2] [1,3] [1,4]
                //[2,0] [2,1] [2,2] [2,3] [2,4]

                {"Intelligence","Heal","invincibility","Strength","Speed"},
                {"Tail","Eye lasers","Control Explosions","Control Fire","Change Gravity"},
                {"Invisibility","Teleporting","Adaptive","Poison Touch/resistance","Thermal Touch/resistance"}
};
        // Emotion touch/resistance is the falloff of choice...
        //hindsight i didn't have to make three lists. but i wanted to. will refactor later

    this.chosenSups= "";
    this.childName= "";
    this.childGender= "";

    }

    public void showList() {
        System.out.println("here is the list of supers, your child can obtain one from each list, or one from any list: ");
        for (String[] row: triSup
        ) {
            System.out.println("+------------------------------------------------------------------+");

            for (String aSuper: row){System.out.print(aSuper + " | ");}
            System.out.print("\n");
        }
        System.out.println("+------------------------------------------------------------------+");
    }

    public String ChosenSuper(){
        System.out.println("please enter if you'd like: 1 for 1 super, 2 for 2 supers, or 3 for 3 supers at once!");
        System.out.println("You: ");
        String toConsole= input.next();

        switch (toConsole) {
            case("1"):{
                int number = (int)(Math.random()*16);
                System.out.println("the dice rolls, you got #"+number);
                this.chosenSups = this.supers.get(number);
                return this.chosenSups;
            }

            case("2"):{
                int number1 = (int)(Math.random()*8);
                int number2 = (int)(Math.random()*8);
                System.out.println("the die roll, you get #"+number1+" and #"+number2);
                return this.multiSup[0][number1] + " and " + this.multiSup[1][number2];
            }

            case("3"):{
                int number1 = (int)(Math.random()*5);
                int number2 = (int)(Math.random()*5);
                int number3 = (int)(Math.random()*5);
                System.out.println("the die roll, you get #"+number1+" and #"+number2+" and #"+number3);
                this.chosenSups = this.triSup[0][number1] + ", " + this.triSup[1][number2] + " AND " + this.triSup[2][number3];
                return this.chosenSups;
            }
            case("0"):{
                showList();
                ChosenSuper();
                break;
            }
            default:
                System.out.println("not an option. please try again.");
                ChosenSuper();
        }

        return null;
    }

    public String getChildName(){
        return this.childName;
    }
    public void setChildName(String name){
        this.childName = name;
    }

    public String getGender(){
        return this.childGender;
    }
    public void setGender(){
        System.out.println("please type \"M\" for a boy and \"F\" for a girl. \nYou:");
        String gender = input.next();
        if(gender.equalsIgnoreCase("M")){
            this.childGender = "M";
        } else if(gender.equalsIgnoreCase("F")){
            this.childGender = "F";
        } else {
            System.out.println("sorry, it's not that game isn't progressive, i just didnt have time right now to set multiple genders please for now pick boy or girl ");
            setGender();
        }

    }

}

