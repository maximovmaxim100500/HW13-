public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String faculty, int powerOfMagik, int transgretionsDistans,
                     int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, faculty, powerOfMagik, transgretionsDistans);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public static void equalseStudentFaculty(Slytherin student1, Slytherin student2) {
        int sum1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() +
                student1.getResourcefulness() + student1.getThirstForPower();
        int sum2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() +
                student2.getResourcefulness() + student2.getThirstForPower();

        System.out.println("У " + student1.getName() + " хитрость = " + student1.getCunning() + " баллов, решительность = " +
                student1.getDetermination() + " баллов, амбициозность = " + student1.getAmbition() +
                ", находчивость = " + student1.getResourcefulness() + " и жажда власти = " + student1.getThirstForPower() +
                " баллов. У " + student2.getName() + " хитрость = " + student2.getCunning() + " баллов, решительность = " +
                student2.getDetermination() + " баллов, амбициозность = " + student2.getAmbition() +
                ", находчивость = " + student2.getResourcefulness() + " и жажда власти = " + student2.getThirstForPower() +
                " баллов.");

        System.out.println("У " + student1.getName() + " сумма балов равна " + sum1 + ", а У " + student2.getName() +
                " - "+ sum2 + ".");
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Слизериновец чем " + student2.getName() + ".");
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Слизериновец чем " + student1.getName() + ".");
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равные ученики.");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }
}
