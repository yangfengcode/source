package reflect;
import java.lang.reflect.Field;
import reflect.User;

public class test {
	
	public static void main(String[] args)throws Exception {
        Class cls = Class.forName("reflect.User");
        Object obj = cls.newInstance();       //����User�Ķ���
        Field f = cls.getDeclaredField("test");    //��ȡtest����
        f.setAccessible(true);                    //��˽������test�ķ���Ȩ��
        f.set(obj, "zhangsan");                    //Ϊtest���¸���
        System.out.println(f.get(obj));            //��ȡobj��test����ֵ
        //���ݷ�����execute��ȡ����
        java.lang.reflect.Method m = cls.getMethod("execute", String.class, int.class);
        m.invoke(obj, "dennisit",23);            //����execute����
    }
	

}
