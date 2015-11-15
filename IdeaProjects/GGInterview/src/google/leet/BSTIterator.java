package google.leet;

import java.util.Stack;

/**
 * Created by ann on 10/29/15.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
public class BSTIterator {

    private Stack<TreeNode> stack;

    public BSTIterator (TreeNode root) {
        stack = new Stack<TreeNode>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    /**
     *
     * @return whether we still have a next small number
     */
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return the next smallest number in bst
     */
    public int next(){
        TreeNode node = stack.pop();
        int res = node.val;
        if (node.right != null) {
            TreeNode cur = node.right;
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
        }
        return res;

    }
}
