package list;

import entities.NotaFiscal;

import java.util.ArrayList;

public class ListaNotaFiscal {

    private static ArrayList<NotaFiscal> listNota = new ArrayList<NotaFiscal>();

    public static ArrayList<NotaFiscal> getListNota() {
        return listNota;
    }

    //Método para adicionar uma nota na lista
    public static void addNota(NotaFiscal n) {
        listNota.add(n);
    }

    //Método para listar
    public static String listar () {
        String saida = "";
        for (NotaFiscal n: listNota){
            saida += n.imprimir() + "\n";
        }
        return saida;
    }

    //Método para remover nota fiscal da lista
    public static boolean remover(String razaoSocial) {
        for (NotaFiscal n : listNota) {
            if (n.getRazaoSocial().equalsIgnoreCase(razaoSocial)) {
                listNota.remove(n);
                return true;
            }
        }
        return false;
    }
}
