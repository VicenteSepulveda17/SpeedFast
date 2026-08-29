public class PedidoEncomienda extends Pedido implements Despachable, Cancelable, Rastreable {

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm, ControladorDeEnvios controlador) {
        super(idPedido, direccionEntrega, distanciaKm, controlador);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int) Math.round(20 + (1.5 * getDistanciaKm()));
    }

    @Override
    public void asignarRepartidor(){
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("Validando peso y embalaje... OK");
    }

    @Override
    public void asignarRepartidor(String nombre){
        System.out.println("Validando peso y embalaje... OK");
        System.out.println("Pedido asignado a: " + nombre);
    }

    @Override
    public void despachar(){
        System.out.println("Pedido de encomienta despachado correctamente.");
    }

    @Override
    public void cancelar(){
        System.out.println("Pedido de encomienda cancelado correctamente.");
    }

    @Override
    public void verHistorial(){
        getControlador().mostrarHistorial();
    }
}