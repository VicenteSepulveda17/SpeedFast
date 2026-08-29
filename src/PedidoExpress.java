public class PedidoExpress extends Pedido implements Despachable, Cancelable, Rastreable{

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm, ControladorDeEnvios controlador) {
        super(idPedido, direccionEntrega, distanciaKm, controlador);
    }

    @Override
    public int calcularTiempoEntrega() {

        if (getDistanciaKm() > 5) {
            return 15;
        }

        return 10;
    }

    @Override
    public void asignarRepartidor(){
        System.out.println("[Pedido Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("-> Buscando repartidor más cercano con disponibilidad inmediata...");
        System.out.println("-> Repartidor disonible encontrado.");
    }

    @Override
    public void asignarRepartidor(String nombre){
        System.out.println("->Repartidor más cercano con disponibilidad inmediata encontrado.");
        System.out.println("Pedido asignado a: " + nombre);
    }

    @Override
    public void despachar(){
        System.out.println("Pedido express despachado correctamente.");
    }

    @Override
    public void cancelar(){
        System.out.println("Pedido express cancelado correctamente.");
    }

    @Override
    public void verHistorial(){
        getControlador().mostrarHistorial();
    }
}
