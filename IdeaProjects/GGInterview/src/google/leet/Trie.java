package google.leet;

import java.util.HashMap;

/**
 * Created by ann on 11/1/15.
 */
// this is a trie tree
public class Trie {


    public TrieNode root;

    public Trie() {
        root = new TrieNode();

    }

    public void insert(String word) {
        HashMap<Character, TrieNode> children = root.children;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            TrieNode t;
            if (children.containsKey(c)) {
                t = children.get(c);
            } else {
                t = new TrieNode(c);
                children.put(c, t);
            }

            children = t.children;
            if (i == word.length() - 1) {
                t.isLeaf = true;
            }
        }

    }
    public boolean search(String word) {
        HashMap<Character, TrieNode> children = root.children;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            TrieNode t;
            if (children.containsKey(c)) {
                t = children.get(c);
            } else {
                return false;
            }
            children = t.children;
            if (i == word.length() - 1 && t.isLeaf == true) {
                return true;
            }
        }

        return false;
    }

    public boolean startsWith(String prefix) {
        HashMap<Character, TrieNode> children = root.children;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);

            TrieNode t;
            if (children.containsKey(c)) {
                t = children.get(c);
            } else {
                return false;
            }

            children = t.children;
        }
        return true;
    }


    public static void main(String[] args) {
        Trie trieTree = new Trie();
        trieTree.insert("abc");
        trieTree.insert("b");
        System.out.println(trieTree.search("bc"));
        System.out.println(trieTree.startsWith("bz"));


    }
}
// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");