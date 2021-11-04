public interface Polluter {
    
    int co2 = 0 ; 

    public abstract  void expulsaC02();

     public default void carburant() {
        System.out.println("My carburant is Gasoline");
    }
}
