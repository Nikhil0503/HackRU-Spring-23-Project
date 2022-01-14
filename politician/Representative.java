import java.time.LocalDate;

public class Representative extends Senator{
    public static final int TERM = 2;
    private String districtRepresented;

    public Representative(String name, LocalDate birth, String residence, LocalDate swornin, boolean isOutOfOffice,
            String districtRepresented, String party) {
        super(name, birth, residence, swornin, isOutOfOffice, districtRepresented, party);
        //TODO Auto-generated constructor stub
    }

    public String secretaryMeeting(Secretary secretary, String condition){
        if(("The meeting with " + secretary.getName() + " was proper and organized.").contains(condition)){
            condition = super.getName() + " favors " + secretary.getName();
        }

        if(("The meeting with " + secretary.getName() + " had some arguments but some agreements.").contains(condition)){
            condition = super.getName() + " somewhat agreees " + secretary.getName();
        }

        if(("The meeting with " + secretary.getName() + " was filled with arguments.").contains(condition)){
            condition = super.getName() + " doesn't favor " + secretary.getName();
        }
    return condition;
    }
}