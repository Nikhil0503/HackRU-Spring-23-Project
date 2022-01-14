import java.time.LocalDate;

public class SupremeCourtJudge extends Secretary{

    private int votesIn;
    public SupremeCourtJudge(String name, LocalDate birth, String residence, LocalDate swornin, boolean isOutOfOffice, int votesIn, String party) {
        super(name, birth, residence, swornin, isOutOfOffice, votesIn, party);
        System.out.println("Supreme Court Justices serve for life.");
        //TODO Auto-generated constructor stub
    }
    @Override
    public StringBuilder conditionVotes() {
        StringBuilder condition = new StringBuilder();
        if(!(this.votesIn >= 50 && this.votesIn <= 100)) {
            condition.append("Invalid input. You need 50 to confirm a secretary to office.");
        }
        //If 85-100, unanimous among both parties.
        if(this.votesIn >= 85 && this.votesIn <= 100){
            condition.append("The confirmation was very unanimous among both parties.");
        } else if(this.votesIn >= 70 && this.votesIn < 85){
            condition.append("Most senators confirmed together.");
        } else if(this.votesIn >= 60 && this.votesIn < 70){
            condition.append("For this secretary, there was a fine confirmation.");
        } 
        else if(this.votesIn >= 55 && this.votesIn < 60){
            condition.append("Fortunately, still a safe confirmation.");
        } else if(this.votesIn >= 70 && this.votesIn < 85){
            condition.append("This secretary got lucky by some crucial votes.");
        } 
        return condition;
    }
    
    public void getBeliefs(String[] beliefs){
        System.out.println("This is what " + super.getName() + " believes in.");
        for (String belief : beliefs) {
            System.out.println("- " + belief);
        }
    }
    
}
