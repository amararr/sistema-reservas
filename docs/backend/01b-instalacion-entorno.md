# 🛠️ Instalación del Entorno de Desarrollo

## 🎯 Objetivo

Documentar paso a paso la preparación del entorno necesario para desarrollar el backend del sistema de reservas.

---

## 🖥️ Sistema operativo

Se parte de:

* Ubuntu 24.04 actualizado

```bash
sudo apt update && sudo apt upgrade -y
```

---

## 🔧 Instalación de Git

```bash
sudo apt install -y git
```

Configuración inicial:

```bash
git config --global user.name "TuNombre"
git config --global user.email "tu@email.com"
```

---

## 🔐 Configuración de clave SSH

Generación de clave:

```bash
ssh-keygen -t ed25519 -C "tu@email.com"
```

Añadir al agente:

```bash
eval "$(ssh-agent -s)"
ssh-add ~/.ssh/id_ed25519
```

Copiar clave pública:

```bash
cat ~/.ssh/id_ed25519.pub
```

👉 Añadir en GitHub → Settings → SSH Keys

---

## 📁 Creación del repositorio

```bash
mkdir -p ~/Proyectos/sistema-reservas
cd ~/Proyectos/sistema-reservas
git init
```

Conexión con GitHub:

```bash
git remote add origin <URL_REPOSITORIO>
git branch -M main
git push -u origin main
```

---

## 🐳 Instalación de Docker

```bash
sudo apt install -y docker.io
```

Comprobación:

```bash
docker --version
```

---

## 🔧 Instalación de Docker Compose

```bash
sudo apt install -y docker-compose
```

Comprobación:

```bash
docker-compose --version
```

---

## ☕ Instalación de Java 17

```bash
sudo apt install -y openjdk-17-jdk
```

Comprobación:

```bash
java -version
javac -version
```

---

## 📦 Creación del proyecto Spring Boot

Se utiliza Spring Initializr:

* Project: Maven
* Java 17
* Dependencias:

  * Spring Web
  * Spring Data JPA
  * Validation
  * H2

Descarga y descompresión:

```bash
unzip reservas.zip
```

Movimiento al proyecto:

```bash
cp -r reservas/. ~/Proyectos/sistema-reservas/backend/
```

---

## 🚀 Ejecución del proyecto

```bash
cd backend
./mvnw spring-boot:run
```

---

## ⚠️ Problemas encontrados

### 🔹 Falta de archivos ocultos (.mvn)

Solución:

* copiar también archivos ocultos al mover el proyecto

---

### 🔹 JAVA_HOME no configurado

Solución:

* instalar JDK 17 correctamente

---

## 📌 Resultado final

Entorno completamente preparado con:

* Git funcionando con GitHub
* Docker instalado
* Java 17 operativo
* Proyecto Spring Boot funcional

---
