package ArquivosCalculadora;

import javax.swing.JOptionPane;

public class ConversaoBases {

    public static void main(String[] args) {

        int numeroDecimal;
        String numeroLido;
        int base;
        int resp;

        do {

            numeroLido = (JOptionPane.showInputDialog("Informe o numero para conversao:"));

            base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base do numero que deseja converter: \n 1=BINARIO \n 2=OCTAL \n 3=DECIMAL \n 4=HEXADECIMAL "));

            switch (base) {
                case 1:
                    System.out.println("=====================");
                    System.out.println("Conversao de BINARIO");
                    System.out.println("=====================");
                    System.out.println("BIN "+numeroLido);
                    System.out.println("---------------------");
                    numeroDecimal = Integer.valueOf(numeroLido, 2);
                    System.out.println("DEC " + numeroDecimal);
                    System.out.println("OCT " + (Integer.toOctalString(numeroDecimal)));
                    System.out.println("HEX " + (Integer.toHexString(numeroDecimal)));
                    System.out.println("_____________________");
                    break;

                case 2:
                    System.out.println("===================");
                    System.out.println("Conversao de OCTAL");
                    System.out.println("===================");
                    System.out.println("OCT "+numeroLido);
                    System.out.println("-------------------");
                    numeroDecimal = Integer.valueOf(numeroLido, 8);
                    System.out.println("DEC " + numeroDecimal);
                    System.out.println("BIN " + (Integer.toBinaryString(numeroDecimal)));
                    System.out.println("HEX " + (Integer.toHexString(numeroDecimal)));
                    System.out.println("___________________");
                    break;

                case 3:
                    System.out.println("=====================");
                    System.out.println("Conversao de DECIMAL");
                    System.out.println("=====================");
                    System.out.println("DEC "+numeroLido);
                    System.out.println("---------------------");
                    numeroDecimal = Integer.valueOf(numeroLido, 10);
                    System.out.println("BIN " + (Integer.toBinaryString(numeroDecimal)));
                    System.out.println("OCT " + (Integer.toOctalString(numeroDecimal)));
                    System.out.println("HEX " + (Integer.toHexString(numeroDecimal)));
                    System.out.println("_____________________");
                    break;

                case 4:
                    System.out.println("=========================");
                    System.out.println("Conversao de HEXADECIMAL");
                    System.out.println("=========================");
                    System.out.println("HEX "+numeroLido);
                    System.out.println("-------------------------");
                    numeroDecimal = Integer.valueOf(numeroLido, 16);
                    System.out.println("DEC " + numeroDecimal);
                    System.out.println("BIN " + (Integer.toBinaryString(numeroDecimal)));
                    System.out.println("OCT " + (Integer.toOctalString(numeroDecimal)));
                    System.out.println("_________________________");
                    break;

            }
            resp = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para sair e voltar ao MENU PRINCIPAL\nou\n 1 para continuar as CONVERSOES: "));

        } while (resp != 0);

        JOptionPane.showMessageDialog(null, "VOCE SAIU DAS CONVERSOES!");

    }

}
