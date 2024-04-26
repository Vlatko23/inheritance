package inheritance;

class KlasaB { // SUPERCLASS B
    int x = 2; // DATA MEMBER SUPERCLASS x = 2

    void triple() {
        x = x * 3; // method - multiply the value of x by 3
    }

    int returnIt() {
        return x; // method - return the value of DATA MEMBER x
    }
}