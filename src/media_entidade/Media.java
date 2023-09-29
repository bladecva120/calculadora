package media_entidade;

public class Media {

    private int quant;
    private double soma;

    public Media(int quant, double soma) {
        this.quant = quant;
        this.soma = soma;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getQuant() {
        return quant;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public double getSoma() {
        return soma;
    }

    public double calcMedia() {
        return soma / quant;
    }

}
