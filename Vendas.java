import javax.swing.JOptionPane;
public class Vendas {
    public static void main(String[] args) {
        //declaração de variaveis
        double numVendas, valorPeca, resVendas, res;

        //entrada de dados
        valorPeca = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça:"));
        numVendas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de vendas realizadas:"));

        //processamento
        resVendas = valorPeca * numVendas;
        res = (5 * resVendas) / 100;

        //saida
        String s = String.format("A comissão a ser recebida por esse funcionário é: %.2f", res);
        JOptionPane.showMessageDialog(null, s);
    }
}
