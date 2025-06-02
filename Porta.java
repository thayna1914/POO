public class Porta {

    //Atributos

    private String cor;
    private double altura;
    private double largura;
    private boolean estaAberta;

    //Construtor

    public Porta(String cor, double altura, double largura, boolean estaAberta){
        this.cor = cor;
        this.altura  = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    //Métodos

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public boolean getEstaAberta(){
        return estaAberta;
    }

    public void setEstaAberta(boolean estaAberta){
        this.estaAberta = estaAberta;
    }

    //Método toString

        public String toString(){
            return 
            "\nCor " + cor +
            "\nAltura " + altura +
            "\nLargura " + largura +
            "\nEstaAberta " + estaAberta;

        }
    
}
