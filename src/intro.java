import characters.superList;

import java.util.Scanner;

public class intro {
    private Scanner input = new Scanner(System.in);
    private String toGame="";
    private String pronoun1;
    private String pronoun2;

    public intro() {
        superList Supers = new superList();
        System.out.println("welcome to my prototype! this game will be a \"parent sim\" in which you have a one day superhero (or villain!) in your care!");
        System.out.println("for the purpose of this prototype, i will not activate the chance of multiple supers, you get to decide!");

        while (!toGame.equalsIgnoreCase("y")) {
            //System.out.println(Supers.ChosenSuper());
            System.out.print("are you happy with this choice? Y/N\nYou:\n");
            toGame=input.next();
        }
        System.out.println("then lets begin the prototype..");

        System.out.println(
                        "/-\\  |    | |--\\   ___ |-\\   |\\    |    /\\    _____ |    | |-\\     /\\     |                                     \n" +
                        "\\    |    | |   | |    |  |  | \\   |   /  \\     |   |    | |  |   /  \\    |                                     \n" +
                        " \\   |    | |--/  |--- | /   |  \\  |  /----\\    |   |    | | /   /----\\   |                                      \n" +
                        "\\ -/  \\ -/  |     |___ | \\   |   \\ | /      \\   |    \\ -/  | \\  /      \\  |____                                      \n"
        );

        System.out.println("\n Your child has been born! in this game you wont know his/her powers until you experience it with them, you will be given scenarios where the answer is black and white.\n and there will be scenarios out of your control because your kid will learn from you and their enviroment to make their own decisions, after all, you are not your kid...");
        System.out.println("is it a boy or a girl?\n");

       /* if(){
            System.out.println("It's a boy! Congratulations");
             pronoun1 = "his";
             pronoun2 = "he";
        } else {
            System.out.println("A Girl! Congratulations!");
             pronoun1 = "her";
             pronoun2 = "she";
        }*/
        System.out.println("what is "+pronoun1+" name?\n You:");


        System.out.println("but this game can remember what you input. to prove it, I shall reveal "+"'s super-power(s) \n"); //Supers.chosenSups);
        System.out.println("may "+pronoun2+ " save the world, or doom us all..");


    }

}
