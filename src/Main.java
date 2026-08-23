public class Main {

    public static void main(String[] args) {

        Pedido pedidoComida = new PedidoComida(
                1,
                "Av. Italia 456",
                4
        );

        Pedido pedidoEncomienda = new PedidoEncomienda(
                2,
                "Av. Independencia 123",
                6
        );

        Pedido pedidoExpress = new PedidoExpress(
                3,
                "Av. Apoquindo 1500",
                7
        );

        pedidoComida.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + pedidoComida.calcularTiempoEntrega() + " minutos");

        System.out.println();

        pedidoEncomienda.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + pedidoEncomienda.calcularTiempoEntrega() + " minutos");

        System.out.println();

        pedidoExpress.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: "
                + pedidoExpress.calcularTiempoEntrega() + " minutos");
    }
}