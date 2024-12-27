/*
Program to demonstrate ClassNotFoundException
*/

public class ClassNotFoundExpDemo
{
    public static void main(String args[]){
        Class c;

        try{
            c = Class.forName("TestClass");
        }catch(ClassNotFoundException e){
            System.out.println("Class not found");
            e.printStackTrace();
        }
    }
}

/*
Class not found
java.lang.ClassNotFoundException: TestClass
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Class.java:391)
        at java.base/java.lang.Class.forName(Class.java:382)
        at ClassNotFoundExpDemo.main(ClassNotFoundExpDemo.java:7)
*/