package diagramaClasseIPhone.src.aparelho.telefone;

public class TelefoneMobile implements AparelhoTelefonico {
    public void ligar() {
        System.out.println("Fazendo ligação do telefone");
    }
    public void atender() {
        System.out.println("Atendendo ligação no telefone");
    }
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz do telefone");
    }
}
