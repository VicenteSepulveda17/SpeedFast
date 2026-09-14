import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        //Controlador encargado de gestionar los envíos y el historial
        ControladorDeEnvios controlador = new ControladorDeEnvios();

        //Creación de pedidos
        Pedido pedidoComida = new PedidoComida(
                1,
                "Av. Italia 456",
                4,
                controlador
        );

        Pedido pedidoEncomienda = new PedidoEncomienda(
                2,
                "Av. Independencia 123",
                6,
                controlador
        );

        Pedido pedidoExpress = new PedidoExpress(
                3,
                "Av. Apoquindo 1500",
                7,
                controlador
        );

        Pedido pedidoComida2 = new PedidoComida(
                4,
                "Av. Providencia 100",
                3,
                controlador
        );

        Pedido pedidoEncomienda2 = new PedidoEncomienda(
                5,
                "Av. Grecia 789",
                8,
                controlador
        );

        Pedido pedidoExpress2 = new PedidoExpress(
                6,
                "Av. Macul 321",
                5,
                controlador
        );


        //Listas de pedidos por repartidor
        List<Pedido> pedidosRepartidor1 = new ArrayList<>();
        List<Pedido> pedidosRepartidor2 = new ArrayList<>();
        List<Pedido> pedidosRepartidor3 = new ArrayList<>();

        pedidosRepartidor1.add(pedidoComida);
        pedidosRepartidor1.add(pedidoEncomienda);

        pedidosRepartidor2.add(pedidoExpress);
        pedidosRepartidor2.add(pedidoComida2);

        pedidosRepartidor3.add(pedidoEncomienda2);
        pedidosRepartidor3.add(pedidoExpress2);

        Repartidor repartidor1 = new Repartidor(
                "Camila",
                pedidosRepartidor1
        );

        Repartidor repartidor2 = new Repartidor(
                "Luis",
                pedidosRepartidor2
        );

        Repartidor repartidor3 = new Repartidor(
                "Daniela",
                pedidosRepartidor3
        );

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(repartidor1);
        executor.submit(repartidor2);
        executor.submit(repartidor3);

        executor.shutdown();

        try {
            executor.awaitTermination(10, java.util.concurrent.TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println();
        System.out.println("==========================================");
        System.out.println("          CONSULTA DE HISTORIAL");
        System.out.println("==========================================");

        controlador.mostrarHistorial();



        /*
        // ==========================================
        // PEDIDO DE COMIDA
        // ==========================================

        System.out.println("==========================================");
        System.out.println("             PEDIDO DE COMIDA");
        System.out.println("==========================================");

        pedidoComida.mostrarResumen();

        System.out.println();
        System.out.println("Asignación automática:");
        pedidoComida.asignarRepartidor();

        System.out.println();
        System.out.println("Asignación manual:");
        pedidoComida.asignarRepartidor("Luis Díaz");

        System.out.println();
        System.out.println("Tiempo estimado de entrega: "
                + pedidoComida.calcularTiempoEntrega() + " minutos");

        System.out.println();
        pedidoComida.despachar();

        // Se registra como entrega realizada
        controlador.registrarEntrega(pedidoComida);


        // ==========================================
        // PEDIDO DE ENCOMIENDA
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("           PEDIDO DE ENCOMIENDA");
        System.out.println("==========================================");

        pedidoEncomienda.mostrarResumen();

        System.out.println();
        System.out.println("Asignación automática:");
        pedidoEncomienda.asignarRepartidor();

        System.out.println();
        System.out.println("Asignación manual:");
        pedidoEncomienda.asignarRepartidor("Daniela Tapia");

        System.out.println();
        System.out.println("Tiempo estimado de entrega: "
                + pedidoEncomienda.calcularTiempoEntrega() + " minutos");

        System.out.println();
        pedidoEncomienda.despachar();

        // Se registra como entrega realizada
        controlador.registrarEntrega(pedidoEncomienda);


        // ==========================================
        // PEDIDO EXPRESS
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("             PEDIDO EXPRESS");
        System.out.println("==========================================");

        pedidoExpress.mostrarResumen();

        System.out.println();
        System.out.println("Asignación automática:");
        pedidoExpress.asignarRepartidor();

        System.out.println();
        System.out.println("Asignación manual:");
        pedidoExpress.asignarRepartidor("Pedro González");

        System.out.println();
        System.out.println("Tiempo estimado de entrega: "
                + pedidoExpress.calcularTiempoEntrega() + " minutos");


        // ==========================================
        // CANCELACIÓN
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              CANCELACIÓN");
        System.out.println("==========================================");

        System.out.println("Cancelando Pedido Express #103...");
        pedidoExpress.cancelar();

        // No se registra en el historial porque fue cancelado


        // ==========================================
        // HISTORIAL
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("          CONSULTA DE HISTORIAL");
        System.out.println("==========================================");

        pedidoComida.verHistorial();*/

    }
}