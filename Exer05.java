import javax.swing.JOptionPane;
public class Exer05 {
    public static void main(String[] args) {
        //criação de variaveis
        double base, alt, res;

        //entrada de dados
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo:"));
        alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo"));

        //processamento
        res = (base * alt) / 2;

        //saida
        String s = String.format("A área do triângulo é: %.2f", res);
        JOptionPane.showMessageDialog(null, s);
    }
}
