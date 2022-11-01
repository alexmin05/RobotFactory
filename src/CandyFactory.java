public class CandyFactory {

    public String type;
    public int amount;
    public String flavor;
    public boolean kingsized;


    public CandyFactory(String pType, int pAmount, String pFlavor, boolean pKingsized){

        type = pType;
        amount = pAmount;
        flavor = pFlavor;
        kingsized = pKingsized;
    }



    public void printInfo(){
        System.out.println("The type of candy is " + type);
        System.out.println("There are " + amount + " pieces of candy");
        System.out.println("The flavor is " + flavor);
        System.out.println("Is the candy King Sized? " + kingsized );
    }
}
