public class Equipment {
    private String name;
    private int capacity;
    private int cost;
    public Equipment (String n, int c, int cost){
        name = n;
        capacity = c;
        this.cost = cost;
    }
    public String getName(){
        return name;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getCost(){
        return cost;
    }
    public String toString(){
        return name + ", capacity: " + capacity;
    }
}
