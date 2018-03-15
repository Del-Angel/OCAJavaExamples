
public class Variables {
    static float x = (float)20.5;
    static char c = '\u7170';
    static char c2 = 'd';
    final static int i;
    {
        String s = "Hola!";   
        System.out.println(s);
    } 
    String variableDeInstancia = "";
    
    static {
        String s = "adios";
        System.out.println(s);
        i = 10;
        {
            String s1;
            s1 = new String();
            if(s1.isEmpty()){
                int c = 0;
                for(int i = 1;i < 10;i++){
                    i++;
                    s1.charAt(c);
                }
            }
        }
        //System.out.println(s1); No compila
    }
    static public void main (String abcde[]){
       /* System.out.println(new Variables().c = 'a');
        System.out.println("i: " + i);
        System.out.println(new Variables());*/
        long l = 122_32__7_22_222__2L;
        int hex = 0xFFF;
        byte binary = 0b111;
        System.out.println(x + l); // 120
        System.out.println(x - c2); //-80
        System.out.println(x * c2); //2,000
        System.out.println(x / c2); // 0
        System.out.println(x % c2); // 20
        x += c2;
        x -= c2;
        x *= c2;
        x /= c2;
        x %= c2;
        
        //x = x + c2;
        System.out.println(x);
        System.out.println(binary + c2);
        {
            //bloque de código
            byte a= 0,b = 1,c = 2;
            int suma = 2*((3-4)+5/(3%2)+1);
                        // => 10
            byte d = (byte)(++a - ( (+ a++) - (c-- - b) + ++c));
                            /*  1  - (  1  - (2 - 1) + 2)    
                               1  - (1 - 1 + 2)
                                        -1
                                      
                                        a = 2
                                        b = 1
                                        c = 2
                                        total = -1
            
                                       */
            System.out.println("suma: " + suma ); 
            //Operadores relacionales
            // >, <, >=, <=, ==, !=
            //System.out.println(100 != 100); //false
            ////System.out.println(100 == 100); //true
            //System.out.println(100 > 100);  //false
            //System.out.println(100 < 100);  //false 
            //System.out.println(100 >= 100); //true
            //System.out.println(100 <= 100); //true
            boolean bool = 100 == 50; //false
            //Operadores lógicos
            // &&, ||, !, &, |
            //System.out.println(bool && true);
            System.out.println(true | (bool = true) );
            System.out.println(bool | false);
            String string = null;
            if(string != null && !(string = "hola").isEmpty() )
                System.out.println("string: " + string);
            else
                System.out.println("False!!");
            System.out.println("string: " + string);
            System.out.println("xor: " + (7 ^ 5));
            
            /*
                7 = 111
                5 = 101
            ------------
                    010 ----> 2 
            */
            
            //System.out.println(bool & true);
            //System.out.println(!true);
            
        }
        //Variables de Referencia a objeto
       
        String str = "5";
        Variables v ; 
        v = new Variables();
        Variables v2 = new Variables();
        v2 = v;
        String str2 = str;
        str = null;
        v = null;
        
        /*
        Objetos = 3
        # referencias = 4
        #canditados = 1
        */
    } 
}
/*
Output:
    adios
    Hola!
    煰
    97
    Hola!
    Variables@234ew
*/