# Preparación de entorno en Ubuntu 24.04

## Qué

Preparación de un entorno base en Ubuntu 24.04 para desarrollo de aplicaciones web, incluyendo herramientas esenciales como Git y Docker.

## Cómo

El proceso se divide en una secuencia de pasos:

- Actualización del sistema
- Instalación y configuración de Git
- Configuración de acceso SSH
- Conexión con repositorio remoto
- Instalación y configuración de Docker
- Verificación del entorno

## Por qué

Este enfoque permite:

- Disponer de un entorno reproducible
- Facilitar la portabilidad entre proyectos
- Reducir errores de configuración
- Estandarizar el proceso de arranque de proyectos

## Verificación

Cada paso incluye su propia verificación para asegurar que el entorno queda correctamente configurado.

## Problemas comunes

Se documentan errores habituales en cada sección para facilitar su resolución.

---

> ⚠️ Nota: Esta sección podría integrarse en "Qué" en futuras revisiones para evitar duplicidad conceptual.

## 1. Objetivo

Este documento describe el proceso de preparación de un entorno de desarrollo base en Ubuntu 24.04 para proyectos web.

Incluye:

* actualización del sistema
* configuración de Git
* conexión con repositorio remoto
* instalación de Docker
* verificación de Docker y Docker Compose

Este proceso es reutilizable para cualquier proyecto similar.

---

## Alcance

Este documento cubre exclusivamente la preparación del entorno base en Ubuntu 24.04.

Incluye:

- Configuración del sistema
- Instalación de herramientas necesarias
- Configuración de acceso a repositorios
- Instalación y verificación de Docker

Quedan fuera de este documento:

- Organización interna del proyecto
- Desarrollo de backend o frontend
- Configuración específica de aplicaciones

---

## 2. Actualización del sistema



### Comando

```bash
sudo apt update && sudo apt upgrade -y
```

### Qué hace

* Actualiza la lista de paquetes disponibles
* Instala las últimas versiones de los paquetes

### Verificación

* No aparecen errores
* El proceso finaliza correctamente

### Problemas comunes

* `429 Too Many Requests` → esperar y reintentar
* `Could not get lock` → otro proceso está usando apt

---

## 3. Instalación y configuración de Git

### Instalación

```bash
sudo apt install git -y
```

### Configuración

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@ejemplo.com"
```

### Verificación

```bash
git --version
git config --list
```

---

## 4. Configuración de acceso SSH a repositorio remoto

### Generar clave SSH

```bash
ssh-keygen -t ed25519 -C "tuemail@ejemplo.com"
```

### Mostrar clave pública

```bash
cat ~/.ssh/id_ed25519.pub
```

### Paso manual

* Añadir la clave en el proveedor de repositorio (GitHub, GitLab, etc.)

### Verificación

```bash
ssh -T git@github.com
```

Salida esperada:

```
Hi usuario! You've successfully authenticated...
```

---

## 5. Creación de repositorio local

### Inicializar repositorio

```bash
git init
```

### Crear .gitignore

```bash
touch .gitignore
```

### Commit inicial

```bash
git add .
git commit -m "Inicialización del proyecto"
```

---

## 6. Conexión con repositorio remoto

### Añadir remoto

```bash
git remote add origin git@github.com:usuario/repositorio.git
```

### Subir código

```bash
git push -u origin main
```

---

## 7. Instalación de Docker

### Dependencias previas

```bash
sudo apt install ca-certificates curl gnupg -y
```

### Añadir clave de Docker

```bash
sudo install -m 0755 -d /etc/apt/keyrings
sudo curl -fsSL https://download.docker.com/linux/ubuntu/gpg -o /etc/apt/keyrings/docker.asc
sudo chmod a+r /etc/apt/keyrings/docker.asc
```

### Añadir repositorio

```bash
echo \
"deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.asc] https://download.docker.com/linux/ubuntu \
$(. /etc/os-release && echo "$VERSION_CODENAME") stable" | \
sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
```

### Instalación

```bash
sudo apt update
sudo apt install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin -y
```

---

## 8. Configuración de Docker sin sudo

```bash
sudo usermod -aG docker $USER
sudo reboot
```

---

## 9. Verificación de Docker

```bash
docker run hello-world
```

Salida esperada:

```
Hello from Docker!
```

---

## 10. Verificación de Docker Compose

```bash
docker compose version
```

---

## 11. Prueba con Docker Compose

### Archivo de prueba

```yaml
services:
  hello:
    image: hello-world
```

### Ejecución

```bash
docker compose up
```

---

## 12. Estructura base del proyecto

```bash
mkdir backend frontend docker docs
```

---

## 13. Buenas prácticas aplicadas

* Uso de SSH en lugar de HTTPS
* Separación de responsabilidades por carpetas
* Uso de Docker desde el inicio
* Entorno reproducible
* Versionado desde el primer momento

---

## 14. Resultado final

El entorno queda preparado para:

* desarrollo backend
* desarrollo frontend
* integración con contenedores
* trabajo con repositorio remoto

---

## Observaciones de modularización

Este documento incluye actualmente secciones que podrían separarse en el futuro para mejorar la reutilización:

- Creación y gestión de repositorios Git
- Estructura base de proyectos

Estas secciones se mantienen aquí temporalmente para conservar el flujo completo de preparación del entorno, pero podrán extraerse en módulos independientes si la documentación evoluciona.

---
