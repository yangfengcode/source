package trieTree;

public class TrieTreeNode {
	final int MAX_SIZE=26; 
	int nCount;//��¼���ַ����ִ���  
    char ch; //��¼���ַ�  
    TrieTreeNode[] child;  
      
    public TrieTreeNode() {  
        nCount=1;  
        child=new TrieTreeNode[MAX_SIZE];  
    }  

}
