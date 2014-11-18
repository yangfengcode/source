package segmentTree;

public class SegmentTree {
	
	private class Segment {  
        int left;  
        int right;  
        int count;  
        Segment leftChild;  
        Segment rightChild;  
    }  
	
	
	private Segment root;  
    
    public SegmentTree (int left, int right) {  
        root = new Segment();  
        build(root, left, right);  
    }  
      
    public void insert(int left, int right) {  
        insert(root, left, right);  
    }  
      
    public int caculateExistingTimes(int target) {  
        return caculateExistingTimes(root, target);  
    }  
      
    //�Ӹ��ڵ㿪ʼ����Ҷ�ӽ��[target, target]���Ծ����Ľڵ��count���  
    private int caculateExistingTimes(Segment root, int target) {  
        int result = 0;  
        while( root.left != root.right) {  
            int rootMid = root.left + (root.right - root.left) / 2;  
            result += root.count;  
            if (target <= rootMid) {  
                root = root.leftChild;  
            } else if (target > rootMid) {  
                root = root.rightChild;  
            }  
        }  
        return result;  
    }  
     
    private void build(Segment root, int left, int right) {  
        root.left = left;  
        root.right = right;  
        if (left != right) {  
            int mid = left + (right - left) / 2;  
            root.leftChild = new Segment();  
            root.rightChild = new Segment();  
            build(root.leftChild, left, mid);  
            build(root.rightChild, mid + 1, right);  
        }  
    }  
      
    private void insert(Segment root, int left, int right) {  
          
        int rootLeft = root.left;  
        int rootRight = root.right;  
        int rootMid = rootLeft + (rootRight - rootLeft) / 2;  
          
        //ƥ�䣬���ִ�����1  
        if (left == rootLeft && right == rootRight) {  
            root.count++;  
            return;  
        }  
          
        if (right <= rootMid) {  
            insert(root.leftChild, left, right);  
        } else if (left > rootMid){  
            insert(root.rightChild, left, right);  
        } else {  
            insert(root.leftChild, left, rootMid);  
            insert(root.rightChild, rootMid + 1, right);  
        }  
    }  
	

}
