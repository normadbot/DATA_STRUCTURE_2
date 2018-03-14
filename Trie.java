import java.lang.*;
import java.util.*;
class TrieNode{
	static final int ALPH_SIZE=26;
	TrieNode[] children = new TrieNode[ALPH_SIZE];
	boolean endOfWord;
	TrieNode(){
		endOfWord=false;
		for(int i=0;i<ALPH_SIZE;i++){
			children[i]=null;
		}
	}
}
public class Trie{
	static TrieNode root;
	
	void insert(String key){
			int level;
			int index;
			int length=key.length();
			TrieNode pcrawl= root;
			
			for(level=0;level<length;level++){
				index=key.charAt(level)-'a';
				if(pcrawl.children[index]==null){
					pcrawl.children[index]= new TrieNode();
				}
				pcrawl=pcrawl.children[index];				
			}
			pcrawl.endOfWord=true;
	}
	boolean search(String key){
		int level;
		int index;
		int length=key.length();
		TrieNode pcrawl=root;
		
		for(level=0;level<length;level++){
			index=key.charAt(level)-'a';
			if(pcrawl.children[index]==null)return false;
			
			pcrawl=pcrawl.children[index];
		}
		return (pcrawl!=null && pcrawl.endOfWord);
	}
	public static void main(String [] args){
		Trie a = new Trie();
		
		String keys[]={"the","a","there","answer","any","by","bye","there"};
		String output[]={"not Present in trie","Present in trie"};
		
		root= new TrieNode();
		for(int i=0;i<keys.length;i++){
			a.insert(keys[i]);
		}
		
		if(a.search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);
         
        if(a.search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);
         
        if(a.search("there") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);
         
        if(a.search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);
     
		//System.out.println(root.children[1]);;
		
	}
}
