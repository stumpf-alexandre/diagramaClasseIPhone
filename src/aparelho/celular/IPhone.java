package diagramaClasseIPhone.src.aparelho.celular;

import diagramaClasseIPhone.src.aparelho.internet.NavegarInternet;
import diagramaClasseIPhone.src.aparelho.musica.ReprodutorMusical;
import diagramaClasseIPhone.src.aparelho.telefone.AparelhoTelefonico;

public class IPhone implements NavegarInternet, ReprodutorMusical, AparelhoTelefonico {
    public void ligar() {
        System.out.println("Fazendo ligação pelo aparelho IPhone");
    }
    public void atender() {
        System.out.println("Atendendo ligação pelo aparelho IPhone");
    }
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz pelo aparelho IPhone");
    }
    public void tocar() {
        System.out.println("Tocando música pelo aparelho IPhone");
    }
    public void pausar() {
        System.out.println("Música pausada no aparelho IPhone");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando nova música no aparelho IPhone");
    }
    public void exibirPagina() {
        System.out.println("Abrindo pagina do navegador no aparelho IPhone");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador no aparelho IPhone");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada no navegador no aparelho IPhone");
    }
}
