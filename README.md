# Taller 2: Variables y Condicionales

Lógica de Programación - UPB

Este taller tiene como objetivo poner en práctica la declaración, inicialización y reasignación de variables de distintos tipos en Java, así como el uso de estructuras condicionales para resolver problemas matemáticos mediante un menú interactivo.

## Equipo de trabajo

* **Samuel Andrés Rúa Ocampo:** Creación del repositorio y estructura inicial de `variables.java`.
* **David Robinson Hernández:** Elaboración de la presentación, redacción del `README.md` y solución unificada de ecuaciones en Java.

## Presentación

Puedes ver la presentación del taller en el siguiente enlace:
[Presentación en Canva](https://canva.link/ujq1j6a5vqj7mzr)

---

## Contenido del repositorio

- `Variables.java`: Programa con 20 declaraciones de variables usando los 8 tipos primitivos de Java, inicialización y reasignación de valores.
- `ecuacion2.java`: Programa con menú interactivo de 3 opciones (Ecuación 1, Ecuación 2 y Salir) que evalúa las expresiones matemáticas según los valores de $x$ y $z$ ingresados por el usuario.

---

## Punto 8: Uso de f, L y comillas simples en Java

- **La `f`:** Java asume que los decimales son `double`. Si tu variable es `float`, hay que poner la `f` al final del número para indicarle que lo trate como `float`, o marcará error.
- **La `L`:** Java asume que los enteros son `int`, que tiene un límite. Si tu variable es `long` y el número es muy grande, hay que ponerle la `L` al final para que Java lo trate como `long`.
- **Las comillas simples `''`:** Se usan para un solo carácter (`char`). Si usas comillas dobles (`""`), Java lo toma como `String`, que es un tipo distinto, y marca error.

---

## Punto 9: Gestión y corrección de commits

### Configurar nombre y correo para futuros commits
Para configurar el autor a nivel global en todos los repositorios:
```bash
git config --global user.name "David Robinson Hernández"
git config --global user.email "drobinsonhernandez@gmail.com"