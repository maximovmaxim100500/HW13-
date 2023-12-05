public class Hufflepuff extends Hogwarts {

    private int hardWorke;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String faculty, int powerOfMagik, int transgretionsDistans,
                      int hardWorke, int loyalty, int honesty) {
        super(name, faculty, powerOfMagik, transgretionsDistans);
        this.hardWorke = hardWorke;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void equalseStudentFaculty(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.getHardWorke() + student1.getLoyalty() + student1.getHonesty();
        int sum2 = student2.getHardWorke() + student2.getLoyalty() + student2.getHonesty();
        System.out.println("У " + student1.getName() + " трудолюбие = " + student1.getHardWorke() + " баллов, верность = " +
                student1.getLoyalty() + " баллов и честность = " + student1.getHonesty() +
                " баллов. У " + student2.getName() + " трудолюбие = " + student2.getHardWorke() + " баллов, верность = " +
                student2.getLoyalty() + " баллов и честность = " + student2.getHonesty() +
                " баллов.");
        System.out.println("У " + student1.getName() + " сумма балов равна " + sum1 + ", а У " + student2.getName() +
                " - " + sum2 + ".");
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Пуфендуец чем " + student2.getName() + ".");
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Пуфендуец чем " + student1.getName() + ".");
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равные ученики.");
        }
    }

    public int getHardWorke() {
        return hardWorke;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
