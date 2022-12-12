package daw1.prog.UT3.abstrac;

public class MainPrincipal {
    public static void main(String[] args) {
        Animal a=new Gato();
        Integer numPatas=a.getNumPata();
        System.out.println("El perro tiene "+numPatas);
        System.out.println(a.esMamifero());
    }
}
