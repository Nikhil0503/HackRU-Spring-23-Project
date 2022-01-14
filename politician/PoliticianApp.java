import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;
import javax.swing.text.DateFormatter;

public class PoliticianApp {
    public static void main(String[] args) {
            //Welcome to Politician. It is an app that is designed to pick/discover your own politicians.
            System.out.println("Welcome to Politician."  + 
            "This app is designed to pick/discover your own politicians by inputting attributes." +  
            "You can search up anything about the politician if necessary.");
            //Ask the user for name using scanner for user input. Say hello name!
            Scanner userInput = new Scanner(System.in);
            System.out.print("What is your name: ");
            String usersName = userInput.next();
            while(!(usersName.length() > 1) || (isValidName(usersName) == false)){
                System.out.println("Invalid input. Enter another name.");
                usersName = userInput.next();
            }

            System.out.println("Hello " + usersName + "!");
            System.out.println();
            //Give a description about the app below once you entered the name.
            System.out.println("In the politician app, there is various information that you can find out based on inputting the qualities of the politician." + 
            " The world may be filled with disinformation, especially throughout these troubled times. Now, I will make sure your inputs will be valid or not." + 
            " This app is to educate people about the people who serve or have served Congress and/or the White House.");

            //Find out how many politicians you will choose by telling the user to input a number.
            System.out.println("Enter the number of politicians that you want.");
            int numberOfPoliticians = userInput.nextInt();
            if(numberOfPoliticians > 2){
                System.out.println("You will get " + numberOfPoliticians + " politicians.");
            }else if(numberOfPoliticians == 1){
                System.out.println("You will get " + numberOfPoliticians + " politician.");
            } else{
                while (numberOfPoliticians <= 0) {
                    System.out.println("Invalid number. Enter a different number.");
                    numberOfPoliticians = userInput.nextInt();
                }
            }
            //Create a HashMap that has all the types of politicians(Pres,Sec,Judge,Sen,Rep)
            Map<Integer, String> politicianObjects = new HashMap<>();
            politicianObjects.put(1, "President");
            politicianObjects.put(2, "Secretary");
            politicianObjects.put(3, "Supreme Court Judge");
            politicianObjects.put(4, "Senator");
            politicianObjects.put(5, "Representative");
            //Create an array and for each object store it in the array.
            Politician[] chosenPoliticians = new Politician[numberOfPoliticians];
            //Loop through the number of times the user requested to.
            for (int i = 0; i < chosenPoliticians.length; i++) {
                System.out.println("Enter an option(1-5).");
                int index = 0;
                for (String politician:politicianObjects.values()) {
                    System.out.println((index + 1) + ": " + politician);
                    index++;
                }
                int type = userInput.nextInt(5) + 1;
                if (type == 1) {
                    System.out.println("You chose a " + politicianObjects.get(1) +
                    "A president consists of name, birth, etc. Enter each attribute.");

                    System.out.println("Enter the president's name: ");
                    String nameOfPolitician = userInput.next();
                    System.out.println();

                    System.out.println("Enter the president's date of birth. But enter it MM-DD-yyyy format.");
                    System.out.println("Enter the year the president was born.");
                    int yearOfBorn = userInput.nextInt();
                    System.out.println("Enter the month the president was born.");
                    int monthOfBorn = userInput.nextInt();
                    System.out.println("Enter the day of the month the president was born.");
                    int dayOfMonth = userInput.nextInt();
                    LocalDate date = LocalDate.of(yearOfBorn, monthOfBorn, dayOfMonth);
                    System.out.println("The president was born in " + date.format(DateTimeFormatter.ofPattern("MM-DD-yyyy")));
                    System.out.println();

                    System.out.println("Enter the president's residence.");
                    String residence = userInput.next();
                    System.out.println();

                    System.out.println("Enter the date the president was sworn in using the MM-DD-yyyy format.");
                    System.out.println("Enter the year the president was born.");
                    yearOfBorn = userInput.nextInt();
                    System.out.println("Enter the month the president was born.");
                    monthOfBorn = userInput.nextInt();
                    System.out.println("Enter the day of the month the president was born.");
                    dayOfMonth = userInput.nextInt();
                    date = LocalDate.of(yearOfBorn, monthOfBorn, dayOfMonth);
                    System.out.println("The president was sworn into office on " + date.format(DateTimeFormatter.ofPattern("MM-DD-yyyy")));
                    System.out.println();

                    System.out.println("Is the president out of office?");
                    boolean isOutOfOffice = userInput.nextBoolean();
                    if(isOutOfOffice == false){
                        residence = "White House";
                    }
                    System.out.println();

                    System.out.println("Enter a number of bills that the president signed: ");
                    int numOfBills = userInput.nextInt();
                    List<String> billsPresident = new ArrayList<>();
                    System.out.println(numOfBills + " of " + nameOfPolitician + " bills.");
                    System.out.println("Enter some bills. ");
                    for (int j = 0; j < billsPresident.size(); j++) {
                        String bill = args[i];
                        billsPresident.add(bill);
                    }
                } 
            }
            //Tell the user to choose a number from 1-5 to pick one of the options below.
            //Choose that type by looping through the array to create a bullet point list.(Try using streams)
            //Get the user input.
            //Importing qualities(For each attribute, type this: ).
            //Use those attributes to create object(s). Store those objects.
            //If it's the same exact politician(same properties), then enter a different politician. 
        }
        public static boolean isValidName(String name){
            boolean isValid = true;
            for (int i = 0; i < name.length(); i++) {
                switch (name.charAt(i)){
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '!':
                    case '@':
                    case '#':
                    case '$':
                    case '%':
                    case '^':
                    case '&':
                    case '*':
                    case '(':
                    case ')':
                    case '_':
                    case '-':
                    case '+':
                    case '=':
                    case '{':
                    case '}':
                    case '[':
                    case ']':
                    case '|':
                        isValid = false;
                        break;
                    default:
                        isValid = true;
                }
                if (isValid == false) {
                    break;
                }
            }
            return isValid;
        }
}
