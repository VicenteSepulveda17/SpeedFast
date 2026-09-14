import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class ZonaDeCarga {

    private BlockingQueue<Pedido> pedidos;

    public ZonaDeCarga(){
        pedidos = new LinkedBlockingQueue<>();
    }

    public synchronized void agregarPedido(Pedido p) {
        pedidos.add(p);
        System.out.println("Pedido #" + p.getId() + " agregado a la zona de carga.");
    }

    public synchronized Pedido retirarPedido(){
        return pedidos.poll(); //poll() intenta sacar un pedido de la cola

    }
}
