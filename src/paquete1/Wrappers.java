package paquete1;

public class Wrappers {
    public static void main(String[] args) {
        Byte b;
        Short s;
        Integer i;
        Long l;
        Double d;
        Float f;
        Boolean bool;
        Character c;
        
        d = 10.9;
        d = new Double("111.111");
        i = 127;
        Integer integer = new Integer("12");
        l = 10L;
        Long Long = 10L;
        System.out.println("referencias iguales: " + (i == integer)); //Compara referencias (direcciones de memoria)
        System.out.println("iguales: " + (i.equals(integer))); //Compara el contenido
        
        Character character = 127;
        c = 126;
        System.out.println("char iguales (referencia): " + (c == character));
        System.out.println("char iguales:(contenido) " + (c.equals(character)));
        
        f = 12.9F;
        //float flo = 12.3;
        Float fl = 12.3F;
        fl = f;
        System.out.println("float iguales (referencia): " + (f == fl));
        System.out.println("float iguales:(contenido) " + (f.equals(fl)));
        String a = "Erika";
        String x = new String("Erika");
        System.out.println(a == x);
        System.out.println(a.equals(x));
        
        System.out.println(integer.floatValue());
        System.out.println(f.intValue());
        System.out.println(c.charValue());
        
        bool = Boolean.TRUE;
        Boolean boolean1 = true;
        System.out.println("iguales: " + (bool == boolean1));
        
        System.out.println(Long.parseLong("13"));
        //Integer.parseInt(x);
        //Float.parseFloat(x);
        System.out.println(Boolean.parseBoolean("tRuE "));
        Integer int1 = 10;
        Integer int2 = 10;
        int2 += 1;
        System.out.println("iguales: " + (int1 == int2));
        double a5 = 10;
        byte a7 = -0;
        System.out.println("a7 = " + a7);
        long l1 = 123_456_789;
        
    }
}
