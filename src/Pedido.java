public abstract class Pedido  implements Despachable, Cancelable, Rastreable{

    private int idPedido;
    private String direccionEntrega;
    private double distanciaKm;
    private ControladorDeEnvios controlador;

    public Pedido(int idPedido, String direccionEntrega, double distanciaKm, ControladorDeEnvios controlador) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
        this.controlador = controlador;
    }

    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
    }

    public abstract int calcularTiempoEntrega();

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public ControladorDeEnvios getControlador(){
        return controlador;
    }

    public void asignarRepartidor(){
        System.out.println("Asignando repartidor para el pedido...");
    }

    public void asignarRepartidor(String nombre){
        System.out.println("Pedido asignado a: " + nombre);
    }
}
