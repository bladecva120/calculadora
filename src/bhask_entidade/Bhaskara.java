package bhask_entidade;

public class Bhaskara {

    private int A;
    private int B;
    private int C;

    public Bhaskara(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double delta() {
        return Math.pow(B, 2) - 4 * A * C;
    }

    public double valorX1() {
        return (-B + (Math.sqrt(delta()))) / (2 * A);
    }

    public double valorX2() {
        return (-B - (Math.sqrt(delta()))) / (2 * A);
    }

}
