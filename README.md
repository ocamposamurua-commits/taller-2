# Taller 2: Variables y Condicionales

Lógica de Programación - UPB

Este taller tiene como objetivo poner en práctica la declaración, inicialización y reasignación de variables de distintos tipos en Java, así como el uso de estructuras condicionales para resolver problemas matemáticos mediante un menú interactivo.

## Equipo de trabajo

| Samuel Andrés Rúa Ocampo | Creación del repositorio y estructura inicial de `Variables.java` |
| David Robinson Hernández | Desarrollo de README y solución de `Ecuaciones.java` |

## Presentacion

https://canva.link/ujq1j6a5vqj7mzr

## Contenido del repositorio

- `Variables.java`: Programa con 20 declaraciones de variables usando los 8 tipos primitivos de Java, inicialización y reasignación de valores.
- `Ecuaciones.java`: Menú interactivo con 3 opciones (Ecuación 1, Ecuación 2, Salir) para evaluar expresiones matemáticas evaluadas según el valor ingresado por el usuario. 

## Gestión y corrección de commits (Punto 9)

### ¿Cómo cambiar el nombre y correo para futuros commits?
Para configurar el autor a nivel global en todos los repositorios:
```bash
git config --global user.name "David Robinson Hernández"
git config --global user.email "drobinsonhernandez@gmail.com"
```

# ¿Cómo renombrar o modificar commits anteriores?
   # Modificar el último commit realizado
   
  - Para cambiar solo el mensaje:
    ```bash
    git commit --amend -m "Nuevo mensaje del commit"
    ``````
  - Para cambiar el autor del último commit:
    ```bash
    git commit --amend --author="David Robinson Hernández <drobinsonhernandez@gmail.com>" --no-edit
    ``````
    # Modificar commits mas viejos
    Se ejecuta un rebase interactivo indicando la cantidad `N` de commits hacia atrás a revisar:
     ```bash
    git rebase -i HEAD~N
    ```
