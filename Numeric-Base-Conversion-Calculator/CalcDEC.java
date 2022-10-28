package ArquivosCalculadora;

import javax.swing.JOptionPane;

public class CalcDEC {

    public static void main(String[] args) {

        String a, b;
        int soma, sub, mult, div;
        int resp, calc;

        do {
            calc = Integer.parseInt(JOptionPane.showInputDialog("Informe a operacao DECIMAL que deseja fazer: \n 1=SOMA \n 2=SUBTRACAO \n 3=MULTIPLICACAO \n 4=DIVISAO "));

            switch (calc) {
                case 1:
                    a = JOptionPane.showInputDialog("Digite o 1º numero DECIMAL para a soma:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero DECIMAL para a soma:");
                    soma = Integer.parseInt(a, 10) + Integer.parseInt(b, 10);
                    JOptionPane.showMessageDialog(null, "A soma dos DECIMAIS " + a + " + " + b + " = " + (soma));
                    break;

                case 2:
                    a = JOptionPane.showInputDialog("Digite o 1º numero DECIMAL para a subtracao:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero DECIMAL para a subtracao:");
                    sub = Integer.parseInt(a, 10) - Integer.parseInt(b, 10);
                    JOptionPane.showMessageDialog(null, "A subtracao dos DECIMAIS " + a + " - " + b + " = " + (sub));
                    break;

                case 3:
                    a = JOptionPane.showInputDialog("Digite o 1º numero DECIMAL para a multiplicacao:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero DECIMAL para a multiplicacao:");
                    mult = Integer.parseInt(a, 10) * Integer.parseInt(b, 10);
                    JOptionPane.showMessageDialog(null, "A multiplicacao dos DECIMAIS " + a + " * " + b + " = " + (mult));
                    break;

                case 4:
                    a = JOptionPane.showInputDialog("Digite o 1º numero DECIMAL para a divisao:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero DECIMAL para a divisao:");
                    div = Integer.parseInt(a, 10) / Integer.parseInt(b, 10);
                    JOptionPane.showMessageDialog(null, "A divisao dos DECIMAIS " + a + " / " + b + " = " + (div));
                    break;
            }

            resp = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para sair e voltar ao MENU: Tipos de BASE para OPERCACOES\nou\n 1 para continuar as operacoes DECIMAIS: "));

        } while (resp != 0);

        JOptionPane.showMessageDialog(null, "VOCE SAIU DAS OPERACOES DECIMAIS!");
    }

}
