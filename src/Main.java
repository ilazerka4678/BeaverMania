import java.util.Scanner;
public class Main implements Runnable{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main obj = new Main();
        Thread marketThread = new Thread(obj);
        marketThread.start();
        Market market = new Market(1);
        System.out.println("Welcome to Beaver Frontier!");
        System.out.print("Please enter your name here: ");
        //if name is recognized from the save file, load user

        Player player = new Player(scan.nextLine());
        System.out.println("-----------");
        System.out.println("You arrive at a French fort in the North American Northwest frontier. \n     Your goal is to hunt beavers and get as rich as possible. \n                  Good luck out there, " + player.getName());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void run(){
        double newPrice = 1;
        while (newPrice > 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            newPrice = Math.random() * 4;
            Market.setPrice(newPrice);
        }
    }
}
