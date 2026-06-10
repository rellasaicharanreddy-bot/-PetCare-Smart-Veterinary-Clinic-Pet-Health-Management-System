import java.util.Arrays;

public class PetMergeSort {

    public static void main(String[] args) {

        int[] records = {105,101,108,103,102};

        Arrays.sort(records);

        System.out.println("Sorted Pet Records");

        for(int record : records){
            System.out.print(record + " ");
        }
    }
}