import javax.swing.JOptionPane;
public class Exer04 {
    public static void main(String[] args) {
        //declaração de variaveis
        double op, res;

        //entrada de dados
        op = Double.parseDouble(JOptionPane.showInputDialog("Digite o número a ser antecedido:"));

        //processamento
        res = op - 1;

        //saida
        String s = String.format("O antecessor de %.2f é %.2f", op, res);
        JOptionPane.showMessageDialog(null, s);
    }
}
