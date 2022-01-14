import java.time.LocalDate;
import java.time.ZoneId;

public class ZoneIds {
    public static void main(String[] args) {
        for (String zoneID : ZoneId.getAvailableZoneIds()) {
            System.out.println(zoneID);
        }
    }
}
