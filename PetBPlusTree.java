import java.util.ArrayList;

public class PetBPlusTree {

    public static void main(String[] args) {

        ArrayList<Integer> records = new ArrayList<>();

        records.add(101);
        records.add(102);
        records.add(103);
        records.add(104);

        System.out.println("Veterinary Database Indexed");

        for(Integer id : records) {
            System.out.println("Pet ID : " + id);
        }
    }
}