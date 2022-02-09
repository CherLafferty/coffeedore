import java.util.ArrayList;

public class Order {

    // Set Member Variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    // CONSTRUCTOR
    public Order(){
        this.name = "guest";
        this.ready = false;
    }

    // CONSTRUCTOR OVERLOAD
    public Order(String name){
        this.name = name;
        this.ready = false;
    }

    //METHODS
    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage() {
        if(this.ready == true){
            return "Your order is ready.";
        } else {
            return "Than you for waiting. Your order will be ready soon.";
        }
    }

    public double getORderTotal(){
        double total = 0;
        for(Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.printf("Customer Name: %4", this.name);
        for(Item i: this.items){
            System.out.println(i.getName() + " $" + i.getPrice());
        }
        System.out.println("Total: $" + this.getORderTotal());
    }

    // GETTERS & SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getReady(){
        return this. ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }










}
