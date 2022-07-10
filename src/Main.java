public class Main {
    public static void main(String[] args) {


        BmiService service = new BmiService();
        int h = 183;
        int w = 98;
        double bmi = service.calculate(w, h);
        System.out.println("Индекс массы тела " + bmi);
    }
}
