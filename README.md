# 🧪 Proyecto de Automatización - Demoblaze | XoluQA

Este proyecto automatiza casos de prueba funcionales sobre el sitio web [Demoblaze](https://www.demoblaze.com/) utilizando el framework **Serenity BDD** con el patrón **Screenplay**, en lenguaje Java y con Gradle como gestor de dependencias.

---

## 🚀 Tecnologías y herramientas usadas

- ✅ Java 11  
- 🧱 Gradle  
- 🍀 Serenity BDD  
- 🎭 Screenplay Pattern  
- 🥒 Cucumber  
- 🌐 Selenium WebDriver  
- 📷 Evidencias automáticas en HTML (Serenity Reports)

---

## 📄 Casos de prueba automatizados

- Login exitoso con usuario y contraseña válidos.
- Compra de productos desde el catálogo.
- Validación del mensaje de confirmación: `"Thank you for your purchase!"`

---

## 📁 Estructura del proyecto

📂 src 
      ┣ 📂 main  
      ┃ ┗ 📂 java 
      ┃ ┗ 🧠 lógica de negocio, tareas y page objects 
      ┣ 📂 test 
      ┃ ┗ 📂 java 
      ┃ ┣ 🎭 definiciones de pasos (Step Definitions) 
      ┃ ┗ 🧪 runners de pruebas


---

## 🧪 Cómo ejecutar los tests

1. Clona el repositorio:
```bash
git clone https://github.com/XoluQA/demoblaze.git

2. Ejecuta las pruebas desde consola:
./gradlew clean test

3. Abre el reporte generado:
target/site/serenity/index.html

🧑‍💻 Autor
XoluQA
📧 [xolugg@gmail.com](mailto:xolugg@gmail.com)  
🔗 [GitHub](https://github.com/XoluQA)

¡Gracias por visitar este repositorio! ⭐ Dale una estrella si te gustó este proyecto.
