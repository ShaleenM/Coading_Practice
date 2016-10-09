package Trees;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mathurs on 10/9/16.
 */
public class Trie {

    public TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word){
        if(word == null || word.length() == 0)
            return;
        TrieNode node = root;
        for(int i = 0 ; i < word.length() ; i++){
            if(node.getChildrens().get(word.charAt(i)) == null){
                TrieNode newNode = new TrieNode();
                node.getChildrens().put(word.charAt(i) , newNode);

                node = newNode;
            }
            else{
                node = node.getChildrens().get(word.charAt(i));
            }
        }
        node.setEndOfWord(true);
    }

    public boolean search(String word){

        if(word == null || word.length() == 0)
            return false;

        TrieNode node = root;

        for(int i = 0 ; i < word.length() ; i++){
            if(node.getChildrens().get(word.charAt(i)) == null)
                return false;
            else
                node = node.getChildrens().get(word.charAt(i));

        }

        return node.isEndOfWord();

    }

    public void delete(String word){
        if(search(word))
            delete(word, 0, root);
        else
            System.out.println("Word not found");
    }

    private boolean delete(String word, int index , TrieNode currentNode){
        if(index == word.length()){
            if (!currentNode.isEndOfWord())
                return false;

            currentNode.setEndOfWord(false);

            return currentNode.getChildrens().size() == 0;
        }

        boolean canDeleteChild = delete(word, index+1, currentNode.getChildrens().get(word.charAt(index)));

        if(canDeleteChild) {
            currentNode.getChildrens().remove(word.charAt(index));
            return currentNode.getChildrens().size() == 0;
        }
        else
            return false;
    }
}

class TrieNode{
    Map<Character, TrieNode> childrens;
    boolean endOfWord;

    public TrieNode() {
        childrens = new HashMap<Character, TrieNode>();
        endOfWord = false;
    }

    public Map<Character, TrieNode> getChildrens() {
        return childrens;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }
}
