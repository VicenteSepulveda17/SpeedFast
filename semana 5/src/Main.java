import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) {

        ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

        System.out.println("===== ZONA DE CARGA =====");

        zonaDeCarga.agregarPedido(new Pedido(1, "Av. Italia 456"));
        zonaDeCarga.agregarPedido(new Pedido(2, "Av. Grecia 123"));
        zonaDeCarga.agregarPedido(new Pedido(3, "Av. Vicuña Mackenna 789"));
        zonaDeCarga.agregarPedido(new Pedido(4, "Av. Providencia 321"));
        zonaDeCarga.agregarPedido(new Pedido(5, "Av. La Florida 654"));

        ExecutorService executor = Executors.newFixedThreadPool(3); //Crea un grupo de 3 hilos para los 3 repartidores.

        Repartidor repartidor1 = new Repartidor("Juan", zonaDeCarga);
        Repartidor repartidor2 = new Repartidor("Camila", zonaDeCarga);
        Repartidor repartidor3 = new Repartidor("Pedro", zonaDeCarga);

        executor.submit(repartidor1);
        executor.submit(repartidor2);
        executor.submit(repartidor3);

        executor.shutdown();

        try {
            if (executor.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("Todos los pedidos han sido entregados correctamente");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}