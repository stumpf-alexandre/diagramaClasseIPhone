package diagramaClasseIPhone.src.aparelho.musica;

public class IPod implements ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando música");
    }
    public void pausar() {
        System.out.println("Música pausada");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando nova música");
    }
}
