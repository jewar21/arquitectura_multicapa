1. Modelo --> Producto

Contiene: 
 - Código.
 - Nombre.
 - Precio.
 - Cantidad disponible.
 - Constructor.
 - Métodos de acceso.

NO debería:
 - Leer datos con Scanner.
 - Mostrar Menús.
 - Guardarse a si mismo en un arreglo.

2. Datos o repositorio
se encarga de:
 - Guardar productos.
 - Buscar productos.
 - Listar los productos almacenados.
 - Conocer la estructura utilizada para almacenar.

No debería
 - Solicitar información al usuario.
 - Imprimir mensajes.
 - Decidir si un precio es válido.

3. Negocio o Servicio
Se encarga de:
 - Validar las reglas.
 - Enviar códigos repetivos.
 - Impedir precios inválidos.
 - Coordinar operaciones con el repositorio.
 - Realizar cálculos del negocio.

No debería:
 - Utilizar Scanner.
 - Mostrar el Menú.
 - Conocimiento sobre como esta organizado el almacenamiento.

4. Capa de presentación o vista
Se encarga de:
 - Mostrar Menú.
 - Capturar los datos.
 - Llamar a servicio.
 - Presentar los resultados.

No debería:
 - Guardar directamente en el arreglo.
 - Válidar reglas comerciales complejas.
 - Calcular valores del inventario.

# Historico de inventario
Una tienda necesita una aplicación de consola que permita:
1. Registrar productos.
2. Listar productos.
3. Buscar un producto por código.
4. Calcular el valor total del inventario.

Cada producto tendrá:
 - Código entero.
 - Nombre cadena.
 - Precio decimal.
 - Cantidad disponible entera.

Reglas de Negocio
 - El código deber ser mayor que cero.
 - No puede existir otro producto con el mismo código.
 - El nombre no puede estar vacío.
 - El precio debe ser mayor que cero.
 - La cantidad no puede ser negativa.
 - El inventario tendrá una capacidad máxima de 20 productos.

 ## Estructura del proyecto
src/
├── app/
│   └── Main.java
├── model/
│   └── Producto.java
├── repository/
│   └── ProductoRepository.java
└── view/
    └── ProductoView.java
