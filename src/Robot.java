public class Robot {

    // variable decorations
    public char size;
    public int red;
    public int green;
    public int blue;
    public String shape;

    // constructor method
    public Robot(){
        size = 's';
        red = 200;
        green = 10;
        blue = 180;
    }

    // printInfo method
    public void printInfo(){
        System.out.println("The robot is size " + size);
        System.out.println("The robot is shape " + shape);
        System.out.println("The robot is color " + red);
    }
}
