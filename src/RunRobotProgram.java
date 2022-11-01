public class RunRobotProgram {

    public static void main(String[] args) {
        RunRobotProgram runRobot = new RunRobotProgram();
    }

    public RunRobotProgram() {
        CandyFactory Jolly_Ranchers;
        Jolly_Ranchers = new CandyFactory("Jolly Ranchers", 13, "Cherry", false);
        Jolly_Ranchers.printInfo();

        CandyFactory Hersheys;
        Hersheys = new CandyFactory("Hersheys", 2, "Chocolate", true);
        Hersheys.printInfo();
    }
}
