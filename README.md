# 💰 Conversor de Monedas (Exchange Rate API)

Este proyecto es una aplicación de consola en Java diseñada para realizar conversiones de moneda en tiempo real, utilizando la Programación Orientada a Objetos (POO) para mantener el código modular, escalable y fácil de mantener. Ha sido desarrollado como parte del programa **Oracle Next Education (ONE)** en colaboración con **Alura Latam**.

## 🚀 Funcionalidades Principales

El sistema permite la interacción directa con el usuario a través de un menú en la consola y gestiona la comunicación con un servicio externo (API).

- **Conversión en Tiempo Real:** Las tasas de cambio se obtienen en el momento de la solicitud, garantizando resultados precisos.
- **Menú Interactivo:** Ofrece un menú de 6 opciones predefinidas para conversiones bidireccionales de las monedas más comunes en Latinoamérica.
- **Manejo de Errores:** Implementación de bloques `try-catch` para controlar:
  - Errores de conexión o API (ej. 404 Not Found).
  - Entradas de usuario no numéricas.
- **Conversiones Soportadas:**
  - Dólar (USD) a Peso Argentino (ARS)
  - Peso Argentino (ARS) a Dólar (USD)
  - Dólar (USD) a Real Brasileño (BRL)
  - Real Brasileño (BRL) a Dólar (USD)
  - Dólar (USD) a Peso Colombiano (COP)
  - Peso Colombiano (COP) a Dólar (USD)

## 💻 Estructura del Proyecto (POO y Factorización)

El código está factorizado en paquetes para delegar responsabilidades, demostrando la aplicación de la POO.

| Paquete    | Clase             | Responsabilidad                                                                    |
|------------|-------------------|------------------------------------------------------------------------------------|
| `principal`| `Principal.java`  | **Control:** Contiene el `main()`, presenta el menú y gestiona la interacción (Scanner). |
| `servicio` | `ConsultaApi.java`| **Conexión:** Encapsula la lógica de red (`HttpClient`) para la comunicación con la API. |
| `modelos`  | `MonedaRecord.java`| **Datos (DTO):** Un record de Java inmutable para mapear y almacenar la respuesta JSON de la API (`Gson`). |

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Java 17
- **Librerías:**
  - `java.net.http.HttpClient`: Para realizar peticiones HTTP.
  - `Gson`: Para la deserialización de objetos JSON a clases Java.

## 🚀 Cómo Ejecutar el Proyecto

1. **Clonar el Repositorio:**
   ```bash
   git clone https://github.com/Galking-droid/desafio-conversor-monedas-java-backend.git
   ```
2. **API Key:** El proyecto requiere una clave de API de [Exchange Rate API](https.www.exchangerate-api.com/). Debes obtener tu clave y crear un archivo `config.properties` en la raíz del proyecto con el siguiente contenido:
   ```properties
   api.key=TU_API_KEY
   ```
3. **Compilación y Ejecución:** Compila y ejecuta la clase `com.aluracursos.conversor.principal.Principal` en tu IDE (IntelliJ, Eclipse) o desde la línea de comandos.

## 📸 Ejemplo de Interacción
```
****************************************
                Bienvenido/a al Conversor de Monedas

                1) Dólar (USD) a Peso Argentino (ARS)
                2) Peso Argentino (ARS) a Dólar (USD)
                3) Dólar (USD) a Real Brasileño (BRL)
                4) Real Brasileño (BRL) a Dólar (USD)
                5) Dólar (USD) a Peso Colombiano (COP)
                6) Peso Colombiano (COP) a Dólar (USD)
                7) Salir

                Seleccione una opción:
****************************************
1

Ingrese la cantidad que desea convertir:
100

========================================
El valor de 100.00 [USD] corresponde al valor final de 87500.00 [ARS]
========================================

Presione Enter para continuar al menú...
```

## 👤 Autor

**Joseph Gama**
