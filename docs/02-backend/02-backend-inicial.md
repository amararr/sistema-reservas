# 🚀 Backend Inicial — Spring Boot

## 🎯 Objetivo

Construir un backend funcional básico utilizando Spring Boot, comprendiendo la estructura del proyecto y el flujo completo de una petición HTTP.

---

## 📦 Creación del proyecto

El proyecto se genera mediante Spring Initializr con:

* Maven
* Java 17
* Dependencias:

  * Spring Web
  * Spring Data JPA
  * Validation
  * H2 Database

---

## 📁 Estructura base

Una vez generado, el proyecto presenta:

```text
backend/
├── pom.xml
├── mvnw
├── src/
```

---

## 📂 Organización por capas

Se crean manualmente los siguientes paquetes:

```text
controller/
service/
repository/
entity/
dto/
```

### 🔹 Motivación

Separar responsabilidades para mantener un código limpio y escalable.

---

## 🧩 Primera entidad: Usuario

Se define una clase simple:

```java
public class Usuario {
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
}
```

Posteriormente se convierte en entidad JPA:

```java
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String telefono;
}
```

---

## 🗄️ Repositorio

Se define una interfaz:

```java
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
```

### 🔹 Qué aporta

Permite usar métodos como:

* `findAll()`
* `findById()`
* `save()`

sin implementar lógica manual.

---

## 🧠 Service

Encapsula la lógica de negocio:

```java
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario obtenerPorId(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
```

---

## 🌐 Controller

Expone la API REST:

```java
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping
    public List<Usuario> obtenerTodos() { ... }

    @GetMapping("/{id}")
    public Usuario obtenerPorId(@PathVariable Long id) { ... }

    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) { ... }
}
```

---

## 🔄 Flujo completo

```text
Cliente (curl/Postman)
        ↓
Controller
        ↓
Service
        ↓
Repository
        ↓
Base de datos (H2)
        ↓
Respuesta JSON
```

---

## 🧪 Pruebas realizadas

### 🔹 Obtener todos

```bash
curl http://localhost:8080/usuarios
```

---

### 🔹 Crear usuario

```bash
curl -X POST http://localhost:8080/usuarios \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Agustin","email":"agustin@test.com","telefono":"600123123"}'
```

---

### 🔹 Obtener por id

```bash
curl http://localhost:8080/usuarios/1
```

---

## ⚠️ Problemas encontrados

### 🔹 Pérdida de datos

* H2 funciona en memoria
* Se pierde la información al reiniciar

---

### 🔹 Endpoint mal definido

Error:

* Falta de `("/{id}")` en `@GetMapping`

---

### 🔹 Desincronización entre capas

Error:

* Controller llamando a método inexistente en Service

---

## 📌 Estado actual

El backend permite:

* Crear usuarios
* Listar usuarios
* Obtener usuario por id
* Manejar error 404 si no existe

---

## 🧠 Aprendizajes clave

* Importancia de la separación por capas
* Funcionamiento de Spring Boot
* Flujo completo de una API REST
* Uso de JPA sin SQL manual
* Importancia de los errores HTTP correctos

---
