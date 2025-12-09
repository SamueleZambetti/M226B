package Ristorante;

public class Pasta implements MenuItem {
    private String name;
    private double price;
    private boolean isGlutenFree;

    public Pasta(String name, double price, boolean isGlutenFree) {
        this.name = name;
        this.price = price;
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public double calculatePrice() {
        if (isGlutenFree)
            return price * 1.1;
        return price;
    }

    @Override
    public String getDescription() {
        String descr = "Pasta " + name;
        if (isGlutenFree) descr += " (senza glutine)";
        return descr;
    }

    @Override
    public int getPreparationTime() {
        return 12;
    }

    public String getName() {
        return name;
    }
}
