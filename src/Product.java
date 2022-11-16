public class Product {
    private String type;
    private double cost;
    private double weight;

    public Product(String type, double cost, double weight) {
        if (type != null && !type.isBlank())
            this.type = type;
        if (cost > 0)
            this.cost = cost;
        if (weight > 0)
            this.weight = weight;
    }

    public Product(String type) {
        this(type, 0, 0);
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }
}
