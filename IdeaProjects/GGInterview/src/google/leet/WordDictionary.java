package google.leet;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by ann on 11/1/15.
 */
public class WordDictionary {
    class TrieNode {
        private TrieNode[] nodes;
        private boolean isLeaf;
        public TrieNode(){
            this.nodes = new TrieNode[26];
            this.isLeaf = false;
        }
    }

    public TrieNode root;

    public WordDictionary() {
        this.root = new TrieNode();
    }
    public void add(char[] word, int index, TrieNode parent) {
        if (word.length <= index) {
            parent.isLeaf = true;
            return;
        }
        char c = word[index];
        if (parent.nodes[c - 'a'] == null) {
            parent.nodes[c - 'a'] = new TrieNode();
        }
        parent = parent.nodes[c - 'a'];
        add(word, index + 1, parent);
    }

    // debug place:  search 函数的实现有问题!!
    public boolean search(char[] word, int index, TrieNode parent) {
        if (index >= word.length ) {
            return parent.isLeaf;
        }
        if (word[index] == '.') {
            for (TrieNode node : parent.nodes) {
                if(node != null && search(word, index + 1, node)) {
                    return true;
                }
            }
            // only at all possible solutions have been traversed, return false
            return false;
        }
        char c= word[index];

        if (parent.nodes[c - 'a'] == null) {
            return false;
        }
        return search(word, index + 1, parent.nodes[c - 'a']);




    }
    // Adds a word into the data structure.
    public void addWord(String word) {
        add(word.toCharArray(), 0, root);

    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return search(word.toCharArray(), 0, root);

    }

    public static void main(String[] args) {
         WordDictionary wordDictionary = new WordDictionary();
//         wordDictionary.addWord("word");
         wordDictionary.addWord("at");
         wordDictionary.addWord("and");
         wordDictionary.addWord("an");
         wordDictionary.addWord("add");
         System.out.print(wordDictionary.search("a"));
         System.out.print(wordDictionary.search(".at"));
         wordDictionary.addWord("bat");
        System.out.print(wordDictionary.search(".at"));
        System.out.print(wordDictionary.search("an."));
        System.out.print(wordDictionary.search("a.d."));
        System.out.print(wordDictionary.search("b."));
        System.out.print(wordDictionary.search("a.d"));
        System.out.print(wordDictionary.search("."));
//         System.out.println(wordDictionary.search(".ord"));
    }
}


// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");