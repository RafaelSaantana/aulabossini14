package introducao;
import javax.swing.JOptionPane;
public class Soma {
    public static void main(String[] x) {
        //declaração de variáveis
        double op1, op2, res;
        
        //entrada de dados
        op1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        op2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        
        //processamento
        res = op1 + op2;
        
        //saida
        
        //Forma Simples
        //JOptionPane.showMessageDialog(null, res);
        
        //Forma formatada
        String s = String.format("%.2f + %.2f = %.2f", op1, op2, res);
        JOptionPane.showMessageDialog(null, s);
    }
}
