# 🧠 Anotaciones Clave en Spring Boot

## 🎯 Objetivo

Recopilar y explicar las anotaciones más importantes utilizadas en el backend, indicando su función y contexto de uso.

---

## 🌐 Anotaciones de Controller

### 🔹 `@RestController`

**Qué hace:**

* Indica que la clase es un controlador REST
* Devuelve datos directamente en formato JSON

**Dónde se usa:**

```java
@RestController
public class UsuarioController { }
```

---

### 🔹 `@RequestMapping`

**Qué hace:**

* Define la ruta base del controller

```java
@RequestMapping("/usuarios")
```

---

### 🔹 `@GetMapping`

**Qué hace:**

* Asocia un método a peticiones HTTP GET

```java
@GetMapping
public List<Usuario> obtenerTodos() { }
```

---

### 🔹 `@GetMapping("/{id}")`

**Qué hace:**

* Define una ruta con parámetro

```java
@GetMapping("/{id}")
```

---

### 🔹 `@PostMapping`

**Qué hace:**

* Asocia un método a peticiones HTTP POST

```java
@PostMapping
```

---

### 🔹 `@RequestBody`

**Qué hace:**

* Convierte JSON en objeto Java automáticamente

```java
public Usuario crear(@RequestBody Usuario usuario)
```

---

### 🔹 `@PathVariable`

**Qué hace:**

* Extrae valores de la URL

```java
public Usuario obtenerPorId(@PathVariable Long id)
```

---

## 🧠 Anotaciones de Service

### 🔹 `@Service`

**Qué hace:**

* Marca la clase como componente de lógica de negocio

```java
@Service
public class UsuarioService { }
```

---

## 🗄️ Anotaciones de Entity (JPA)

### 🔹 `@Entity`

**Qué hace:**

* Indica que la clase representa una tabla

```java
@Entity
public class Usuario { }
```

---

### 🔹 `@Id`

**Qué hace:**

* Marca el campo identificador

```java
@Id
private Long id;
```

---

### 🔹 `@GeneratedValue`

**Qué hace:**

* Genera automáticamente el ID

```java
@GeneratedValue(strategy = GenerationType.IDENTITY)
```

---

## ✅ Anotaciones de Validación

### 🔹 `@Valid`

**Qué hace:**

* Activa la validación en el controller

```java
public Usuario crear(@Valid @RequestBody Usuario usuario)
```

---

### 🔹 `@NotBlank`

**Qué hace:**

* Valida que un campo no esté vacío

```java
@NotBlank
private String nombre;
```

---

### 🔹 `@Email`

**Qué hace:**

* Valida formato de email

```java
@Email
private String email;
```

---

## ⚠️ Manejo de errores

### 🔹 `ResponseStatusException`

**Qué hace:**

* Permite devolver errores HTTP personalizados

```java
throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado");
```

---

## 🧠 Resumen conceptual

```text
Controller → recibe petición
Service → lógica
Repository → acceso a datos
Entity → estructura de datos
```

---

## 📌 Conclusión

Las anotaciones permiten:

* Reducir código repetitivo
* Delegar comportamiento al framework
* Simplificar el desarrollo

Son la base del funcionamiento de Spring Boot.

---
