import java.util.ArrayList;
import java.util.List;

public class ColorListDemo {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");

        System.out.println("Initial List of Colors: " + colorList);

        colorList.add("Purple");
        System.out.println("List after adding 'Purple': " + colorList);

        colorList.remove("Green");
        System.out.println("List after removing 'Green': " + colorList);

        colorList.remove(2);
        System.out.println("List after removing color at index 2: " + colorList);
    }
}
