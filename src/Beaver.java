public class Beaver {
    private double weight;
    private int furQuality;
    private String beaverType;

    public Beaver(double w, int f, String b){
        weight = w;
        furQuality = f;
        beaverType = b;
    }
    public Beaver(double w, int f){
        weight = w;
        furQuality = f;
        beaverType = "regular beaver";
    }
    public Beaver(double w, int f, int t){
        weight = w;
        furQuality = f;
        beaverType = "regular beaver";
        if (t == 1){
            beaverType = "fish beaver";
        }
        if (t == 2 || t == 3){
            beaverType = "regular beaver";
        }
        if (t == 4){
            beaverType = "penguin beaver";
        }
    }

    public int getBeaverPrice(double pricePerKilo){
        return (int)(weight * (pricePerKilo) * (furQuality/100.0));
    }
    public int getFurQuality(){
        return furQuality;
    }
    public String getBeaverType(){
        return beaverType;
    }
    public double getWeight(){
        return weight;
    }

}
