import javax.swing.JOptionPane;
public class Exer07 {
    public static void main(String[] args) {
        //criação de variaveis
        double idadeAnos, idadeMeses, idadeDias, idadeResult;

        //entrada de dados
        idadeAnos = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade em anos: "));
        idadeMeses = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade em meses: "));
        idadeDias = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade em dias: "));

        //processamento
        idadeResult = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
        
        //saida
        String s = String.format("A idade digitada convertida para dias fica: %.2f", idadeResult);
        JOptionPane.showMessageDialog(null, s);
    }
}
