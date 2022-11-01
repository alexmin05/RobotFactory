public class HatFactory {

    public char size;
    public int red;
    public int green;
    public int blue;
    public String color;
    public String team;

    public HatFactory(char pSize, int pRed, int pGreen, int pBlue, String pColor, String pTeam){
        size = pSize;
        red = pRed;
        green = pGreen;
        blue = pBlue;
        color = pColor;
        team = pTeam;
    }



    public void printInfo(){
        System.out.println("The robot is size " + size);
        System.out.println("The robot is shape " + team);
        System.out.println("The robot is color " + color );
    }
}
