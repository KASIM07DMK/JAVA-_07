public class Box {
    double width;
    double height;
    double depth;

    // Constructor used when all dimensions are specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions are specified
    Box() {
        width = height = depth = 0; // default values
    }

    // Constructor used when a cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // Compute and return the volume
    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Create boxes using the various constructors
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);

        // Get and print the volumes of the boxes
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);

        vol = myBox3.volume();
        System.out.println("Volume of myBox3 is " + vol);
    }
}

