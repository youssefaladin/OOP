public class Main {
    public static void main(String[] args) {
        System.out.println("Creating GroceryList");
        GroceryList g = new GroceryList();

        System.out.println("Creating new GroceryItemOrder");
        GroceryItemOrder go = new GroceryItemOrder("beans", 2, 3.75);

        System.out.println("Changing the quantity to 3");
        go.setQuantity( 3 );

        System.out.println("The total cost should be 11.25.  It is actually: "
                + go.getCost() );

        System.out.println("Adding GroceryItemOrder to GroceryList");
        g.add( go );

        System.out.println("Create another GroceryItemOrder and adding it");
        GroceryItemOrder go2 = new GroceryItemOrder("peas", 4, 2.30);
        g.add( go2 );

        System.out.println("The total cost of groceries should be 20.45.  It "
                + "is actually: " + g.getTotalCost() );
    }
}