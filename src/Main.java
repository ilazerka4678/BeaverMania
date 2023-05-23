import java.util.Scanner;
public class Main implements Runnable{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main obj = new Main();
        Thread marketThread = new Thread(obj);
        marketThread.start();
        Market market = new Market(1);
        GUI gui = new GUI();
    }

    public void run(){
        double newPrice = 1;
        while (newPrice > 0){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            newPrice = Math.random() * 4;
            Market.setPrice(newPrice);
        }
    }
}
