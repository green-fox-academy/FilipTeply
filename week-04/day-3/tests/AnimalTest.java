import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal1 = new Animal("beast", 100, 70);
    Animal animal2 = new Animal();
    //int[] arrHungerThirst = new int[2];

    @Test
    public void whatDefaultHunger() {
        assertEquals(50, animal2.hunger);
    }

    @Test
    public void whatHunger() {
        assertEquals(100, animal1.hunger);
    }
//    @Test
//    public void whatHunger(){
//        assertEquals(50,animal1.hunger);
//    }

    @Test
    public void doesDefaultAnimalEat() {
        assertEquals(49, animal2.eat());
        System.out.println(animal2.hunger);
    }

    @Test
    public void doesDefaultAnimalEatPortions() {
        //System.out.println(animal2.thirst);
        assertEquals(47, animal2.eatPortions(3));
        //System.out.println(animal2.thirst);
    }


    @Test
    public void doesDefaultAnimalDrink() {
        //System.out.println(animal2.thirst);
        assertEquals(49, animal2.drink());
        //System.out.println(animal2.thirst);
    }

    @Test
    public void doesDefaultAnimalPlayAndGetHungry() {
        //System.out.println(animal2.thirst);
        int[] arrHungerThirst = new int[2];
        arrHungerThirst = animal2.play();
        assertEquals(51, arrHungerThirst[0]);
        assertEquals(51, arrHungerThirst[1]);
        //System.out.println(animal2.thirst);
    }

}


///
