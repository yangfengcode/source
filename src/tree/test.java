package tree;

import tree.BinaryTree.TreeNode;
import tree.BinaryTree;

public class test {
	
	public static void main(String[] args) {  
		  
	    BinaryTree tree = new BinaryTree();  

	    TreeNode node = tree.init();  

	    // ���������������������  

	    System.out.println("**************************");  

	    System.out.println("���������������������");  

	    tree.xianIterator(node);  

	    System.out.println("");  

	    // ���������������������  

	    System.out.println("**************************");  

	    System.out.println("���������������������");  

	    tree.zhongIterator(node);  

	    System.out.println("");  

	    // ����������������������  

	    System.out.println("**************************");  

	    System.out.println("���������������������");  

	    tree.houIterator(node);  

	}  	

}
