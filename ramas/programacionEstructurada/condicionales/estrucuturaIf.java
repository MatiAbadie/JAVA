package programacionEstructurada.condicionales;

public class estrucuturaIf {
    public static void main(String[] args) {

        int topScore = 200;

        if( topScore < 100) {
            System.out.println("Top score es menor a 100");
        }

        int secondScore = 70;

        if ( topScore > secondScore && topScore == 90) {
            System.out.println("topScore es mayor a secondScore y es menor o igual a 90");
        }

        if (topScore > 90 ||  secondScore < 70)

            System.out.println("Se cumple que topScore > 90 || secondScore < 70");
    }
    
}
