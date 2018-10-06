//Create Counter class
//which has an integer field value
//                when creating it should have a default value 0 or we can specify it when creating
//        we can add(number) to this counter another whole number
//        or we can add() without parameters just increasing the counter's value by one
//        and we can get() the current value
//        also we can reset() the value to the initial value
//        Check if everything is working fine with the proper test
//
// ???    Download CounterTest.java and place it next to your solution
//        If something's red in it, ALT+Enter Add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
//        Then run the tests with the green play button before the lines (run all of them before
//          the classname)

public class Counter {

    int field = 0;

    public Counter() {
    }

    public Counter(int field) {
        this.field = field;
    }

    public int add() {
        this.field++;
        return this.field;
    }

    public int add(int number) {
        this.field += number;
        return this.field;
    }


    public int get() {
        return this.field;
    }


    public static void main(String[] args) {

        Counter counter1 = new Counter();
        System.out.println(counter1);
        System.out.println(counter1.field);

        System.out.println(counter1.add());
        System.out.println(counter1.get());
//        System.out.println(counter1.add());
//        System.out.println(counter1.get());
        System.out.println(counter1.add() + counter1.add(2));
        System.out.println(counter1.field);
        System.out.println(counter1.get());
        //?? why sout(counter1.add() + counter1.add(2)) prints 6
        // why the last sout(counter1.field) gives 4?
    }
}



