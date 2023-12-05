public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String faculty, int powerOfMagik, int transgretionsDistans,
                      int nobility, int honor, int bravery) {
        super(name, faculty, powerOfMagik, transgretionsDistans);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void equalseStudentFaculty(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int sum2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        System.out.println("У " + student1.getName() + " благородство = " + student1.getNobility() + " баллов, честь = " +
                student1.getHonor() + " баллов и храбрость = " + student1.getBravery() +
                " баллов. У " + student2.getName() + " благородство = " + student2.getNobility() + " баллов, честь = " +
                student2.getHonor() + " баллов и храбрость = " + student2.getBravery() +
                " баллов.");
        System.out.println("У " + student1.getName() + " сумма балов равна " + sum1 + ", а У " + student2.getName() +
                " - " + sum2 + ".");
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец чем " + student2.getName() + ".");
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Гриффиндорец чем " + student1.getName() + ".");
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равные ученики.");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

}
