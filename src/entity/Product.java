package entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Product {
        private int number, id;
        private String name, description;
        private double price;
    @Override
    public String toString() {
        return "Product{" +
                "id=" + (id+1) +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
