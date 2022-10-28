package ArquivosCalculadora;

import javax.swing.JOptionPane;

public class CalcHEX {

    public static void main(String[] args) {

        String a, b;
        int soma, sub, mult, div;
        int resp, calc;

        do {
            calc = Integer.parseInt(JOptionPane.showInputDialog("Informe a operacao HEXADECIMAL que deseja fazer: \n 1=SOMA \n 2=SUBTRACAO \n 3=MULTIPLICACAO \n 4=DIVISAO "));

            switch (calc) {
                case 1:
                    a = JOptionPane.showInputDialog("Digite o 1º numero HEXADECIMAL para a soma:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero HEXADECIMAL para a soma:");
                    soma = Integer.parseInt(a, 16) + Integer.parseInt(b, 16);
                    JOptionPane.showMessageDialog(null, "A soma dos HEXADECIMAIS " + a + " + " + b + " = " + Integer.toHexString(soma));
                    break;

                case 2:
                    a = JOptionPane.showInputDialog("Digite o 1º numero HEXADECIMAL para a subtracao:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero HEXADECIMAL para a subtracao:");
                    sub = Integer.parseInt(a, 16) - Integer.parseInt(b, 16);
                    JOptionPane.showMessageDialog(null, "A subtracao dos HEXADECIMAIS " + a + " - " + b + " = " + Integer.toHexString(sub));
                    break;

                case 3:
                    a = JOptionPane.showInputDialog("Digite o 1º numero HEXADECIMAL para a multiplicacao:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero HEXADECIMAL para a multiplicacao:");
                    mult = Integer.parseInt(a, 16) * Integer.parseInt(b, 16);
                    JOptionPane.showMessageDialog(null, "A multiplicacao dos HEXADECIMAIS " + a + " * " + b + " = " + Integer.toHexString(mult));
                    break;

                case 4:
                    a = JOptionPane.showInputDialog("Digite o 1º numero HEXADECIMAL para a divisao:");
                    b = JOptionPane.showInputDialog("Digite o 2º numero HEXADECIMAL para a divisao:");
                    div = Integer.parseInt(a, 16) / Integer.parseInt(b, 16);
                    JOptionPane.showMessageDialog(null, "A divisao dos HEXADECIMAIS " + a + " / " + b + " = " + Integer.toHexString(div));
                    break;
            }

            resp = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para sair e voltar ao MENU: Tipos de BASE para OPERCACOES\nou\n 1 para continuar as operacoes HEXADECIMAIS: "));

        } while (resp != 0);

        JOptionPane.showMessageDialog(null, "VOCE SAIU DAS OPERACOES HEXADECIMAIS!");
    }

}

