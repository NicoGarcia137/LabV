# LabV
 #TPCerveceria 

 1 ¿Cuántos consumidores se necesitan para que el stock llegue a 0?
En este sistema los consumidores pueden consumir la cantidad que se quiera ya que la misma es generada por un numero de forma random y cuantas veces quiera.La cantidad de consumiciones que se realicen para que el stock llegue a 0 es relativo por cada vez que se ejecute . 


2 Los bloques synchronized, ¿por qué deben serlos?
Con eso se asegura la exclusión mutua, y que el consumidor y el productor , no puedan acceder a la cervecería  al mismo tiempo evitando  producir o un fallo o un deadlock.

3 Explicar el recurso compartido.
El recurso compartido en este sistema es la cervecería (BeerHouse), el BeerConsumer (consumidor) y el BeerProducter (productor) realizan cambios en dicho recurso compartido, reabasteciendo el stock de la cervecería en el caso del productor y consumiendo dicho stock en el caso del consumidor. El motivo de que la cerveceria sea compartida es para que se realicen acciones sobre una unica cerveceria , en vez de crear una cerveceria por cada productor/consumidor que se instancie. 



4 Explicar las 3 formas de instanciar un Thread.
 Las tres formas de instanciar un Thread son:
 Mediante una instancia con un new donde tengamos en algun parametro un objeto que implemente Runnable y extienda de otra clase o de Thread para poder usar el metodo start() y iniciarlo.Implementándolo , que una clase implemente la interfaz Runnable , liberando la opcion de que esa clase tenga que heredar de otra o extender de Thread.Y extendiendolo , que una clase extienda Thread para utilizar el metodo start().

