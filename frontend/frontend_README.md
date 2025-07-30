# 🖥️ Finanzas App - Frontend

Este es el frontend de la aplicación **Finanzas App**, creado con **Angular 19** usando **Standalone Components**.  
Permite registrar y visualizar ingresos, egresos, generar reportes, y presentar gráficos mensuales de forma clara y sencilla.

---

## 🚀 Tecnologías

- Angular 19
- Standalone Components
- Angular Material (UI)
- ngx-toastr (notificaciones)
- date-fns o day.js (fechas)
- xlsx / jsPDF (exportaciones)
- CLP como moneda principal (peso chileno)

---

## 📁 Estructura

```
src/app/
├── core/            # Servicios, modelos y helpers globales
├── features/
│   ├── dashboard/   # Resumen mensual
│   ├── ingresos/
│   ├── egresos/
│   └── reportes/
├── shared/          # Componentes reutilizables
└── app.config.ts    # Configuración global y rutas
```

---

## 🛠️ Instrucciones de uso

1. Instalar dependencias:

```
npm install
```

2. Ejecutar la app:

```
ng serve
```

3. Acceder a:

```
http://localhost:4200
```

---

## 📌 Estado actual

✔ Estructura inicial generada  
⬜ Página principal (dashboard)  
⬜ Formulario de ingreso/egreso  
⬜ Gráficos y reportes  
⬜ Exportar a PDF y Excel

---

## ✍️ Autor

**Oscar González** — Aplicación personal de control financiero

---

## 📦 Extras en camino

- Visualización de calendario
- Animaciones suaves
- Tema claro/oscuro