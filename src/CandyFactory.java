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
        if(kingsized == true){
            System.out.println("The candy is King Sized");
        }
        else{
            System.out.println("The candy sadly is not King Sized");
        }
    }
}
