public class PredictTuition {
    public static void main(String[]args){
        double tuition = 10000;
        double rate = 0.07;
        int years = 0;

        while (tuition < 20000){
            tuition *=1 + rate; years ++;
        }
        System.out.println("Tuition will be doubled in "+years+"years.");
        System.out.printf("The tuition will bw $%.2f in %d years.",tuition,years);
    }
}