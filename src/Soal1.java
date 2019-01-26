import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Soal1 {
    public static void main(String[] args) {
        Product();
    }

    public static void Product() {
        JSONObject product = new JSONObject();
        product.put("itemId", "12341822");
        product.put("itemName", "basic t-shirt");
        product.put("price", 70000);

        JSONArray availableColorAndSize = new JSONArray();

        JSONObject colorSize1 = new JSONObject();
        colorSize1.put("color", "red");
        JSONArray size1 = new JSONArray();
        size1.add("S");
        size1.add("M");
        size1.add("L");
        colorSize1.put("size", size1);

        JSONObject colorSize2 = new JSONObject();
        colorSize2.put("color", "solid black");
        JSONArray size2 = new JSONArray();
        size2.add("M");
        size2.add("L");

        availableColorAndSize.add(colorSize1);
        availableColorAndSize.add(colorSize2);

        product.put("availableColorAndSize", availableColorAndSize);
        product.put("freeShiping", false);

        System.out.println(product.toJSONString());
    }
}
