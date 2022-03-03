import javax.swing.JOptionPane;
public class Exer01 {
    public static void main(String[] args) {
        //criação de variaveis
        double cotDolar, dolar, resReal;

        //entrada de dados
        cotDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação atual do dólar: "));
        String sDolar = String.format("A cotação do dólar é: %.2f", cotDolar);
        JOptionPane.showMessageDialog(null, sDolar);
        dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólares a ser convertido"));

        //processamento
        resReal = dolar * cotDolar;

        //saida
        String res = String.format("O valor convertido para reais é: %.2f.", resReal);
        JOptionPane.showMessageDialog(null, res);
    }
}
