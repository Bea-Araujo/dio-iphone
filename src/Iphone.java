import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorDeInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecioanr música: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocar música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
        
    }
}
