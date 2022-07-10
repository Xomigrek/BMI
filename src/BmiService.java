public class BmiService {
    public double calculate (int weight, double height) {
        double result=weight/(height*height/10000);
        return result;
    }
}
