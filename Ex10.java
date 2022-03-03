import javax.swing.JOptionPane;
public class Ex10 {
    public static void main(String[] args) {
        //criação de variaveis
        Double custoFabrica, preco;

        //entrada de dados
        custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de fábrica do carro:"));

        //processamento
        preco = custoFabrica + (0.28 * custoFabrica) + (0.45 * custoFabrica); 

        //saida
        String s = String.format("O custo final desse carro é de: %.2f", preco);
        JOptionPane.showMessageDialog(null, s);
    }
}
