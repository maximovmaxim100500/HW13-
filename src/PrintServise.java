public class PrintServise {
    public static void printHufflepuff(Hufflepuff hufflepuff) {
        System.out.println(hufflepuff.getName() + " учится на факультете " + hufflepuff.getFaculty() +
                ", умеет колдовать с мощностью " + hufflepuff.getPowerOfMagik() + " балов и может трансгрессировать на " +
                hufflepuff.getTransgretionsDistans() + " метров. А так же обладает трудолюбием в " + hufflepuff.getHardWorke() +
                " балов, верностью в " + hufflepuff.getLoyalty() + " балов и честностью в " + hufflepuff.getHonesty() +
                " балов.");
    }

    public static void printRavenclaw(Ravenclaw ravenclaw) {
        System.out.println(ravenclaw.getName() + " учится на факультете " + ravenclaw.getFaculty() +
                ", умеет колдовать с мощностью " + ravenclaw.getPowerOfMagik() + " балов и может трансгрессировать на " +
                ravenclaw.getTransgretionsDistans() + " метров. А так же обладает умом в " + ravenclaw.getMind() +
                " балов, мудростью в " + ravenclaw.getWisdom() + " балов, остроумием в " + ravenclaw.getWit() +
                " балов и творчеством в " + ravenclaw.getCreation() + " балов.");
    }

    public static void printSlytherin(Slytherin slytherin) {
        System.out.println(slytherin.getName() + " учится на факультете " + slytherin.getFaculty() +
                ", умеет колдовать с мощностью " + slytherin.getPowerOfMagik() + " балов и может трансгрессировать на " +
                slytherin.getTransgretionsDistans() + " метров. А так же обладает хитростью в " + slytherin.getCunning() +
                " балов, решительностью в " + slytherin.getDetermination() + " балов, амбициозностью в " + slytherin.getAmbition() +
                " балов, находчивостью в " + slytherin.getResourcefulness() + " и жаждой власти в "
                + slytherin.getThirstForPower() + " балов.");
    }

    public static void printGryffindor(Gryffindor gryffindor) {
        System.out.println(gryffindor.getName() + " учится на факультете " + gryffindor.getFaculty() +
                ", умеет колдовать с мощностью " + gryffindor.getPowerOfMagik() + " балов и может трансгрессировать на " +
                gryffindor.getTransgretionsDistans() + " метров. А так же обладает благородством в " + gryffindor.getNobility() +
                " балов, честью в " + gryffindor.getHonor() + " балов, храбростью в " + gryffindor.getBravery() +
                " балов");
    }
}
