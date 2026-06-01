# API REST de Estudiantes

## Descripción

Este proyecto consiste en una API REST desarrollada con Spring Boot y Kotlin para la gestión de estudiantes. La aplicación permite registrar estudiantes y consultar todos los estudiantes almacenados en una base de datos H2.

La solución implementa una arquitectura por capas utilizando Controller, Service y Repository, siguiendo las buenas prácticas de desarrollo con Spring Boot.

---

## Tecnologías utilizadas

* Kotlin
* Spring Boot
* Spring Data JPA
* H2 Database
* Gradle
* Postman

---

## Arquitectura del proyecto

```text
src/main/kotlin/ec/edu/puce/studentapi
├── controller
│   └── StudentController.kt
├── service
│   └── StudentService.kt
├── repository
│   └── StudentRepository.kt
├── entity
│   └── Student.kt
├── dto
│   ├── StudentRequest.kt
│   └── StudentResponse.kt
└── StudentapiApplication.kt
```

---

## Entidad Student

La entidad Student contiene los siguientes atributos:

| Campo | Tipo   |
| ----- | ------ |
| id    | Long   |
| name  | String |
| email | String |

---

## Endpoints

### Crear estudiante

**POST** `/students`

#### Request Body

```json
{
  "name": "Ana Torres",
  "email": "ana.torres@email.com"
}
```

#### Response

```json
{
  "id": 1,
  "name": "Ana Torres",
  "email": "ana.torres@email.com"
}
```

---

### Listar estudiantes

**GET** `/students`

#### Response

```json
[
  {
    "id": 1,
    "name": "Ana Torres",
    "email": "ana.torres@email.com"
  }
]
```

---

## Configuración de H2

### Consola H2

```text
http://localhost:8080/h2-console
```

### Datos de conexión

```text
JDBC URL: jdbc:h2:mem:studentsdb
Usuario: sa
Contraseña:
```

---

## Ejecución del proyecto

1. Clonar el repositorio:

```bash
git clone <URL_DEL_REPOSITORIO>
```

2. Ingresar al proyecto:

```bash
cd studentapi
```

3. Ejecutar la aplicación:

```bash
./gradlew bootRun
```

4. Acceder a la API:

```text
http://localhost:8080/students
```

---

# Evidencias

## Prueba POST /students

![POST Student](evidencias/postman-post.png)

## Prueba GET /students

![GET Students](evidencias/postman-get.png)

## Consola H2

![H2 Console](evidencias/h2-console.png)

---

## Autor

Jean Pierre Mora Santillán

Pontificia Universidad Católica del Ecuador (PUCE)
Tecnología Superior en Desarrollo de Software

