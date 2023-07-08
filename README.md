# API REST de Aplicación de Libros

Esta es una API REST desarrollada en Spring Boot que proporciona una funcionalidad básica de CRUD (Create, Read, Update, Delete) para una aplicación de libros. El proyecto está escrito en Java y se puede utilizar como ejemplo de práctica o como punto de partida para desarrollar una aplicación más completa.

## Características

La API REST de la aplicación de libros proporciona las siguientes características:

- **Creación de libros**: Permite crear un nuevo libro proporcionando el título, autor y género del libro.
- **Obtención de libros**: Permite obtener la información de un libro específico o de todos los libros disponibles.
- **Actualización de libros**: Permite actualizar la información de un libro existente, incluyendo el título, autor y género.
- **Eliminación de libros**: Permite eliminar un libro existente de la base de datos.

## Tecnologías utilizadas

El proyecto utiliza las siguientes tecnologías:

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (base de datos en memoria)

## Endpoints

La API REST de la aplicación de libros expone los siguientes endpoints:

- `GET /api/v1/book`: Obtiene la lista de todos los libros.
- `GET /api/v1/book/{id}`: Obtiene la información de un libro específico por su ID.
- `POST /api/v1/book`: Crea un nuevo libro.
- `PUT /api/v1/book/{id}`: Actualiza la información de un libro existente por su ID.
- `DELETE /api/v1/book/{id}`: Elimina un libro existente por su ID.

Para los endpoints que requieren un ID de libro, asegúrate de reemplazar `{id}` con el ID real del libro.
