public class PrincipalConta{
    public static void main(String[] args){
        Conta a = new Conta(4002, "Adrielle");
        Conta t = new Conta(8922, "Thayná");
        Conta p = new Conta(1024, "Pedro");

          System.out.println("----------------------------");

        System.out.println(a);
        System.out.println(t);
        System.out.println(p);
      
        System.out.println("----------------------------");

        a.Depositar(50);
        t.Depositar(35);
        p.Depositar(90);

         System.out.println("----------------------------");


        System.out.println(a);
        System.out.println(t);
        System.out.println(p);
         
        System.out.println("----------------------------");

        




    }
}
