public class PrincipalHelicoptero {
    public static void main(String [] args){
        Helicoptero h1 = new Helicoptero(6);
        Helicoptero h2 = new Helicoptero(12);

        System.out.println("\n == Estado inicial do Helicoptero ==");
        System.out.println(h1);
        System.out.println(h2);

        h1.entrar();
        h1.ligar();
        h1.decolar();

        h2.entrar();
        h2.ligar();
        h2.decolar();

        System.out.println("\n == Após decolagem ==");
        System.out.println(h1);
        System.out.println(h2);
        
        
        h1.aterrisar();
        h1.desligar();
        h1.sair();

        h2.aterrisar();
        h2.desligar();
        h2.sair();

        System.out.println("\n == Após aterrisagem e saída ==");
        System.out.println(h1);
        System.out.println(h2);

    }

}
