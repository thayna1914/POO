//classe 
public class Fitasdevideo{
    //Atributos
    private String titulo;
    private float preco;

    //Construtor
    public Fitasdevideo(String titulo, float preco){
        this.titulo = titulo;
        this.preco = preco;
    }

    //Métodos
    public String getTitulo(){
        return titulo;
    }

    public float getPreco(){
        return preco;
    }

    public float getValorAluguel(int numeroDeDiasAlugada){
        return preco * numeroDeDiasAlugada;
    }

    public void imprimir(int numeroDeDiasAlugada){
        System.out.println("Titulo: " + titulo);
        System.out.println("Preco: " + getValorAluguel(5));
    }
}

