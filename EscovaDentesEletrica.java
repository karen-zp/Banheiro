class EscovaDentesEletrica{
    private boolean ligada;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public boolean isLigada(){
        return ligada;
    }

    public void observar(){
        if (ligada)
            System.out.println("Escova de Dentes Elétrica ligada");
        else
            System.out.println("Escova de Dentes Elétrica desligada");
    }
}