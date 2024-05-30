package aparelhos;



public class Aparelho {
    public static void main(String[] args) {
        Iphone telefone = new Iphone();

        telefone.adicionarNovaAba();
        telefone.atualizarPagina();
        telefone.exibirPagina("Youtube.com");

        telefone.ligar("123456789");
        telefone.desligar();
        telefone.iniciarCorreioVoz();

        telefone.tocar();
        telefone.pausar();
        telefone.selecionarMusica("Música");


    }
}
