package trieTree;
import trieTree.TrieTreeNode;

public class TrieTree {
	
    //�ֵ����Ĳ���͹���  
    public void createTrie(TrieTreeNode node,String str){  
        if (str==null||str.length()==0) {  
            return;  
        }  
        char[] letters=str.toCharArray();  
        for (int i = 0; i < letters.length; i++) {  
            int pos = letters[i] - 'a';    
            if (node.child[pos] == null) {    
                node.child[pos] = new TrieTreeNode();     
            }else {  
                node.child[pos].nCount++;  
            }  
            node.ch=letters[i];              
            node = node.child[pos];              
        }  
    }  
    //�ֵ����Ĳ���  
    public int findCount(TrieTreeNode node,String str){  
        if (str==null||str.length()==0) {  
            return -1;  
        }  
        char[] letters=str.toCharArray();  
        for (int i = 0; i < letters.length; i++) {  
            int pos = letters[i] - 'a';    
            if (node.child[pos] == null) {    
                return 0;     
            }else {  
                node=node.child[pos];  
            }             
        }  
        return node.nCount;  
    }  

}
