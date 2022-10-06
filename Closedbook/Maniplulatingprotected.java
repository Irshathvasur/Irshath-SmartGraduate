package Practicecodes.Java.Closedbook;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Maniplulatingprotected {
    public static void main(String[] args) {
        privatemem obj=new privatemem();
        try{
        Class access=obj.getClass();
        Field field=access.getDeclaredField("pr");
        field.setAccessible(true);
        System.out.println(field.get(obj));

        Method method=access.getDeclaredMethod("method");
        method.setAccessible(true);
        method.invoke(obj);
        }catch(Exception e) {
			e.printStackTrace();
		}
        
    }
}

class privatemem{
    private int pr=10;

    private void method(){
        System.out.println(pr);
    }
}
