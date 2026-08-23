SpeedFast

Proyecto desarrollado para la actividad de la Semana 1 de Desarrollo Orientado a Objetos II.

Descripción

SpeedFast es un sistema de reparto a domicilio que permite representar distintos tipos de pedidos y asignar repartidores según las características de cada servicio.

El proyecto implementa una jerarquía de clases utilizando herencia y polimorfismo, aplicando los conceptos de sobreescritura y sobrecarga de métodos.

Tipos de pedidos

El sistema contempla tres tipos de pedidos:

PedidoComida: requiere verificar que el repartidor cuente con mochila térmica.
PedidoEncomienda: requiere validar el peso y el embalaje del pedido.
PedidoExpress: busca asignar un repartidor cercano con disponibilidad inmediata.
Conceptos aplicados
Programación Orientada a Objetos.
Encapsulamiento.
Herencia.
Polimorfismo.
Sobreescritura de métodos (@Override).
Sobrecarga de métodos.
Constructores.
Getters y setters.
Estructura del proyecto
SpeedFast
│
├── src
│   ├── Pedido.java
│   ├── PedidoComida.java
│   ├── PedidoEncomienda.java
│   ├── PedidoExpress.java
│   └── Main.java
│
└── README.md
Ejecución

El proyecto fue desarrollado en Java utilizando IntelliJ IDEA.

La ejecución se realiza desde la clase Main, donde se crean objetos de los distintos tipos de pedido y se prueban los métodos asignarRepartidor() y asignarRepartidor(String nombreRepartidor).

Autor

Vicente Sepúlveda
