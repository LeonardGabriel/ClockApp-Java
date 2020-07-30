import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.*;

public class Actions {

    public static final ArrayList<Integer> hours = new ArrayList<Integer>();
    public static final ArrayList<Integer> minutes = new ArrayList<Integer>();
    public static final String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    public static final String[] days = daysOfWeek;
    public static String repeat = "";
    public  static final Scanner scan = new Scanner(System.in);


    public static void showAlarms() {

        System.out.println("|--------Your Alarms-------|");
        System.out.print(hours);
        System.out.print(":");
        System.out.print(minutes);
        System.out.println(" on " + repeat);
        Interface.showMenu();


    }

    public static void addAlarm() {


        boolean match = false;

        System.out.println("|------------Add Alarm------------|");
        System.out.print("Do you want to add an alarm?[Y/N]: ");
        String choose = scan.nextLine();

        switch (choose) {
            case "n":
            case "N":
                Interface.showMenu();

            case "y":
            case "Y":
                System.out.print("Set your hour for your alarm: ");
                int chooseHour = scan.nextInt();

                System.out.print("Set your minutes for your alarm: ");
                int chooseMinute = scan.nextInt();

                System.out.print ("Repeat on: ");
                repeat = scan.next();
                for(String s : days){
                    if(repeat.contains(s)){
                        match = true;
                        System.out.println("Alarm saved for " + chooseHour + ":" + chooseMinute + " on " + repeat);
                        hours.add(chooseHour);
                        minutes.add(chooseMinute);

                        Interface.showMenu();
                    } else {
                        System.out.println("Please enter a valid day!");
                        Actions.addAlarm();
                    }
                }


        }
    }

        public static void deleteAlarm () {

            System.out.print("Are you sure you want to delete the alarms?[Y/N]: ");
            String choose = scan.next();

            switch (choose) {
                case "Y":
                case "y":
                    hours.clear();
                    minutes.clear();
                    repeat = "";
                    Interface.showMenu();

                case "N":
                case "n":
                    Interface.showMenu();

            }

        }

        public static void exit () {

        System.exit(0);

        }
    }

