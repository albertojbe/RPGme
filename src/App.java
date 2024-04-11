import Personagens.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Personagem cavaleiro = new Personagem("NS", "as", "as");
        System.out.println(cavaleiro.getNome());
    }
}
