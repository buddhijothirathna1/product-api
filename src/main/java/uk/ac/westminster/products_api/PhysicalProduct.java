package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it inherits shared product attributes while adding physical shipping data.
// A ShoppingCart is an example of a HAS-A relationship (Composition) because a cart contains products, it is not a product itself.
public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;


    public PhysicalProduct() {
    }


    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        // MUST be the first statement: delegates id, name, and price to the parent Product class
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }


    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
