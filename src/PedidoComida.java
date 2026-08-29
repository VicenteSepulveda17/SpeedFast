public class PedidoComida extends Pedido implements Despachable, Cancelable, Rastreable {

    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm, ControladorDeEnvios controlador) {
        super(idPedido, direccionEntrega, distanciaKm, controlador);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) (15 + (2 * getDistanciaKm()));
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor....");
        System.out.println("Verificando mochila térmica... OK");
    }

    @Override
    public void asignarRepartidor(String nombre){
        System.out.println("Verificando mochila térmica... OK");
        System.out.println("Pedido asignado a: " + nombre);
    }

    @Override
    public void despachar(){
        System.out.println("Pedido de comida despachado correctamente.");
    }

    @Override
    public void cancelar(){
        System.out.println("Pedido de comida cancelado correctamente.");
    }

    @Override
    public void verHistorial(){
        getControlador().mostrarHistorial();
    }
}
