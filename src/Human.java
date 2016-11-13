public class Human {
    String name;
    int id;
    int birth[] = new int[3];

    public Human() {
        name = "";
        id = 0;
        for (int i = 0; i < birth.length; i++) {
            birth[i] = 0;
        }
    }

    public Human(String name, int id, int[] birth) {
        this.name = name;
        this.id = id;
        for (int i = 0; i < this.birth.length; i++) {
            this.birth[i] = birth[i];
        }
    }

    public boolean checkMore(Human other) {

        return  true;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", birth=" + birth[0] + "." + birth[1] + "." + birth[2] +
                '}';
    }
}
