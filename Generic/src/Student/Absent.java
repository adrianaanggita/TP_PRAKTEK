package Student;

import java.util.*;

public class Absent {
    /*generic method*/
    public static <X> ArrayList<X> toArrayList (X[] array) {
        int i;
        ArrayList<X> result = new ArrayList<X>();
        for (i = 0; i < array.length; i++) {
            result.add(array[i]);
        }
        return result;
    }
    /*generic wildcard*/
    public static void Print (ArrayList<Item<?, ?>> product) {
        for (Item<?,?> item:product) {
            System.out.println (item.getKey() + ". " +
                    item.getValue());
        }
    }

    public static void main (String[] args) {
        Integer[] product_code = {1, 2, 3, 4, 5};
        String[] product_name = {"Adriana Anggita Daeli", "Algi Fari",
                "Aqil Rahman", "Arsal Fadillah", "Azis Surohman"};

        ArrayList<Integer> code = toArrayList(product_code);
        ArrayList<String> name = toArrayList(product_name);

        Iterator<Integer> iterator_code = code.iterator();
        Iterator<String> iterator_name = name.iterator();

        ArrayList<Item<?, ?>> product = new ArrayList<>();

        while (iterator_code.hasNext() && iterator_name.hasNext()) {
            product.add(new Item<Integer,
                    String>(iterator_code.next(), iterator_name.next()));
        }
        Print((ArrayList< Item <?, ?>>)product);
    }
}
