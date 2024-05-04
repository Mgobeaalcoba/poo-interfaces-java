## POO: Interfaces

### ¿Qué es una interfaz?

Una interfaz es un contrato que se establece entre dos partes, en este caso entre dos clases. La interfaz define los métodos que una clase debe implementar para cumplir con el contrato.

### ¿Para qué sirve una interfaz?

Una interfaz sirve para definir un conjunto de métodos que una clase debe implementar. Esto permite que una clase pueda ser utilizada en diferentes contextos, siempre y cuando implemente los métodos definidos en la interfaz.

### ¿Cómo se define una interfaz?

En Java, una interfaz se define utilizando la palabra clave `interface`. A continuación se muestra un ejemplo de cómo se define una interfaz:

```java
public interface NombreDeLaInterfaz {
    // Métodos que debe implementar la clase
}
```

### ¿Cómo se implementa una interfaz?

Una clase puede implementar una interfaz utilizando la palabra clave `implements`. A continuación se muestra un ejemplo de cómo se implementa una interfaz:

```java
public class NombreDeLaClase implements NombreDeLaInterfaz {
    // Implementación de los métodos de la interfaz
}
```

### ¿Cual es la diferencia entre una interface y una clase abstracta?

La principal diferencia entre una interfaz y una clase abstracta es que una interfaz solo puede contener métodos abstractos y constantes, mientras que una clase abstracta puede contener métodos con implementación y variables de instancia.
La segunda diferencia es que una clase puede implementar múltiples interfaces, pero solo puede heredar de una clase abstracta.
La tercera diferencia es que una interfaz no puede tener constructores, mientras que una clase abstracta sí puede tenerlos.

### ¿Cuándo se debe utilizar una interfaz?

Una interfaz se debe utilizar cuando se quiere definir un conjunto de métodos que una clase debe implementar. Esto es útil cuando se quiere asegurar que una clase cumpla con ciertos requisitos o cuando se quiere permitir que una clase sea utilizada en diferentes contextos.

### ¿Cuándo se debe utilizar una clase abstracta?

Una clase abstracta se debe utilizar cuando se quiere definir una clase base que no puede ser instanciada directamente, pero que puede ser heredada por otras clases. Esto es útil cuando se quiere proporcionar una implementación base para las clases hijas, pero se quiere obligar a las clases hijas a implementar ciertos métodos.

### ¿Cuándo se debe utilizar una clase concreta?

Una clase concreta se debe utilizar cuando se quiere definir una clase que puede ser instanciada directamente. Esto es útil cuando se quiere definir una clase que no tiene requisitos especiales y que puede ser utilizada en cualquier contexto.

### ¿Como instanciar objetos de clases que implmentan una interfaz para hacer escalable el código?

Para instanciar objetos de clases que implementan una interfaz, se puede utilizar el polimorfismo. El polimorfismo permite tratar a un objeto de una clase concreta como si fuera de una interfaz, siempre y cuando la clase implemente la interfaz.
Ejemplo:
    
```java
    public interface Animal {
        void comer();
    }

    public class Perro implements Animal {
        @Override
        public void comer() {
            System.out.println("El perro está comiendo");
        }
    }

    public class Gato implements Animal {
        @Override
        public void comer() {
            System.out.println("El gato está comiendo");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal animal1 = new Perro();
            Animal animal2 = new Gato();

            animal1.comer();
            animal2.comer();
        }
    }
   ```
