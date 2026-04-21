# 🧩 Sistema de Reservas — Visión General

## 📌 Objetivo del proyecto

El objetivo de este proyecto es construir un backend completo para un sistema de reservas, siguiendo un enfoque progresivo y orientado al aprendizaje.

Se busca no solo obtener un resultado funcional, sino comprender en profundidad cómo se estructura y desarrolla un backend moderno utilizando Java y Spring Boot.

---

## 🎯 Alcance

El sistema permitirá gestionar:

* Usuarios
* Recursos (elementos reservables)
* Reservas

Funcionalidades previstas:

* Crear usuarios
* Listar usuarios
* Obtener usuario por id
* Crear recursos
* Crear reservas
* Consultar reservas
* Evitar reservas en conflicto (misma franja horaria)

---

## 🏗️ Arquitectura general

El backend sigue una arquitectura por capas:

```text
Petición HTTP
     ↓
Controller
     ↓
Service
     ↓
Repository
     ↓
Base de datos
```

### 🔹 Controller

Recibe las peticiones HTTP y devuelve respuestas.

### 🔹 Service

Contiene la lógica de negocio del sistema.

### 🔹 Repository

Gestiona el acceso a la base de datos.

### 🔹 Entity

Representa los datos del sistema como objetos Java.

---

## ⚙️ Tecnologías utilizadas

* Java 17
* Spring Boot
* Maven
* Spring Web
* Spring Data JPA
* H2 (base de datos en memoria)
* curl / Postman para pruebas

---

## 🧠 Enfoque de desarrollo

El desarrollo se realiza siguiendo estos principios:

* Construcción paso a paso
* Comprensión antes que implementación
* Simplicidad inicial, complejidad progresiva
* Separación clara de responsabilidades
* Validación continua mediante pruebas

---

## 🚧 Estado actual

Actualmente el proyecto se encuentra en una fase inicial donde:

* El backend ha sido creado
* Se ha definido la estructura base
* Se ha implementado una primera entidad (`Usuario`)
* Se dispone de endpoints básicos funcionando

---

## 🔮 Evolución prevista

El proyecto evolucionará hacia:

* Más entidades (Recurso, Reserva)
* Validaciones de datos
* Manejo de errores más avanzado
* Conexión a base de datos en Docker
* Integración con frontend
* Mejora de la arquitectura

---

## 📚 Objetivo formativo

Este proyecto está diseñado como guía de aprendizaje para comprender:

* Cómo se construye un backend con Spring Boot
* Cómo se organizan las capas de una aplicación
* Cómo se gestionan datos y peticiones HTTP
* Buenas prácticas en desarrollo backend

---
