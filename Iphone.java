public class Iphone implements AparelhoTelefone,ReprodutorMusical,NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("LIGOU");
    }

    @Override
    public void atender() {
        System.out.println("ATENDEU");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }

    @Override
    public void tocaMusica() {

    }

    @Override
    public void pausaMusica() {

    }

    @Override
    public void selecionarMusica() {

    }
}
