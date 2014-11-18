/** 
 * �߶������� 
 * ���⣺��֪�߶�[2,5] [4,6] [0,7]�����2,4,7�ֱ�����˶��ٴ� 
 * ���´��뽨�����߶��������������棬������Ҷ�ӽ������[i,i] 
 */  


package segmentTree;
import segmentTree.SegmentTree;

public class test {
	
	public static void main(String[] args) {  
        SegmentTree tree = new SegmentTree(0, 7);  
        int[][] segments = {  
                {2, 5},   
                {4, 6},   
                {0, 7}  
        };  
        int[] targets = {2, 4, 7};  
        for (int i = 0, len = segments.length; i < len; i++) {  
            int[] segment = segments[i];  
            tree.insert(segment[0], segment[1]);  
        }  
        for(int target : targets) {  
            System.out.println(target + ":" + tree.caculateExistingTimes(target));  
        }  
    }  
	

}
