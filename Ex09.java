import javax.swing.JOptionPane;
public class Ex09 {
    public static void main(String[] args) {
        //criação de variaveis
        Double salario, reajuste, total;

        //entrada de dados
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sálario atual do funcionário:"));
        reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de reajuste a ser feito:"));

        //processamento
        total = salario + (reajuste/100 * salario);

        //saida
        String s = String.format("O sálario reajustado desse funcionário é: %.2f", total);
        JOptionPane.showMessageDialog(null, s);
    }
}
