import java.util.Random;

public class ComputeMethods5026201059 {

    public double fToC(double degreesF) {
        return 5.0 / 9.0 * (degreesF - 32);
    }

    public double hypotenuse(int a, int b){
        return Math.sqrt((Math.pow(a,2) + Math.pow(b,2)));
    }

    public int roll(){
        Random random = new Random();
        int dadu1 = random.nextInt(7);
        int dadu2 = random.nextInt(7);
        return dadu1 + dadu2;
    }
}
