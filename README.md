# 📚 Trabajo Práctico - Programación Funcional en Java

## 📝 Descripción General

Este trabajo práctico tiene como objetivo practicar las **operaciones intermedias y terminales de los Streams en Java** para procesar colecciones de forma declarativa, aplicando los conceptos fundamentales de la programación funcional.

El proyecto incluye **4 casos prácticos** que demuestran el uso de:
- 🔄 **Streams API** de Java
- 🎯 **Expresiones Lambda**
- 📊 **Collectors** avanzados
- 🔍 **Operaciones de filtrado, mapeo y reducción**
- 📈 **Agrupación y estadísticas**

---

## 🎯 Objetivos del Trabajo Práctico

- ✅ Entender el pipeline de Streams
- ✅ Usar operaciones de mapeo, filtrado, reducción y agrupación
- ✅ Reemplazar código imperativo por un enfoque declarativo más claro
- ✅ Aplicar programación funcional en contextos reales
- ✅ Generar reportes y estadísticas con Streams
- ✅ Consolidar lambdas, collectors y manipulación funcional de listas

---

## 🏗️ Estructura del Proyecto

```
src/
└── TrabajoPracticoFuncional.java
    ├── Clase Alumno
    ├── Clase Producto
    ├── Clase Libro
    ├── Clase Empleado
    ├── caso1Alumnos()
    ├── caso2Productos()
    ├── caso3Libros()
    └── caso4Empleados()
```

---

## 🚀 Instrucciones de Ejecución

### Prerrequisitos

- **Java JDK 8 o superior** instalado
- **IDE** recomendado: IntelliJ IDEA, Eclipse, VS Code con Java Extension Pack
- Conocimientos básicos de Java y Streams

### Opción 1: Ejecutar desde la Terminal

```bash
# Compilar el programa
javac TrabajoPracticoFuncional.java

# Ejecutar el programa
java TrabajoPracticoFuncional
```

### Opción 2: Ejecutar desde un IDE

1. Abre el proyecto en tu IDE favorito
2. Localiza la clase `TrabajoPracticoFuncional`
3. Haz clic derecho en el archivo
4. Selecciona "Run" o "Ejecutar"

### Salida Esperada

El programa ejecutará los 4 casos prácticos en secuencia, mostrando resultados detallados en la consola para cada ejercicio.

---

## 📋 Casos Prácticos Implementados

### 🎓 Caso 1: Sistema de Gestión de Alumnos

**Clase:** `Alumno(nombre, nota, curso)`

**Operaciones implementadas:**

1. **Filtrar aprobados en mayúsculas**
    - Obtiene los nombres de alumnos con nota ≥ 7
    - Transforma a mayúsculas usando `map()`
    - Ordena alfabéticamente con `sorted()`

2. **Calcular promedio general**
    - Usa `mapToDouble()` para extraer notas
    - Calcula el promedio con `average()`

3. **Agrupar por curso**
    - Agrupa alumnos usando `Collectors.groupingBy()`
    - Genera un `Map<String, List<Alumno>>`

4. **Top 3 mejores promedios**
    - Ordena por nota descendente con `Comparator.reversed()`
    - Limita a 3 resultados con `limit()`

**Conceptos aplicados:**
- `filter()`, `map()`, `sorted()`, `limit()`
- `mapToDouble()`, `average()`
- `Collectors.groupingBy()`

---

### 🛒 Caso 2: Sistema de Gestión de Productos

**Clase:** `Producto(nombre, categoria, precio, stock)`

**Operaciones implementadas:**

1. **Listar productos caros ordenados**
    - Filtra productos con precio > $100
    - Ordena por precio descendente

2. **Stock total por categoría**
    - Agrupa por categoría
    - Suma el stock usando `Collectors.summingInt()`

3. **Generar reporte concatenado**
    - Mapea a formato "nombre;precio"
    - Une con `Collectors.joining(";")`

4. **Precios promedio**
    - Calcula promedio general con `averagingDouble()`
    - Calcula promedio por categoría

**Conceptos aplicados:**
- `filter()`, `sorted()`, `Comparator`
- `Collectors.summingInt()`
- `Collectors.joining()`
- `Collectors.averagingDouble()`
- `Collectors.groupingBy()` con collectors downstream

---

### 📖 Caso 3: Sistema de Gestión de Libros

**Clase:** `Libro(titulo, autor, paginas, precio)`

**Operaciones implementadas:**

1. **Listar libros extensos**
    - Filtra libros con más de 300 páginas
    - Extrae solo títulos
    - Ordena alfabéticamente

2. **Promedio de páginas**
    - Usa `mapToInt()` para trabajar con primitivos
    - Calcula el promedio eficientemente

3. **Contar libros por autor**
    - Agrupa por autor
    - Cuenta con `Collectors.counting()`

4. **Encontrar libro más caro**
    - Usa `max()` con comparador de precios
    - Retorna `Optional<Libro>`

**Conceptos aplicados:**
- `filter()`, `map()`, `sorted()`
- `mapToInt()`, `average()`
- `Collectors.counting()`
- `max()`, `Optional`

---

### 👥 Caso 4: Sistema de Gestión de Empleados

**Clase:** `Empleado(nombre, departamento, salario, edad)`

**Operaciones implementadas:**

1. **Filtrar salarios altos**
    - Filtra empleados con salario > $2000
    - Ordena por salario descendente

2. **Salario promedio general**
    - Calcula el promedio de todos los salarios

3. **Suma salarial por departamento**
    - Agrupa por departamento
    - Suma salarios con `Collectors.summingDouble()`

4. **Empleados más jóvenes**
    - Ordena por edad ascendente
    - Limita a los 2 primeros
    - Extrae solo nombres

**Conceptos aplicados:**
- `filter()`, `sorted()`, `limit()`
- `mapToDouble()`, `average()`
- `Collectors.summingDouble()`
- `Collectors.groupingBy()` con downstream collectors

---

## 🔑 Conceptos Clave de Programación Funcional

### Streams
Un **Stream** es un flujo de datos que permite aplicar transformaciones de forma declarativa:
```java
stream()
    .filter(...)      // Operación intermedia
    .map(...)         // Operación intermedia
    .collect(...)     // Operación terminal
```

### Operaciones Intermedias
Retornan un nuevo Stream y son **lazy** (no se ejecutan hasta que hay una operación terminal):
- `filter()` - Filtra elementos según un predicado
- `map()` - Transforma cada elemento
- `sorted()` - Ordena elementos
- `distinct()` - Elimina duplicados
- `limit()` - Limita cantidad de elementos

### Operaciones Terminales
Producen un resultado y consumen el Stream:
- `collect()` - Recolecta en colecciones
- `forEach()` - Itera sobre elementos
- `count()` - Cuenta elementos
- `reduce()` - Reduce a un único valor
- `average()`, `sum()`, `max()`, `min()`

### Collectors Avanzados
```java
// Agrupar
Collectors.groupingBy(Producto::getCategoria)

// Sumar
Collectors.summingInt(Producto::getStock)

// Contar
Collectors.counting()

// Promediar
Collectors.averagingDouble(Producto::getPrecio)

// Unir strings
Collectors.joining(";")
```

---

## 📊 Ejemplo de Salida

```
============== CASO 1: ALUMNOS ==============

1. Alumnos aprobados (nota ≥ 7) en mayúsculas:
ANA GARCÍA
CARLOS RUIZ
DIEGO FERNÁNDEZ
MARÍA LÓPEZ
PEDRO SÁNCHEZ
SOFÍA MARTÍNEZ

2. Promedio general de notas:
Promedio: 7.50

3. Alumnos agrupados por curso:
Curso 3A:
  - Ana García
  - María López
  - Laura Torres
  - Sofía Martínez
Curso 3B:
  - Juan Pérez
  - Carlos Ruiz
  - Pedro Sánchez
  - Diego Fernández

4. Los 3 mejores promedios:
  Sofía Martínez - Nota: 9.50
  María López - Nota: 9.00
  Ana García - Nota: 8.50

================================================================================
```

---

## 💡 Buenas Prácticas Aplicadas

### 1. Código Declarativo vs Imperativo

**❌ Enfoque Imperativo (NO recomendado):**
```java
List<String> aprobados = new ArrayList<>();
for (Alumno a : alumnos) {
    if (a.getNota() >= 7) {
        aprobados.add(a.getNombre().toUpperCase());
    }
}
Collections.sort(aprobados);
```

**✅ Enfoque Declarativo (recomendado):**
```java
List<String> aprobados = alumnos.stream()
    .filter(a -> a.getNota() >= 7)
    .map(a -> a.getNombre().toUpperCase())
    .sorted()
    .collect(Collectors.toList());
```

### 2. Method References
```java
// Lambda explícita
.map(alumno -> alumno.getNombre())

// Method reference (más limpio)
.map(Alumno::getNombre)
```

### 3. Manejo de Optional
```java
libros.stream()
    .max(Comparator.comparingDouble(Libro::getPrecio))
    .ifPresent(libro -> System.out.println(libro));
```

### 4. Streams Especializados
```java
// Mejor rendimiento con primitivos
.mapToInt(Libro::getPaginas)
.mapToDouble(Empleado::getSalario)
```

---

## 📚 Marco Teórico

| Concepto | Descripción | Aplicación en el Proyecto |
|----------|-------------|---------------------------|
| **Stream** | Flujo de datos que permite transformaciones | Procesar colecciones declarativamente |
| **Lambda** | Función anónima compacta | `a -> a.getNota() >= 7` |
| **Collectors** | Acumuladores de resultados | Agrupar, contar, promediar, unir |
| **Inmutabilidad** | Los streams no modifican la fuente | Evitar efectos secundarios |
| **Lazy Evaluation** | Operaciones intermedias no se ejecutan hasta terminal | Optimización de rendimiento |

---

## 🎓 Conclusiones del Trabajo Práctico

### Ventajas de la Programación Funcional

1. **Código más legible:** Las intenciones son claras y explícitas
2. **Menos propenso a errores:** No hay modificación de estado
3. **Más conciso:** Menos líneas de código
4. **Fácil paralelización:** `stream()` → `parallelStream()`
5. **Composición:** Encadenar operaciones de forma natural

### Aprendizajes Clave

- ✅ Los Streams procesan colecciones de forma declarativa
- ✅ Las lambdas reducen el boilerplate code
- ✅ Los Collectors son poderosos para agregaciones
- ✅ El código funcional es más mantenible
- ✅ La inmutabilidad previene bugs difíciles de detectar

### Casos de Uso Reales

- 📊 Análisis de datos y reportes
- 🔍 Filtrado y búsqueda de información
- 📈 Generación de estadísticas
- 🗂️ Agrupación y categorización
- 🔄 Transformación de datos entre formatos

---

## 🔗 Referencias y Recursos

### Documentación Oficial
- [Java Stream API Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)
- [Java Collectors Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html)

### Tutoriales Recomendados
- [Baeldung - Java Streams](https://www.baeldung.com/java-streams)
- [Oracle Java Tutorials - Lambda Expressions](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)
- [Java 8 Stream API Guide](https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/)

### Libros Recomendados
- "Modern Java in Action" - Raoul-Gabriel Urma
- "Java 8 in Action" - Manning Publications
- "Effective Java" (3rd Edition) - Joshua Bloch

---

## 👤 Información del Estudiante

- **Materia:** Desarrollo de Software
- **Universidad:** UTN - Universidad Tecnológica Nacional FRM
- **Tema:** Programación Funcional con Streams en Java

---

## 📄 Licencia

Este proyecto fue desarrollado con fines educativos para la materia Desarrollo de Software.