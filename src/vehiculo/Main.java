
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoMartinFernandezFranciscoJavier2223 miVehiculoMartinFernandezFranciscoJavier2223;
        int stockActual;
        
        miVehiculoMartinFernandezFranciscoJavier2223 = new VehiculoMartinFernandezFranciscoJavier2223("Seat",18000,100);
        operativaVehiculosMartinFernandezFranciscoJavier2223(miVehiculoMartinFernandezFranciscoJavier2223, 50); 
    }

    private static void operativaVehiculosMartinFernandezFranciscoJavier2223(VehiculoMartinFernandezFranciscoJavier2223 miVehiculoMartinFernandezFranciscoJavier2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoMartinFernandezFranciscoJavier2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoMartinFernandezFranciscoJavier2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoMartinFernandezFranciscoJavier2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
