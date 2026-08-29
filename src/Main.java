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

        pedidoComida.verHistorial();
    }
}