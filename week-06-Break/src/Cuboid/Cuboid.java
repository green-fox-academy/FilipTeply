package Cuboid;

public class Cuboid {

    // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

    double length;
    double width;
    double height;
    //volume = length × width ×  height
    //surface = 2 * (length * width + width * height + height * length);

    public static void main(String[] args) {

        cuboidSurface(10, 10, 10);
        cuboidVolume(10, 10, 10);

    }

    public static void cuboidVolume(double length, double width, double height) {
        double v;
        v = length * width * height;

        System.out.println("Volume: " + (int) v);
    }


    public static void cuboidSurface(double length, double width, double height) {
        double s;
        s = 2. * (length * width + width * height + height * length);

        System.out.println("Surface Area: " + (int) s);
    }

}
