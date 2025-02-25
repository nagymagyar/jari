import java.time.LocalDate;
import java.util.ArrayList;

public class Sumdata {

    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    LocalDate date= LocalDate.parse("2026-04-04");
    Vehicle vehic = new Vehicle("ABC-123",
        "Honda",
        2018,
        "Benzin",
        450.0,
        true,
        LocalDate.parse("2026-04-04")
        );

    vehicleList.add(vehic);
    

    
}
