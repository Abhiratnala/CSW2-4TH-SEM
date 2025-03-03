import java.util.ArrayList;

public class q03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20); // Duplicate value
        list.add(40);

        System.out.println("Before removal: " + list);

        list.remove(Integer.valueOf(20)); // Removes first occurrence of 20

        System.out.println("After removal: " + list);
    }}