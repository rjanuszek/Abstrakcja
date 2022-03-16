import model.computer.Computer;
import model.computer.Laptop;
import model.computer.PC;

public class MainApp {

    public static void main(String[] args) {

        Computer officeComputer1 = new PC("Office computer 1", "HP", 500, 128);
        Computer officeComputer2 = new PC("Office computer 2", "HP", 500, 128);
        Computer officeComputer3 = new PC("Office computer 3", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);
        Computer mackbook = new Laptop("MB PRO", "PRO", 500, 256, 100);

        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, gamingLaptop, mackbook};

        for (Computer computer : computers) {
            computer.switchOff();
        }


    }
}
