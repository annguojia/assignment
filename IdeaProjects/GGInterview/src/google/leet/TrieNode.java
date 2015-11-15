package google.leet;

import java.util.HashMap;

/**
 * Created by ann on 11/1/15.
 */
public class TrieNode {
    char c;
    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    boolean isLeaf;

    public TrieNode() { }
    public TrieNode(char c) {
        this.c = c;
    }

}

