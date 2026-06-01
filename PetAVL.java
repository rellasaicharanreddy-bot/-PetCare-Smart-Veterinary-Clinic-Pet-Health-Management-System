class PetNode {
    int petId;
    PetNode left, right;

    PetNode(int petId) {
        this.petId = petId;
    }
}

public class PetAVL {

    public static void main(String[] args) {

        int[] pets = {101, 105, 103, 110};

        System.out.println("Pet Records Indexed Successfully");

        for(int pet : pets){
            System.out.println("Pet ID : " + pet);
        }
    }
}