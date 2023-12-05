public class Hogwarts {
    private String name;
    private String faculty;
    private int powerOfMagik;
    private int transgretionsDistans;

    public Hogwarts(String name, String faculty, int powerOfMagik, int transgretionsDistans) {
        this.name = name;
        this.faculty = faculty;
        this.powerOfMagik = powerOfMagik;
        this.transgretionsDistans = transgretionsDistans;
    }
    public static void equalseStudent(Hogwarts student1, Hogwarts student2) {
        int sum1 = student1.getPowerOfMagik() + student1.getTransgretionsDistans();
        int sum2 = student2.getPowerOfMagik() + student2.getTransgretionsDistans();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " обладает большей мощьностью магии чем " +
                    student2.getName() + ".");
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " обладает большей мощьностью магии чем " +
                    student1.getName() + ".");
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равные по силе.");
        }
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getPowerOfMagik() {
        return powerOfMagik;
    }

    public int getTransgretionsDistans() {
        return transgretionsDistans;
    }
}
