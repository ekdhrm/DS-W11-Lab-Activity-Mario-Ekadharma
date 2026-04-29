package ds.w11;

// Part E
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


// Kelas untuk merepresentasikan setiap node pada General Tree
class TreeNode {
    String data;
    List<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        // Menggunakan ArrayList untuk menyimpan anak-anak secara berurutan (kiri ke
        // kanan)
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }
}

public class LeafTraversal {

    // Method algoritma penelusuran (Breadth-First Search)
    public static void printLeavesLeftToRight(TreeNode node) {
        // Base case: jika node kosong, berhenti
        if (node == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        // Lakukan traversal BFS hingga queue kosong
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            // Kondisi Leaf: Jika node tidak memiliki anak (children kosong)
            if (current.children.isEmpty()) {
                System.out.print(current.data + " ");
            } else {
                // Jika memiliki anak, tambahkan semua anak ke queue dari kiri ke kanan
                for (TreeNode child : current.children) {
                    queue.add(child);
                }
            }
        }
    }

    public static void main(String[] args) {
        // 1. Membuat semua node sesuai Figure 1
        TreeNode A = new TreeNode("A");
        TreeNode B = new TreeNode("B");
        TreeNode C = new TreeNode("C");
        TreeNode D = new TreeNode("D");
        TreeNode E = new TreeNode("E");
        TreeNode F = new TreeNode("F");
        TreeNode G = new TreeNode("G");
        // TreeNode H = new TreeNode("H");
        // TreeNode I = new TreeNode("I");
        // TreeNode J = new TreeNode("J");
        // TreeNode K = new TreeNode("K");
        // TreeNode L = new TreeNode("L");
        // TreeNode M = new TreeNode("M");
        // TreeNode N = new TreeNode("N");

        // 2. Membangun struktur pohon (menyambungkan orang tua dan anak)
        // Level 1
        // A.addChild(B);
        // A.addChild(C);
        // A.addChild(D);

        // // Cabang B
        // B.addChild(E);
        // B.addChild(F);
        // E.addChild(G);

        // // Cabang C
        // C.addChild(H);
        // H.addChild(I);
        // H.addChild(J);

        // // Cabang D
        // D.addChild(K);
        // D.addChild(L);
        // D.addChild(M);
        // M.addChild(N);
        B.addChild(C);
        B.addChild(F);
        B.addChild(D);

        C.addChild(G);
        C.addChild(E);

        D.addChild(A);

        // 3. Menjalankan Traversal
        System.out.println("Hasil penelusuran leaf nodes dari kiri ke kanan dan menurut level:");
        printLeavesLeftToRight(B);
        // Output yang diharapkan: G F I J K L N
    }
}