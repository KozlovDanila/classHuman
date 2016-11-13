import java.util.GregorianCalendar;

public class Human implements Comparable<Human> {

    private String name;
    private int id;
    private GregorianCalendar birth;

    public Human() {
        name = "";
        id = 0;
        birth = new GregorianCalendar(0, 0, 0);
    }

    public Human(String name, int id, GregorianCalendar birth) {
        this.name = name;
        this.id = id;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public GregorianCalendar getBirth() {
        return birth;
    }

    @Override
    public int compareTo(Human other) {
        if (this.equals(other)) {
            return 0;
        }
        int valueOfCompare = this.getBirth().compareTo(other.getBirth());
        if (valueOfCompare == 0) {
            valueOfCompare = this.getId() - other.getId();
        }
        return valueOfCompare / Math.abs(valueOfCompare);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (id != human.id) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        return birth != null ? birth.equals(human.birth) : human.birth == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + (birth != null ? birth.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", birth=" + birth.getTime() +
                '}';
    }
}
