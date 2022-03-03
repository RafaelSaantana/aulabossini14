import javax.swing.JOptionPane;
public class Exer02 {
    public static void main(String[] args) {
        //declaração de variáveis
        double op1, op2, op3, op4, quad1, quad2, quad3, quad4, res;
                
        //entrada de dados
        op1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        op2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        op3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));
        op4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número: "));

        //processamento
        quad1 = op1 * op1;
        quad2 = op2 * op2;
        quad3 = op3 * op3;
        quad4 = op4 * op4;

        res = quad1 + quad2 + quad3 + quad4;

        //saida
        String s = String.format("O resultado da soma dos quadrados dos 4 números é: %.2f", res);
        JOptionPane.showMessageDialog(null, s);
    }
}
