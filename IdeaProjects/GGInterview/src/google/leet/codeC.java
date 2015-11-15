package google.leet;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ann on 11/2/15.
 */

public class codeC {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            return sb.toString();
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                sb.append(node.val).append(' ');
            } else {
                sb.append("n ");
            }

            queue.offer(node.left);
            queue.offer(node.right);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 0) {
            return null;
        }
        String[] dchar = data.split(" ");
        TreeNode root = new TreeNode(Integer.valueOf(dchar[0]));
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int i = 1;
        while (i < dchar.length) {
            TreeNode parent = queue.poll();
            String left = dchar[i++];
            String right = dchar[i++];
            if (left.equals("n")) {
                parent.left = new TreeNode(Integer.valueOf(left));
                queue.offer(parent.left);
            }
            if (right.equals("n")) {
                parent.right = new TreeNode(Integer.valueOf(right));
                queue.offer(parent.right);
            }

        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));