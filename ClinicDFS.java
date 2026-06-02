import java.util.*;

public class ClinicDFS {

    static Map<String, List<String>> graph = new HashMap<>();

    public static void dfs(String node, Set<String> visited) {

        if (visited.contains(node))
            return;

        visited.add(node);

        System.out.println(node);

        for (String neighbor : graph.get(node)) {
            dfs(neighbor, visited);
        }
    }

    public static void main(String[] args) {

        graph.put("Clinic",
                Arrays.asList("Registration", "Vaccination",
                        "Laboratory", "Pharmacy"));

        graph.put("Registration", new ArrayList<>());
        graph.put("Vaccination", new ArrayList<>());
        graph.put("Laboratory", new ArrayList<>());
        graph.put("Pharmacy", new ArrayList<>());

        System.out.println("DFS Traversal:");

        dfs("Clinic", new HashSet<>());
    }
}