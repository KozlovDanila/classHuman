import java.util.Arrays;
import java.util.GregorianCalendar;

public class app {

    public static void main(String[] args) {
        Human Kirill = new Human();
        Human Danila = new Human("Danila", 6162378, new GregorianCalendar(1996, 3, 23));
        Human Pasha = new Human("Pasha", 41621238, new GregorianCalendar(1995, 2, 21));
        Human Olga = new Human("Olga", 664178, new GregorianCalendar(1997, 11, 1));
        Human Masha = new Human("Masha", 416212738, new GregorianCalendar(1995, 2, 2));
        Human[] humanHouse = new Human[5];
        humanHouse[0] = Kirill;
        humanHouse[1] = Danila;
        humanHouse[2] = Olga;
        humanHouse[3] = Masha;
        humanHouse[4] = Pasha;

        sortByAge(humanHouse);
        print(humanHouse);

        sortByName(humanHouse);
        print(humanHouse);

    }

    public static void print(Human[] humanHouse) {
        for (Human numberHuman : humanHouse) {
            System.out.println(numberHuman.toString());
        }
    }

    public static void sortByName(Human[] humanHouse) {
        System.out.println("Sort by name");
        Arrays.sort(humanHouse, new ComparateOfName());
    }

    public static void sortByAge(Human[] humanHouse) {
        System.out.println("Sort by age");
        Arrays.sort(humanHouse);
    }

}
