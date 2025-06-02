public class PrincipalPorta {
    public static void main(String [] args){

        Porta porta01 = new Porta("Azul", 15, 25, true);
        Porta porta02 = new Porta("Rosa", 22, 30, false);

        System.out.println("\nPortas true e false");
        System.out.println("\nPrimeira porta: ");
        System.out.println(porta01.toString());
        System.out.println("\nSegunda porta: ");
        System.out.println(porta02.toString());
        System.out.println("Encerrar programa.");

    }


}
