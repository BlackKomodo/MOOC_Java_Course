import java.util.ArrayList;
import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate plate = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(plate)) {
            finnish.add(plate);
        }
        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

       VehicleRegister owners = new VehicleRegister();
        owners.add(reg1, "Arto");
        owners.add(reg3, "Jürgen");

        owners.printRegistrationPlates();
        owners.printOwners();
        
        
    }
}
