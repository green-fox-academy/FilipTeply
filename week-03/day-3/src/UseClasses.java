 class Usable {
    String status;
    public Usable() {
        status = "I'm not used at all";
    }

    public void use() {
        status = "Now, I was used at least once.";
        System.out.println(status);
    }
}

public class UseClasses {
    public static void main(String[] args) {
        Usable firstUsable = new Usable();
        firstUsable.use();
    }
}



