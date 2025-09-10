
# 🚀 springboot-security-basic

Proyecto de ejemplo en Java (Spring Boot) que demuestra cómo proteger una API de pagos usando Spring Security con autenticación básica HTTP.
El proyecto contiene dos endPoints, **1-Pagos** con ruta protegida (usuario/contraseña (omar/abc123) ) y **2-Usuarios** con ruta publica.

---

## 🛠️ Tecnologías utilizadas
- **Java 17** → Lenguaje principal  
- **Spring Boot 3.3.7** → Framework  
- **Maven** → Gestión de dependencias  
- **Postman** → Pruebas de endpoints
- **IntelliJ IDEA** → IDE Desarrollo

---

## 📂 Estructura del proyecto
```bash

├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───springSecurity
│   │   │           └───springSecurity
│   │   └───resources
│   └───test
│       └───java
│           └───com
│               └───springSecurity
│                   └───springSecurity

```
---

## ⚙️ Instalación y ejecución
### 🔹 Requisitos previos

- [Java 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)


## 🔹 Pasos

1. Clonar

git clone https://github.com/omarpedraza1979/springboot-security-basic.git
 cd springboot-security-basic

3. Compilar y ejecutar
..springboot-security-basic> mvn spring-boot:run   

4. La API quedará disponible en:  
http://localhost:8080

---

## 📌 Endpoints principales

| Método | Endpoint     | Descripción                                                            |
|--------|--------------|------------------------------------------------------------------------|
| GET    | `/pagos`     | requiere autenticación básica con usuario y contraseña. (omar/abc123)  |
| GET    | `/usuarios`  | Publico. Accesible sin autenticación.                                  |


## 🧪 Ejemplo con CURL


1. Lista de Pagos (usuario/contraseña)


2. Lista usuarios (publico)




## 🧪 Postman
Este proyecto incluye una colección de Postman para probar los endpoints de la API. 
[SpringBootPagos_Usuarios.postman_collection.json](./SpringBootPagos_Usuarios.postman_collection.json)


---
## 🧪 Pruebas
```bash
mvn test
```
---

## 👨‍💻 Autor
- **Omar Orlando Pedraza Garzón**
- [GitHub](https://github.com/omarpedraza1979)
---


## 📜 Licencia
Este proyecto está bajo la licencia [MIT](LICENSE).  
Eres libre de usarlo, modificarlo y distribuirlo con fines personales o educativos.




---

## 🛠️ Tecnologías utilizadas
- **Java 17** → Lenguaje principal  
- **Spring Boot 3.3.7** → Framework  
- **Maven** → Gestión de dependencias  
- **Postman** → Pruebas de endpoints
- **IntelliJ IDEA** → IDE Desarrollo

---

## 📂 Estructura del proyecto
```bash

├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───springSecurity
│   │   │           └───springSecurity
│   │   └───resources
│   └───test
│       └───java
│           └───com
│               └───springSecurity
│                   └───springSecurity

```
---

## ⚙️ Instalación y ejecución
### 🔹 Requisitos previos

- [Java 17+](https://adoptium.net/)
- [Maven](https://maven.apache.org/)


## 🔹 Pasos

1. Clonar

git clone https://github.com/omarpedraza1979/springboot-security-basic.git
cd springboot-security-basic

3. Compilar y ejecutar
..springboot-security-basic> mvn spring-boot:run   

4. La API quedará disponible en:  
http://localhost:8080

---

## 📌 Endpoints principales

| Método | Endpoint          | Descripción                                                 |
|--------|-------------------|-------------------------------------------------------------|
| GET    | `/pagos`          | Protegido con autenticacion usuario/contraseña (omar/abc123)|
| GET    | `/usuarios`       | Publico. Sin ninguna restriccion                            |


## 🧪 Ejemplo con CURL


1. Lista de Pagos (usuario/contraseña)


2. Lista usuarios (publico)



## 🧪 Postman
Este proyecto incluye una colección de Postman para probar los endpoints de la API. 
[SpringBootPagos_Usuarios.postman_collection.json](./SpringBootPagos_Usuarios.postman_collection.json)


---
## 🧪 Pruebas
```bash
mvn test
```
---

## 👨‍💻 Autor
- **Omar Orlando Pedraza Garzón**
- [GitHub](https://github.com/omarpedraza1979)
---


## 📜 Licencia
Este proyecto está bajo la licencia [MIT](LICENSE).  
Eres libre de usarlo, modificarlo y distribuirlo con fines personales o educativos.


