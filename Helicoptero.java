public class Helicoptero {
    
    //Atributos

    private boolean estaLigado;
    private int altitude;
    private int capacidadeHelicoptero;
    private int quantidadePessoa;

        //Construtor 

    public Helicoptero(int capacidadeHelicoptero){
        this.capacidadeHelicoptero = capacidadeHelicoptero;
    }

    //Métodos
    
    public void entrar(){
        if (quantidadePessoa < 5)
        quantidadePessoa = quantidadePessoa + 1;
    }

    public void sair(){
        if (quantidadePessoa > 0)
        quantidadePessoa = quantidadePessoa - 1;
    }

    public void ligar(){
        if (estaLigado == false)
        estaLigado = true;
    }

    public void decolar(){
        if (estaLigado == true && altitude == 0)
        altitude = altitude + 20;
    }

    public void aterrisar(){
        if (estaLigado == true && altitude > 0)
        altitude = 0;
    }

    public void desligar(){
        if (estaLigado == true && altitude == 0)
        estaLigado = false;
    }

    //Método get e set

    public boolean getEstaligado(){
        return estaLigado;
    }

    public void setEstaligado(boolean estaLigado){
        this.estaLigado = estaLigado;

    }

    public int getAltitude(){
        return altitude;

    }

    public void setAltitude(int altitude){
        this.altitude = altitude;

    }
     public int getCapacidadehelicoptero(){
        return capacidadeHelicoptero;

     }

     public void setCapacidadehelicopeto(int capacidadeHelicoptero){
        this.capacidadeHelicoptero = capacidadeHelicoptero;

     }

     public int getQuantidadepessoa(){
        return quantidadePessoa;

     }

     public void setQuantidadepessoa(int quantidadePessoa){
        this.quantidadePessoa = quantidadePessoa;

     }

     public String toString(){
        return String.format("Esta ligado: %s, Altitude: %d, Capacidade helicoptero: %d, Quantidade Pessoa: %d ", estaLigado, altitude, capacidadeHelicoptero, quantidadePessoa);

     }

    }

