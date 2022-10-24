package ArquivosCalculadora;

import javax.swing.JOptionPane;

public class CalcOCT {

    public static void main(String[] args) {

        String a, b;
        int soma, sub, mult, div;
        int resp, calc;

        do {
            calc = Integer.parseInt(JOptionPane.showInputDialog("Informe a operacao OCTAL que deseja fazer: \n 1=SOMA \n 2=SUBTRACAO \n 3=MULTIPLICACAO \n 4=DIVISAO "));

            switch (calc) {
                case 1:
                    a = JOptionPane.showInputDialog("Digite o 1º numero OCTAL para a soma:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero OCTAL para a soma:");
                    soma = Integer.parseInt(a, 8) + Integer.parseInt(b, 8);
                    JOptionPane.showMessageDialog(null, "A soma dos OCTAIS " + a + " + " + b + " = " + Integer.toOctalString(soma));
                    break;

                case 2:
                    a = JOptionPane.showInputDialog("Digite o 1º numero OCTAL para a subtracao:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero OCTAL para a subtracao:");
                    sub = Integer.parseInt(a, 8) - Integer.parseInt(b, 8);
                    JOptionPane.showMessageDialog(null, "A subtracao dos OCTAIS " + a + " - " + b + " = " + Integer.toOctalString(sub));
                    break;

                case 3:
                    a = JOptionPane.showInputDialog("Digite o 1º numero OCTAL para a multipilicacao:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero OCTAL para a multipilicacao:");
                    mult = Integer.parseInt(a, 8) * Integer.parseInt(b, 8);
                    JOptionPane.showMessageDialog(null, "A multiplicacao dos OCTAIS " + a + " * " + b + " = " + Integer.toOctalString(mult));
                    break;

                case 4:
                    a = JOptionPane.showInputDialog("Digite o 1º numero OCTAL para a divisao:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero OCTAL para a divisao:");
                    div = Integer.parseInt(a, 8) / Integer.parseInt(b, 8);
                    JOptionPane.showMessageDialog(null, "A divisao dos OCTAIS " + a + " / " + b + " = " + Integer.toOctalString(div));
                    break;
            }

            resp = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para sair e voltar ao MENU: Tipos de BASE para OPERCACOES\nou\n 1 para continuar as operacoes OCTAIS: "));

        } while (resp != 0);

        JOptionPane.showMessageDialog(null, "VOCE SAIU DAS OPERACOES OCTAIS!");
    }

}
