# TallerPESantiagoLopez

Este proyecto es una API REST en Spring Boot que permite registrar y listar estudiantes.
Los datos se guardan en memoria, por lo que se pierden al reiniciar el servidor.

Endpoints
  Registrar estudiante
  
    -POST /estudiantes
    -Recibe un JSON con los datos del estudiante.
    -Valida que no exista otro estudiante con el mismo id.
    -Respuesta:
        201 Created si se registra correctamente
        400 Bad Request si el ID ya existe
        
  Listar estudiantes
  
    -GET /estudiantes
    -Devuelve un arreglo con todos los estudiantes registrados.
    -Respuesta: 200 OK
    
Tecnologias

  Java
  
  Spring Boot
  
    -H2
    -Spring Web
    -JPA
    -thymeleaf
    -lombok
las pruebas fueron realizadas con CMD usando el siguiente comando
curl -X POST http://localhost:8080/estudiantes \
-H "Content-Type: application/json" \
-d "{\"id\":\"000######\",\"nombre\":\"xxxxx\",\"carrera\":\"xxxxxx\"}"
