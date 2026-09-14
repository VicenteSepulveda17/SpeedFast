# SpeedFast - Semana 5

Proyecto desarrollado en Java para la simulación de un sistema de entregas concurrentes de SpeedFast.

## Descripción

En esta semana se implementa un sistema de gestión de pedidos utilizando programación concurrente en Java.

Los pedidos son almacenados en una zona de carga compartida, desde donde distintos repartidores pueden retirar pedidos y procesarlos de manera independiente.

El sistema utiliza hilos para permitir que varios repartidores trabajen simultáneamente, asegurando que cada pedido sea retirado y procesado solamente por un repartidor.

## Contenidos

- Clase `Pedido`.
- Enumeración `EstadoPedido`.
- Clase `ZonaDeCarga`.
- Clase `Repartidor` implementando `Runnable`.
- Uso de `ExecutorService`.
- Ejecución concurrente de repartidores.
- Manejo seguro de una cola de pedidos compartida.
- Cambio de estados de los pedidos.
- Uso de `Thread.sleep()` para simular el tiempo de entrega.
- Manejo de `InterruptedException`.

## Estados de los pedidos

Los pedidos utilizan el enum `EstadoPedido`, que contiene los siguientes estados:

- `PENDIENTE`: el pedido está esperando en la zona de carga.
- `EN_REPARTO`: un repartidor ha retirado el pedido y se encuentra realizando la entrega.
- `ENTREGADO`: la entrega ha finalizado correctamente.

## Zona de carga

La clase `ZonaDeCarga` representa el recurso compartido entre los repartidores.

Los pedidos pendientes se almacenan mediante una `BlockingQueue<Pedido>`, permitiendo retirar los pedidos de forma controlada.

Sus principales métodos son:

- `agregarPedido(Pedido p)`: agrega un pedido a la zona de carga.
- `retirarPedido()`: retira un pedido disponible de la zona de carga.

El acceso sincronizado permite evitar que dos repartidores retiren el mismo pedido al mismo tiempo.

## Repartidores

La clase `Repartidor` implementa la interfaz `Runnable`.

Cada repartidor recibe:

- Un nombre.
- Una referencia a la zona de carga compartida.

Cada hilo realiza el siguiente proceso:

1. Retira un pedido de la zona de carga.
2. Cambia su estado a `EN_REPARTO`.
3. Simula el tiempo de entrega mediante `Thread.sleep()`.
4. Cambia el estado del pedido a `ENTREGADO`.
5. Continúa procesando pedidos hasta que la zona de carga queda vacía.

## Ejecución concurrente

El programa utiliza `ExecutorService` con un grupo de 3 hilos para ejecutar simultáneamente a los repartidores.

Se crean tres repartidores:

- Juan
- Camila
- Pedro

Los tres trabajan sobre la misma `ZonaDeCarga`.

El sistema agrega cinco pedidos y los distribuye entre los repartidores de forma concurrente.

## Resultado esperado

Al ejecutar la clase `Main`, se puede observar en la consola cómo los distintos repartidores retiran y procesan los pedidos simultáneamente.

Ejemplo:

[Repartidor - Juan] Retirando pedido #1
[Repartidor - Camila] Retirando pedido #2
[Repartidor - Pedro] Retirando pedido #3

[Repartidor - Juan] Pedido #1 en reparto. Estado: EN_REPARTO
[Repartidor - Camila] Pedido #2 en reparto. Estado: EN_REPARTO
[Repartidor - Pedro] Pedido #3 en reparto. Estado: EN_REPARTO

[Repartidor - Juan] Pedido #1 entregado. Estado: ENTREGADO
[Repartidor - Camila] Pedido #2 entregado. Estado: ENTREGADO
[Repartidor - Pedro] Pedido #3 entregado. Estado: ENTREGADO

Al finalizar el procesamiento:

Todos los pedidos han sido entregados correctamente

## Tecnologías utilizadas

- Java
- Programación Orientada a Objetos
- Programación concurrente
- `Runnable`
- `Thread`
- `ExecutorService`
- `BlockingQueue`
- `LinkedBlockingQueue`

## Estructura del proyecto

semana 5/
└── src/
    ├── EstadoPedido.java
    ├── Main.java
    ├── Pedido.java
    ├── Repartidor.java
    └── ZonaDeCarga.java

## Ejecución

Para ejecutar el proyecto, abrir la clase `Main` desde IntelliJ IDEA y ejecutar el método `main`.

## Autor

Vicente Sepúlveda
