import javax.swing.JOptionPane;

// Classe que representa a Viga
class Viga {
    // Atributos encapsulados
    private double base;
    private double altura;
    private double comprimento;

    // Construtor para inicializar os atributos
    public Viga(double base, double altura, double comprimento) {
        this.base = base;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    // Método para calcular o volume da viga
    public double calcularVolume() {
        return base * altura * comprimento;
    }

    // Métodos de acesso para obter os valores encapsulados
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getComprimento() {
        return comprimento;
    }
}

// Classe principal que interage com o usuário
public class CalculadoraVolumeVigas {
    public static void main(String[] args) {
        // Solicitar dados ao usuário
        double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base da viga: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da viga: "));
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento da viga: "));

        // Criar uma instância da classe Viga
        Viga viga = new Viga(base, altura, comprimento);

        // Calcular o volume da viga
        double volume = viga.calcularVolume();

        // Exibir o resultado em uma caixa de mensagem
        JOptionPane.showMessageDialog(null, "O volume da viga é: " + volume + " metros cúbicos");
    }
}
