package Interface;

public interface Caminhante {
    void andar();
    
    
    default void mover() {
    	System.out.println("");
    }
}