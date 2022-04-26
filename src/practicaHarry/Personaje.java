package practicaHarry;

public class Personaje{
    public static void main (String [] args) {
        Harry();
        Ron();
        Draco();
        Luna();
        newt();
    }

    private static void Harry(){
        Harry Harry = new Harry(
                "Masculino",
          "Harry Poteter",
                "Gryffindor",
                "Dementor",
                "Ciervo");
        System.out.println(Harry.showMessage());
        System.out.println("---");
    }
    private static void Ron(){
        Harry Harry = new Harry(
                "Masculino",
                "Ron Weasley",
                "Gryffindor",
                "Lord Voldemor",
                "Dragon");
        System.out.println(Harry.showMessage());
        System.out.println("---");
    }
    private static void Draco(){
        Harry Harry = new Harry(
                "Masculino",
                "Draco Malfoy",
                "slytherin ",
                "Dementor",
                "Ciervo");
        System.out.println(Harry.showMessage());
        System.out.println("---");
    }
    private static void Luna(){
        Harry Harry = new Harry(
                "Femenino",
                "Luna Lovegood",
                "ravenclaw",
                "friends",
                "Hare");
        System.out.println(Harry.showMessage());
        System.out.println("---");
    }
    private static void  newt(){
        Harry Harry = new Harry(
                "Masculino",
                "newt scamander",
                "Hufflepuff",
                "Escritorio",
                "Ciervo");
        System.out.println(Harry.showMessage());
        System.out.println("---");
    }

}
