import java.time.LocalDate;
import java.util.ArrayList;

public class President extends Politician implements Endorsements{
    public static final int TERM = 4;

    private ArrayList<String> bills;
    private ArrayList<Integer> votes;
   
    public President(String name, LocalDate birth, String residence, LocalDate swornin, boolean isOutOfOffice,
    ArrayList<String> bills, ArrayList<Integer> votes, String party) {
        super("White House", birth, residence, swornin, isOutOfOffice, party);
        this.bills = bills;
        this.votes = votes;
        //TODO Auto-generated constructor stub
    }

    public ArrayList<String> getBills() {
        return bills;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.getName() + " was born in " + super.getBirth() + ", and currently lives in " + super.getResidence() + ". " + 
        super.getName() + " was sworn in " + super.getSwornin() + " at the age of " + super.ageSwornInOffice() + "." + 
        super.getName() +  " "  + textConditionString() + ", and in total, " + super.getName() + " has " + super.getYearsOfExperience() + 
        " years of experience in politics.";
    }
    public String isBillSuccessful(int vote){
        String successfulBill = "";
            if(vote >= 50){
                successfulBill += " was successful";
            } else{
                successfulBill += " wasn't successful";
            }
            return successfulBill;
    }
    public void isSuccessfulBills(){
        for (int i = 0; i < this.bills.size(); i++) {
            System.out.println(this.bills.get(i) + " " + isBillSuccessful(this.votes.get(i)));
        }
    }

    @Override
    public void politicianEndorsements(ArrayList<String> politicians) {
        // TODO Auto-generated method stub
        System.out.println("These are the people who endorsed " + super.getName() + ":");
            for (String politician : politicians) {
                // TODO Auto-generated method stub
                System.out.println(politician);
            }
    }

    @Override
    public void peopleWhoThePoliticianEndorsed(ArrayList<String> politicians) {
        // TODO Auto-generated method stub
            System.out.println("These are the people who endorsed " + super.getName() + ":");
            for (String politician : politicians) {
                // TODO Auto-generated method stub
                System.out.println(politician);
            }
    }
    @Override
    public int numberOfElectionsWon() {
        // TODO Auto-generated method stub
        return super.getYearsOfExperience() / TERM;
    }
}
