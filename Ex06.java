import javax.swing.JOptionPane;
public class Ex06 {
    public static void main(String[] args) {
        //declaração de variaveis
        double idadeAnos, idadeDias;

        //entrada de dados
        idadeAnos = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade a ser convertida(Em Anos)"));

        //processamento
        idadeDias = idadeAnos * 365;

        //saida
        String s = String.format("A idade digitada em dias é: %.2f", idadeDias);
        JOptionPane.showMessageDialog(null, s);
    }
}
