
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Soal1 {
    public static void main(String[] args) {
        Product product = TShirt();

        Gson gson = new Gson();

        String json = gson.toJson(product);
        System.out.println(json);
    }

    private static Product TShirt() {
        Product product = new Product();
        product.setItemId("12341822");
        product.setItemName("basic t-shirt");
        product.setPrice(70000);

        ColorSize colorSize1 = new ColorSize();
        colorSize1.setColor("red");
        List<String> size1 = new ArrayList<>();
        size1.add("S");
        size1.add("M");
        size1.add("L");
        colorSize1.setSize(size1);

        ColorSize colorSize2 = new ColorSize();
        colorSize2.setColor("solid black");
        List<String> size2 = new ArrayList<>();
        size2.add("M");
        size2.add("L");
        colorSize2.setSize(size2);

        List<ColorSize> colorSizes = new ArrayList<>();
        colorSizes.add(colorSize1);
        colorSizes.add(colorSize1);
        product.setAvailableColorAndSize(colorSizes);

        product.setFreeShiping(false);

        return product;
    }
}

class Product {
    private String itemId;
    private String itemName;
    private int price;
    private List<ColorSize> availableColorAndSize;
    private boolean freeShiping;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<ColorSize> getAvailableColorAndSize() {
        return availableColorAndSize;
    }

    public void setAvailableColorAndSize(List<ColorSize> availableColorAndSize) {
        this.availableColorAndSize = availableColorAndSize;
    }

    public boolean isFreeShiping() {
        return freeShiping;
    }

    public void setFreeShiping(boolean freeShiping) {
        this.freeShiping = freeShiping;
    }
}

class ColorSize {
    private String color;
    private List<String> size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getSize() {
        return size;
    }

    public void setSize(List<String> size) {
        this.size = size;
    }
}
