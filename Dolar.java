import javax.swing.JOptionPane;
public class Dolar {
    public static void main(String[] args) {
        //criação de variaveis
        double cotDolar, dolar, resReal;

        //entrada de dados
        cotDolar = 5.10;
        String sDolar = String.format("A cotação do dólar é: %.2f", cotDolar);
        JOptionPane.showMessageDialog(null, sDolar);
        dolar = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em dólares a ser convertido"));

        //processamento
        resReal = dolar * cotDolar;

        //saida
        String res = String.format("O valor convertido para reais é: %.2f.", resReal);
        JOptionPane.showMessageDialog(null, res);
    }
}
