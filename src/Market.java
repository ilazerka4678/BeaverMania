public class Market {
    private static double price;
    public Market(double p){
        price = p;
    }
    public static void setPrice(double p){
        price = p;
    }
    public static double getPrice(){
        return price;
    }
}
