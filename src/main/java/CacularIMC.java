import javax.swing.*;
import java.util.ArrayList;

public class CacularIMC {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        int op = 0;

        do{
            op = menu();
            if(op==1) pessoas.add(cadPessoa());
            if(op==2) exibirPessoa(pessoas);

        }while (op !=3 );

    }
    public static int menu() {
        String op = """
                1 - Cadastrar pessoa
                2 - Exibir pessoas cadastradas
                3 - Sair
                """;
        return Integer.parseInt(JOptionPane.showInputDialog(null, op));
    }

    public static Pessoa cadPessoa() {
        Pessoa p = new Pessoa();
        p.setNome(lerString("Nome:"));
        p.setAltura(lerDouble("Altura"));
        p.setPeso(lerDouble("Peso"));
        p.setSexo(lerString("Sexo").charAt(0));
        return p;
    }

    public static void exibirPessoa(ArrayList<Pessoa> pessoas) {
        if(pessoas.isEmpty()){
            msg("Não há pessoas cadastradas!");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (Pessoa p : pessoas) {
            sb.append(p.toString()).append("\n");
        }
        msg(sb.toString());
    }


    public static int lerInt(String txt) {
        int recebeInt = Integer.parseInt(JOptionPane.showInputDialog(txt));
        if (recebeInt < 0) {
            msg("Valor inválido");
            return lerInt(txt);
        }
        return recebeInt;
    }

    public static String lerString(String txt) {
        String recebeString = JOptionPane.showInputDialog(txt);
        if (recebeString.trim().length() <= 3) {
            msg("Valor inválido");
            return lerString(txt);
        }
        return recebeString;
    }

    public static Double lerDouble(String txt){
        Double recebeDouble = Double.parseDouble(JOptionPane.showInputDialog(txt));
        if(recebeDouble < 0) {
            msg("Valor inválido");
            return lerDouble(txt);
        }
        return recebeDouble;
    }


    public static void msg(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }

}

