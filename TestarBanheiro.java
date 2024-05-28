public class TestarBanheiro{
    public static void main(String[] args) {
        Chuveiro chuveiro = new Chuveiro();
        SecadorDeCabelo secador = new SecadorDeCabelo();
        EscovaDentesEletrica escova = new EscovaDentesEletrica();

        Banheiro banheiro = new Banheiro(chuveiro, secador, escova);

        banheiro.ligar();
        chuveiro.observar();
        secador.observar();
        escova.observar();

        banheiro.desligar();
        chuveiro.observar();
        secador.observar();
        escova.observar();
    }
}
