import java.util.List;

public class Repartidor implements Runnable {

    private String nombre;
    private List<Pedido> pedidos;

    public Repartidor(String nombre, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.pedidos = pedidos;
    }

    @Override
    public void run() {

        // Recorre todos los pedidos que tiene asignados el repartidor
        for (Pedido pedido : pedidos) {

            System.out.println("[Repartidor: " + nombre + "] Entregando pedido #"
                    + pedido.getIdPedido());

            try {
                // Simula un tiempo de entrega aleatorio entre 1 y 4 segundos
                int tiempo = 1000 + (int) (Math.random() * 3000);
                Thread.sleep(tiempo);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("[Repartidor: " + nombre + "] Pedido #"
                    + pedido.getIdPedido() + " entregado.");

            pedido.getControlador().registrarEntrega(pedido);
        }
    }
}
