package ds.w11;

// Part F
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    String data;
    List<Node> children;

    public Node(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        this.children.add(child);
    }
}

public class BFSTreeversal {
    Node root;

    // 2. Fungsi untuk mencetak node pada level tertentu
    void printNodesAtLevel(Node root, int targetLevel) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int currentLevel = 0;

        // BFS traversal
        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            // Jika kita mencapai level target, cetak semua node di queue
            if (currentLevel == targetLevel) {
                System.out.print("Node pada level " + targetLevel + ": ");
                for (int i = 0; i < levelSize; i++) {
                    Node node = queue.poll();
                    System.out.print(node.data + " ");
                }
                System.out.println();
                return; // Selesai
            }

            // Jika belum mencapai level target, proses anak-anaknya
            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                for (Node child : node.children) {
                    queue.add(child);
                }
            }
            currentLevel++;
        }
    }

    public static void main(String[] args) {
        BFSTreeversal tree = new BFSTreeversal();
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");

        B.addChild(C);
        B.addChild(F);
        B.addChild(D);
        B.addChild(G);
        B.addChild(E);
        D.addChild(A);

        tree.root = B; // Set the root to node B

        tree.printNodesAtLevel(tree.root, 1);
    }
}
