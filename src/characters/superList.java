package characters;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class superList {

    private ArrayList<String> supers;
    private String[][] multiSup;
    private String[][] triSup;
    private Scanner input = new Scanner(System.in);

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
                //[1,0] [1,1] [1,2] [1,3] [1,4] [1,5] [1,6] [1,7]

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

    public void surpriseSuperRoll(){
        int roll = (int)(Math.random()*3-1)+1;
        switch (roll) {
            case 1: {
                System.out.println("you could see a light shine from within..");
                int number = (int) (Math.random() * 15);
                System.out.println("the dice rolls, you got #" + number);
                this.supers.get(number);
                break;
            }
            case 2: {
                System.out.println("two lights have lit up from within..");
                int number1 = (int) (Math.random() * 7);
                int number2 = (int) (Math.random() * 7);
                System.out.println("the die roll, you get #" + number1 + " and #" + number2);
                String supers = this.multiSup[0][number1] + " and " + this.multiSup[1][number2];
                break;
            }
            case 3: {
                System.out.println("three scorching lights shine from within..");
                int number1 = (int) (Math.random() * 4);
                int number2 = (int) (Math.random() * 4);
                int number3 = (int) (Math.random() * 4);
                System.out.println("the die roll, you get #" + number1 + " and #" + number2 + " and #" + number3);
                String supers = this.triSup[0][number1] + ", " + this.triSup[1][number2] + " AND " + this.triSup[2][number3];
                break;
            }

            default:
                System.out.println("error, bad roll. trying again.");
                surpriseSuperRoll();

        }

    }
}

