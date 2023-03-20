class GroceryList {

    GroceryItemOrder[] groceries;
    int groceries_index;


    public GroceryList() {
        groceries = new GroceryItemOrder[10];
        groceries_index = 0;
    }


    public void add(GroceryItemOrder item) {
        this.groceries[groceries_index] = item;
        groceries_index++;
    }

    // Gets total cost of all groceries in the cart
    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < this.groceries_index; i++) {
            totalCost += this.groceries[i].getCost();
        }
        return totalCost;
    }

}

class GroceryItemOrder {
    String name;
    int quantity;
    double pricePerUnit;

    // Constructor
    public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
        this.quantity = quantity;
        this.name = name;
        this.pricePerUnit = pricePerUnit;
    }

    // Gets the cost of the grocery item order
    public double getCost() {
        return this.quantity * this.pricePerUnit;
    }

    // Sets/changes the quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}