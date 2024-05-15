package diagramaClasseIPhone.src.usuario;

import diagramaClasseIPhone.src.aparelho.celular.IPhone;
import diagramaClasseIPhone.src.aparelho.internet.NavegarInternet;
import diagramaClasseIPhone.src.aparelho.musica.ReprodutorMusical;
import diagramaClasseIPhone.src.aparelho.telefone.AparelhoTelefonico;

public class Proprietario {
    public static void main(String[] args) {
        NavegarInternet iphone15 = new IPhone();
        iphone15.exibirPagina();
        iphone15.adicionarNovaAba();
        iphone15.atualizarPagina();

        System.out.println("--------------------------------------");

        ReprodutorMusical iphone10 = new IPhone();
        iphone10.tocar();
        iphone10.pausar();
        iphone10.selecionarMusica();

        System.out.println("--------------------------------------");

        AparelhoTelefonico iphone7 = new IPhone();
        iphone7.ligar();
        iphone7.atender();
        iphone7.iniciarCorreioDeVoz();

        System.out.println("--------------------------------------");
    }
}
