# SpeedFast - Semana 4

Proyecto desarrollado en Java para la simulación de entregas concurrentes de pedidos en SpeedFast.

## Contenidos

- Uso de la clase abstracta `Pedido`.
- Herencia con `PedidoComida`, `PedidoEncomienda` y `PedidoExpress`.
- Interfaces `Despachable`, `Cancelable` y `Rastreable`.
- Clase `Repartidor` implementando `Runnable`.
- Ejecución de múltiples repartidores mediante `ExecutorService`.
- Procesamiento concurrente de pedidos.
- Simulación de tiempos de entrega mediante `Thread.sleep()` con valores aleatorios.
- Manejo de `InterruptedException`.
- Registro de las entregas realizadas en `ControladorDeEnvios`.
- Consulta del historial de entregas.

## Funcionamiento

El programa crea seis pedidos y los distribuye entre tres repartidores.

Cada repartidor procesa sus pedidos de forma secuencial, mientras que los tres repartidores se ejecutan simultáneamente mediante un `ExecutorService`.

El tiempo de cada entrega se simula utilizando valores aleatorios mediante `Thread.sleep()`.

Al finalizar todas las entregas, se muestra el historial de pedidos registrados.

## Ejecución

Ejecutar la clase `Main` desde IntelliJ IDEA para iniciar la simulación y visualizar el resultado por consola.

## Tecnologías

- Java
- Programación Orientada a Objetos
- `Runnable`
- `Thread`
- `ExecutorService`
- `ArrayList`

## Autor

Vicente Sepúlveda
