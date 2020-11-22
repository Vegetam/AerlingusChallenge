# AerlingusChallenge
Aerlingus Challenge
# Technology
Java Spring Boot Swagger JUNIT 5

# How to use the code :

Download the project as is. Pom.xml contains the external dependencies for the libraries used.

Maven using to build the project :

mvn clean package

the rest service can either be accessed via the SwaggerUI : http://localhost:8080/swagger-ui.html

It is possible use any rest tools line postman, Advanced Rest Client or by curling requests at the relevant endpoints documented below.

API for search Airplane by location  as example : 

GET http://localhost:8080/flight/location/DUB 
curl -X GET "http://localhost:8080/flight/location/DUB"

API for Search Airplane by arrival by time as example : 

http://localhost:8080/flight/arrival/1000 - 1300
curl -X GET "http://localhost:8080/flight/arrival/1000 - 130"
