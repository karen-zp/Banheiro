class Banheiro{
    private Chuveiro chuveiro;
    private SecadorDeCabelo secador;
    private EscovaDentesEletrica escova;

    public Banheiro(Chuveiro chuveiro, SecadorDeCabelo secador, EscovaDentesEletrica escova){
        this.chuveiro = chuveiro;
        this.secador = secador;
        this.escova = escova;
    }

    public void ligar(){
        chuveiro.ligar();
        secador.ligar();
        escova.ligar();
    }

    public void desligar(){
        chuveiro.desligar();
        secador.desligar();
        escova.desligar();
    }
}