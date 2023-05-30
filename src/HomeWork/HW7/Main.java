package HomeWork.HW7;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient(1);
        Therapist therapist = new Therapist();
        therapist.helpPlan(patient);
    }
}
