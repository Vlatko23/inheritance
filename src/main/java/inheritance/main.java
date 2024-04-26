package inheritance;


public class main {
    public static void main(String[] args) {
        KlasaB b = new KlasaB(); // Create object b - SUPERCLASS B
        System.out.println("b.x: " + b.returnIt()); // prints 2

        KlasaC c = new KlasaC(); // Create object c - SUBCLASS C
        System.out.println("c.x: " + c.returnIt()); // prints c.x 2

        b.triple(); // change the value of b.x *=3
        c.triple(); // change the value of c.x +=3

        System.out.println("b.x after b.triple(): " + b.returnIt()); // prints b.x =2*3 = 6
        System.out.println("c.x after c.triple(): " + c.returnIt()); // prints c.x =2+3 = 5
    }
}
