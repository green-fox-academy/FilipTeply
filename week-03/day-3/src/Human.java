
public class Human {
    String name;
    int age;
    int iq;

    public Human() {
        this("unkown", 0, 0);
    }

    public Human(String name, int age, int iq) {
        this.name = name;
        this.age = age;
        this.iq = iq;
    }

    public boolean isSmart() {
        return (iq > 100);
    }

    public boolean isNameless() {
        return (this.name.equals("unkown") || this.name.equals(""));
    }

    public void beSmarter() {
        this.iq += 20;
    }

    public static void main(String[] args) {
        Human human = new Human();
        Human human2 = new Human("Laci", 18, 110);

        human.name = "Hector";
        human.age = 1;
        human.iq = 90;

        human.beSmarter();


        if (human.isSmart()) {
            System.out.println(human.name + " is smart, with iq: " + human.iq);
        }

        System.out.println(human.isNameless());
        System.out.println(human.name);
        System.out.println(human.iq);
        human.beSmarter();
        System.out.println(human.iq);
        System.out.println(human.isSmart());
        human.beSmarter();
        System.out.println(human.iq);


    }
}