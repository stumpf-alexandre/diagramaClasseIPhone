package diagramaClasseIPhone.src.aparelho.internet;

public class Browser implements NavegarInternet {
    public void exibirPagina() {
        System.out.println("Abrindo pagina no navegador");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada no navegador");
    }
}
