package entities;

public class NotaFiscal {

    private String razaoSocial;
    private int num;
    private String serie;
    private String data;
    private double valor;
    private static final double aliq = 0.048;

    public NotaFiscal() {
    }

    public NotaFiscal(String razaoSocial, int num, String serie, String data, double valor) {
        this.razaoSocial = razaoSocial;
        this.num = num;
        this.serie = serie;
        this.data = data;
        this.valor = valor;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double valorFinal() {
        return valor + (aliq * valor);
    }

    public String imprimir() {
        return "Razão Social: " + razaoSocial + "\n"
                + "Número da nota: " + num + "\n"
                + "Série: " + serie + "\n"
                + "Data de emissão: " + data + "\n"
                + "Valor da nota: " + valorFinal() + "\n"
                + "====================";
    }
}
