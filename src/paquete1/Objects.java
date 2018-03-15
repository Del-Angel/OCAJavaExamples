package paquete1;

public class Objects {
    Objects obj;
    int ax;
    String s;
    Integer i;
    public static void main(String[] args) {
        Objects o1 = new Objects();
        Objects o2 = new Objects();
        //System.out.println("o :" + o.i);
        o1.obj = o2;
        o2.obj = o1;
        //o = o2;
        //o2 = o;
        //o1 = null;
        o2 = null;
        //System.out.println(o1.obj.obj.obj.obj);
        /*o = null;
        System.gc();
        Runtime.getRuntime().gc();*/
        System.out.println(o1.suma(new Integer(1), new Integer((int)Long.parseLong(String.valueOf(new Double("12.3").longValue()))).intValue()));
    }
    public int suma(int a, int b){
        System.out.println("primer suma");
        return a + b;
    }
    private int suma(int a, Integer b){
        System.out.println("segunda suma");
        return a + b;
    }
    public int suma(Integer a, int b){
        System.out.println("tercer suma");
        return a + b;        
    }
    public int suma(Integer a, Integer b){
        System.out.println("cuarta suma");
        return a + b;
    }
    
}
