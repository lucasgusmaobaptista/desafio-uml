package aparelhos;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    @Override
    public String ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
        return numero;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz");
    }

    @Override
    public String exibirPagina(String url) {
        System.out.println("Exibindo a página " + url);
        return url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public String selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
        return musica;
    }
}
