package display;
public class DisplayConsole implements IDisplay {
    public void mostrarDados(String tipo, String dados) {
        System.out.println("["+ tipo +"]: "+ dados);
    }
}
