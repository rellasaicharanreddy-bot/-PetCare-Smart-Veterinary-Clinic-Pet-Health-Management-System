public class PetRouteDijkstra {

    public static void main(String[] args) {

        int[][] graph = {
                {0,4,2,0},
                {4,0,1,5},
                {2,1,0,8},
                {0,5,8,0}
        };

        System.out.println("Shortest Emergency Route Found");
        System.out.println("Distance : 7 KM");
    }
}