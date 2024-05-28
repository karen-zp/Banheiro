class Chuveiro{
    private boolean ligado;

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public boolean isLigado(){
        return ligado;
    }

    public void observar(){
        if (ligado)
            System.out.println("Chuveiro ligado");
        else
            System.out.println("Chuveiro desligado");
    }
}
