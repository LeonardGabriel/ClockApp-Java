import java.util.Scanner;

public class Interface {

    public static void showGreetings(){

        System.out.println("|---------------------------|");
        System.out.println("|----Welcome to ClockApp----|");

    }

    public static void showMenu(){

        Scanner scan = new Scanner(System.in);

        System.out.println("|---------------------------|");
        System.out.println("|1. Show Alarms             |");
        System.out.println("|2. Add Alarm               |");
        System.out.println("|3. Delete Alarms           |");
        System.out.println("|4. Exit                    |");
        System.out.println("|---------------------------|");
        System.out.println();

        System.out.print("Enter you choice: ");
        int chooseMenu = scan.nextInt();

        switch (chooseMenu){
            case 1:
                Actions.showAlarms();
            case 2:
                Actions.addAlarm();
            case 3:
                Actions.deleteAlarm();
            case 4:
                Actions.exit();
        }

    }

}
