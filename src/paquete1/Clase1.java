package paquete1;

//Comentario de una linea
import java.util.ArrayList;
import static java.lang.Math.PI;
import java.util.Date;
/*
    Esto es un 
    comentario de 
    muchas líneas
*/
import java.util.function.Predicate;

/*otro comentario*/ class/*comentario*/ Clase1{
    protected static byte b = (byte)9; //8 bits
    public short identificador; //16 bits
    int i; //32 bits
    long l; //64 bits
    float f;
    double d;
    boolean bool;
    char c;
    String string;
    Integer in;
    Date date = new Date();
    
    static public void main(String[] lksdnflsndfkjsnfkjsbdlfnfd){
        System.out.println(PI);        
    }
    
    public void metodo(){
        System.out.println(b);
    }
}
class A{
    short s = new Clase1().identificador;
}
class B{}
class C{
    private interface In{}
}
 interface Clase{}
interface J{}
interface K{
    interface L{}
    class Cl{}
}