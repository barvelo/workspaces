public class Vehicles {

    String color ;

    int plazas ; 

    double peso ;

    int puertas ;

    public void acelerar() {
        System.out.println("El vehiculo está acelerando...");
     }

     public void frenar() {
        System.out.println("El "+ this.getClass().getSimpleName()+ " está frenando...");

     }
    
     public void abrirPuertas() {
        System.out.println("El tren abre las puertas...");

        
    }

    public void estacionar() {
        System.out.println("El autubus está estacionando...");

    }
}
