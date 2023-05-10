import java.util.Scanner;
public class Main implements Runnable{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main obj = new Main();
        Thread marketThread = new Thread(obj);
        marketThread.start();
        Beaver test = new Beaver(10,98);
        System.out.println(test.getBeaverPrice(10));
        Market market = new Market(1);
        int i = 0;
        System.out.print("Input 1 to see current price: ");
        while (i != -1){
            i = scan.nextInt();
            if (i == 1){
                System.out.println(Market.getPrice());
            }
        }

    }
    public void run(){
        double newPrice = 1;
        while (newPrice > 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            newPrice = Math.random();
            Market.setPrice(newPrice);
        }
    }
}
