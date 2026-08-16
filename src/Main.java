public class Main {

    public static void main(String[] args) {

        Pedido pedidoComida = new PedidoComida(
                1,
                "Av. Providencia 123"
        );

        Pedido pedidoEncomienda = new PedidoEncomienda(
                2,
                "Av. Grecia 456"
        );

        Pedido pedidoExpress = new PedidoExpress(
                3,
                "Av. Macul 789"
        );

        pedidoComida.asignarRepartidor();
        pedidoComida.asignarRepartidor("Leonel Sánchez");

        System.out.println();

        pedidoEncomienda.asignarRepartidor();
        pedidoEncomienda.asignarRepartidor("Carlos Campos");

        System.out.println();

        pedidoExpress.asignarRepartidor();
        pedidoExpress.asignarRepartidor("Pedro González");
    }
}
