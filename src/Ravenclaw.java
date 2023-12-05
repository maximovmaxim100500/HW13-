public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, String faculty, int powerOfMagik, int transgretionsDistans,
                     int mind, int wisdom, int wit, int creation) {
        super(name, faculty, powerOfMagik, transgretionsDistans);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }
    public static void equalseStudentFaculty(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.getMind() + student1.getWisdom() + student1.getWit() + student1.getCreation();
        int sum2 = student2.getMind() + student2.getWisdom() + student2.getWit() + student2.getCreation();

        System.out.println( "У " + student1.getName() + " ум = " + student1.getMind() + " баллов, мудрость = "+
                student1.getWisdom() + " баллов, остроумие = " + student1.getWit()+ " и творчество = " + student1.getCreation() +
                " баллов. У " + student2.getName() + " ум = " + student2.getMind() + " баллов, мудрость = "+
                student2.getWisdom() + " баллов, остроумие = " + student2.getWit()+ " и творчество = " + student2.getCreation() +
                " баллов.");

        System.out.println("У " + student1.getName() + " сумма балов равна " + sum1 + ", а У " + student2.getName() +
                " - "+ sum2 + ".");
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Когтевранец чем " + student2.getName() + ".");
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Когтевранец чем " + student1.getName() + ".");
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равные ученики.");
        }
    }
    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }
}
