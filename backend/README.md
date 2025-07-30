# ⚙️ Finanzas App - Backend

Este es el backend de la aplicación **Finanzas App**, desarrollado en Java 17 con Spring Boot y PostgreSQL.  
Administra las operaciones financieras (ingresos, egresos), categorías, exportaciones y lógica de negocio.

---

## 🚀 Tecnologías

- Java 17
- Spring Boot 3.3.x
- Spring Data JPA
- PostgreSQL
- Lombok
- Swagger (SpringDoc OpenAPI)
- Flyway (para migraciones, próximamente)
- MapStruct / ModelMapper (para DTOs, próximamente)

---

## 🧱 Estructura

```
src/main/java/com/finanzasapp/backend/
├── config/         # Configuraciones (Swagger, CORS, etc.)
├── controller/     # Controladores REST
├── dto/            # Objetos de transferencia de datos
├── entity/         # Entidades JPA
├── exception/      # Manejadores globales de errores
├── repository/     # Interfaces JPA
├── service/        # Lógica de negocio
└── util/           # Helpers (fecha, exportaciones)
```

---

## 🔧 Configuración

1. Crea una base de datos en PostgreSQL:

```sql
CREATE DATABASE finanzas_db;
```

2. Ajusta tu archivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/finanzas_db
spring.datasource.username=postgres
spring.datasource.password=tu_clave
```

3. Ejecuta la aplicación con tu IDE o `mvn spring-boot:run`.

---

## 📚 Documentación de API

Swagger estará disponible en:

```
http://localhost:8080/swagger-ui.html
```

---

## 📌 Estado actual

✔ Proyecto inicializado  
✔ Conexión a PostgreSQL  
✔ Swagger UI disponible  
✔ Estructura base de carpetas organizada  
⬜ Primera entidad: `Person` (usuario del sistema)  
⬜ CRUD básico con DTOs  
⬜ Exportaciones a PDF/Excel  
⬜ Lógica de reportes mensuales  
⬜ Calendario e informes detallados

---

## ✍️ Autor

**Oscar González** – Proyecto personal sin login para finanzas personales