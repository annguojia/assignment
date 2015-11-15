package google.leet;

/**
 * Created by ann on 11/1/15.
 */
public class Trie1 {
    private TrieNode1 root;

    public Trie1() {
        this.root = new TrieNode1();
    }
    public void insert(String word) {
        TrieNode1 parent = this.root;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode1 child = parent.nodes[c - 'a'];

            if (child == null ) {
                child = new TrieNode1();
                parent.nodes[c - 'a'] = child;
            }
            parent = child;
        }
        parent.isWord = true;

    }
    public boolean search(String word) {

        return true;
    }

    public boolean startWith(String prefix) {
        return true;

    }
}
