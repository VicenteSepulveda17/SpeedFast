import java.util.ArrayList;


public class ControladorDeEnvios {

    private ArrayList<Pedido> historial;

    public ControladorDeEnvios(){
        historial = new ArrayList<>();
    }

    public void registrarEntrega(Pedido pedido){
        historial.add(pedido);
    }

    public void mostrarHistorial(){

        System.out.println("===== HISTORIAL DE ENTREGAS =====");

        if (historial.isEmpty()){
            System.out.println("No hay entregas registradas.");
            return;
        }

        for (Pedido pedido : historial){
            pedido.mostrarResumen();
            System.out.println();
        }
    }
}
