import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(1, "mouse"));
        items.add(new Item(2, "keyboard"));
        items.add(new Item(3, "hedphones"));
        items.add(new Item(4, "phone"));
        items.add(new Item(5, "AirPods"));
        items.add(new Item(6, "speakers"));

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }
        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : items) {
            itemMap.put(item.getId(), item.getName());
        }
        for (HashMap.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }
    }
}