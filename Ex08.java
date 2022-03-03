import javax.swing.JOptionPane;
public class Ex08 {
    public static void main(String[] args) {
        //criação de variaveis
        Double eleitores, votosBranc, votosNulos, votosValidos, percentualBranc, percentualNulos, percentualValidos;
        
        //entrada de dados
        eleitores = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de eleitores: "));
        votosBranc = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos em branco: "));
        votosNulos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos nulos: "));
        votosValidos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos válidos: "));

        //processamento
        percentualBranc = votosBranc/eleitores * 100;
        percentualNulos = votosNulos/eleitores * 100;
        percentualValidos = votosValidos/eleitores * 100;
        
        //saida
        String b = String.format("O percentual de votos brancos é de: %.2f por cento", percentualBranc);
        JOptionPane.showMessageDialog(null, b);

        String n = String.format("O percentual de votos nulos é de: %.2f por cento", percentualNulos);
        JOptionPane.showMessageDialog(null, n);

        String v = String.format("O percentual de votos validos é de: %.2f por cento", percentualValidos);
        JOptionPane.showMessageDialog(null, v);
    }
}
