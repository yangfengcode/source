package reflect;

class emo{  
    //other codes...  
}  

public class newclassobj_1 {
	
	 public static void main(String[] args) {  
	        Class<?> demo1=null;  
	        Class<?> demo2=null;  
	        Class<?> demo3=null;  
	        try{  
	            //һ�㾡������������ʽ  
	            demo1=Class.forName("reflect.emo");  
	        }catch(Exception e){  
	            e.printStackTrace();  
	        }  
	        demo2=new emo().getClass();  
	        demo3=emo.class;  
	           
	        System.out.println("������   "+demo1.getName());  
	        System.out.println("������   "+demo2.getName());  
	        System.out.println("������   "+demo3.getName());  
	           
	    }  
	

}
