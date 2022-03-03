import javax.swing.JOptionPane;
public class Ex11 {
    public static void main(String[] args) {
        //criação de variaveis
        Double vendas, carrosVendidos, salarioFixo, valorPorCarro, total;

        //entrada de dados
        carrosVendidos = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de carros vendidos:"));
        vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de suas vendas:"));
        salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor fixo do seu sálario:"));
        valorPorCarro = Double.parseDouble(
            JOptionPane.showInputDialog("Digite o valor recebido para cada carro vendido:")
        );

        //processamento
        total = (carrosVendidos * valorPorCarro) + (0.05 * vendas) + salarioFixo;

        //saida
        String s = String.format("O sálario final desse funcionário é: %.2f", total);
        JOptionPane.showMessageDialog(null, s);
    }
}
