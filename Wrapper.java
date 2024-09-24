//4) Shows the use of various wrapper classes , converting an object into primitive . 
public class Wrapper {
    // A Wrapper class in Java is a class whose object wraps or contains primitive 
    //data types. When we create an object to a wrapper class, it contains a field 
    // and in this field, we can store primitive data types.
    public static void main(String[] args) {
        // converting primitive to objects
        Integer intObj = 10;
        Double dblObj = 13.9;
        boolean boolobj = false;

        // converting obj into primitive data types
        int intprimitive = intObj;
        double doublePrimitive = dblObj;
        boolean boolprimitive  = true;
        System.out.println("Name : Komal Paul , Roll Number : 226902");
        System.out.println("Integer object "+ intObj);
        System.out.println("Double object  "+ dblObj);
        System.out.println("String object  "+ boolobj);
        
        System.out.println("\nConverting to primitive types");
        System.out.println("Primitive int: " + intprimitive);
        System.out.println("Primitive double: " + doublePrimitive);
        System.out.println("Primitive String: " + boolprimitive);
    }
}
