
package ArquivosCalculadora;

import javax.swing.JOptionPane;

public class CalcBIN {

    public static void main(String[] args) {

        String a, b;
        int soma, subt, mult, div;
        int resp, calc;

        do {
            calc = Integer.parseInt(JOptionPane.showInputDialog("Informe a operacao BINARIA que deseja fazer: \n 1=SOMA \n 2=SUBTRACAO \n 3=MULTIPLICACAO \n 4=DIVISAO "));

            switch (calc) {
                case 1:
                    a = JOptionPane.showInputDialog("Digite o 1º numero BINARIO para a soma:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero BINARIO para a soma:");
                    soma = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
                    JOptionPane.showMessageDialog(null, "A Soma dos BINARIOS " + a + " + " + b + " = " + Integer.toBinaryString(soma));
                    break;

                case 2:
                    a = JOptionPane.showInputDialog("Digite o 1º numero BINARIO para a subtracao:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero BINARIO para a subtracao:");
                    subt = Integer.parseInt(a, 2) - Integer.parseInt(b, 2);
                    JOptionPane.showMessageDialog(null, "A Subtracao dos BINARIOS " + a + " - " + b + " = " + Integer.toBinaryString(subt));
                    break;

                case 3:
                    a = JOptionPane.showInputDialog("Digite o 1º numero BINARIO para a multiplicacao:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero BINARIO para a multiplicacao:");
                    mult = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
                    JOptionPane.showMessageDialog(null, "A Multiplicacao dos BINARIOS " + a + " * " + b + " = " + Integer.toBinaryString(mult));
                    break;

                case 4:
                    a = JOptionPane.showInputDialog("Digite o 1º numero BINARIO para a divisao:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero BINARIO para a divisao:");
                    div = Integer.parseInt(a, 2) / Integer.parseInt(b, 2);
                    JOptionPane.showMessageDialog(null, "A Divisao dos BINARIOS " + a + " / " + b + " = " + Integer.toBinaryString(div));
                    break;
            }

            resp = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para sair e voltar ao MENU: Tipos de BASE para OPERCACOES\nou\n 1 para continuar as operacoes BINARIAS: "));

        } while (resp != 0);

        JOptionPane.showMessageDialog(null, "VOCE SAIU DAS OPERACOES BINARIAS!");
    }

}
