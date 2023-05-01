public class Laptop {

    public String brand;
    public String model;
    public String color;
    public int price;
    public boolean availability;

    public Laptop (String brand, String model, String color, int price, boolean availability) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return String.format("Laptop (brand: %s, model: %s, color: %s, price: %d, availability: %s",
                brand, model, color, price, availability);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != this.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return laptop.brand.equals(this.brand) && laptop.model.equals(this.model) && laptop.color.equals(this.color) &&
                laptop.price == this.price && laptop.availability == this.availability;
    }
    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0: brand.hashCode());
        result = prime + result + price / 1000;
        result = prime + result + ((model == null) ? 0: model.hashCode());
        return result;
    }
}
