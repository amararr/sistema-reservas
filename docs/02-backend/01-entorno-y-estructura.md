# ⚙️ Entorno y Estructura del Proyecto

## 🖥️ Entorno de desarrollo

El proyecto se desarrolla sobre una máquina con:

* Sistema operativo: **Ubuntu 24.04**
* Terminal como herramienta principal de trabajo
* Acceso a internet para descarga de dependencias

---

## 🔧 Herramientas instaladas

Antes de comenzar el desarrollo del backend, se ha preparado el entorno con las siguientes herramientas:

### 🔹 Git

Utilizado para control de versiones.

* Configurado con usuario y correo
* Conexión SSH con GitHub configurada
* Repositorio inicial creado y operativo

---

### 🔹 Docker y Docker Compose

Instalados y funcionando correctamente.

> ⚠️ Nota: En esta fase no se utilizan directamente, pero serán necesarios más adelante para la base de datos y despliegue.

---

### 🔹 Java 17 (JDK)

Instalado durante la fase de backend.

Permite:

* Compilar código Java
* Ejecutar aplicaciones Spring Boot

---

### 🔹 Maven Wrapper

Incluido en el proyecto (`mvnw`).

Permite:

* Ejecutar Maven sin necesidad de instalación global
* Garantizar versiones consistentes

---

## 📁 Estructura del repositorio

El proyecto está organizado en varias carpetas:

```text
sistema-reservas/
│
├── backend/
├── frontend/
├── docker/
├── docs/
```

---

### 🔹 `backend/`

Contiene el proyecto Spring Boot.

Es un proyecto Maven con la siguiente estructura principal:

```text
backend/
├── pom.xml
├── mvnw
├── src/
```

---

### 🔹 `frontend/`

Reservado para la aplicación cliente (Angular).

> No se utiliza en esta fase.

---

### 🔹 `docker/`

Contendrá configuraciones relacionadas con contenedores.

> Se utilizará en fases posteriores.

---

### 🔹 `docs/`

Contiene la documentación del proyecto en formato Markdown.

---

## 📦 Estructura interna del backend

Dentro de `src/main/java/...` se ha definido la siguiente organización:

```text
controller/
service/
repository/
entity/
dto/
```

---

### 🔹 `controller`

Gestiona las peticiones HTTP.

Ejemplo:

* `GET /usuarios`
* `POST /usuarios`

---

### 🔹 `service`

Contiene la lógica de negocio.

Actúa como intermediario entre controller y repository.

---

### 🔹 `repository`

Acceso a base de datos mediante Spring Data JPA.

---

### 🔹 `entity`

Define las clases que representan los datos del sistema.

---

### 🔹 `dto`

Reservado para objetos de transferencia de datos.

> No utilizado en la fase inicial.

---

## 🗄️ Base de datos en esta fase

Se utiliza **H2 en memoria**.

Características:

* No requiere instalación
* Se inicia automáticamente con Spring Boot
* Los datos se pierden al reiniciar la aplicación

---

## 🚀 Ejecución del backend

La aplicación se ejecuta con:

```bash
./mvnw spring-boot:run
```

Esto levanta un servidor en:

```text
http://localhost:8080
```

---

## 🧪 Pruebas iniciales

Las pruebas se realizan mediante:

* `curl`
* Postman (opcional)

Ejemplo:

```bash
curl http://localhost:8080/usuarios
```

---

## 📌 Consideraciones importantes

* No se utiliza IDE en la fase inicial (trabajo desde terminal)
* La base de datos es temporal
* La estructura está pensada para crecer de forma ordenada
* Cada capa tiene una responsabilidad clara

---
