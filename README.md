##  Evaluación: Estructuras de Datos con Set y Map y logica de arboles

## Estudiante: Victoria Andrade

## Salida del terminal

<img width="488" height="626" alt="image" src="https://github.com/user-attachments/assets/6e602417-66c3-49c9-af35-fb43112015e3" />


## Nota

<img width="1412" height="888" alt="image" src="https://github.com/user-attachments/assets/36cb688d-7be3-4cf0-ab7d-3e27703723f6" />


### Objetivo

Implementar la funcionalidad solicitada en la clase `LibroController` para ordenar y gestionar objetos de tipo `Book` utilizando colecciones que mantengan un orden definido.

---

## 🧩 Modelo

Clase: `models.Book`

### 📑 Atributos

| Atributo | Tipo   | Descripción        |
| -------- | ------ | ------------------ |
| `titulo` | String | Título del libro   |
| `autor`  | String | Autor del libro    |
| `anio`   | int    | Año de publicación |

### 🧠 Consideraciones de ordenamiento

Los libros deben estar **ordenados primero por título en orden descendente** y, en caso de empate, por año de publicación en orden ascendente. En caso de que dos libros tengan el mismo título y año, se considerarán duplicados y no deben incluirse en el resultado final.

---

## Controlador

Clase: `controllers.LibroController`

---



###  Método: `procesarLibros(List<Book> libros)`

🔹 **Objetivo**: Implementar este método para retornar un `Map<Book, Book>` donde cada libro es la clave y su mismo objeto el valor.

🔸 **Tipo de retorno**: `Map<Book, Book>`

💡 **Pista**: la estructura debe permitir mantener el orden definido por los libros y evitar claves duplicadas según el criterio.

---

## 📌 Instrucciones

1. Clona el repositorio del proyecto desde GitHub.
2. Sube el proyecto a tu repositorio personal y el enlace al AVAC.
3. Implementa correctamente el método en la clase `LibroController`.
4. Sube el proyecto a tu repositorio correctamente.

---

## 📦 Evaluación Automática

El sistema usará GitHub Actions para compilar y ejecutar los tests automáticamente.
Recuerda que cada test aprobado sumará a tu nota final.

---

## ✅ Criterios de Evaluación

| Criterio                             | Puntos    |
| ------------------------------------ | --------- |
| `procesarLibros` funcional           | 10.0      |
| Tests ejecutan sin errores           | Requisito |
| Nota final calculada automáticamente | -         |

DEBERA EJECUTAR PRUEBAS DESDE APP.
