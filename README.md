# JWTDemo 
This applications is a demo showing how to access a secured REST api with JSON Web Token (JWT).

####We use these technologies:
* Java 13
* Maven 3.6.1
* Spring Boot 2.2.1.RELEASE
  * Spring Security
  * Spring Data JPA
  * Spring Data REST
* JWT 0.10.7
* H2 database
* Lombok
* Commons-lang3
 
 
## Documentation
* https://dev.to/keysh/spring-security-with-jwt-3j76
* https://jwt.io/
* [JWT debugger](https://jwt.io/#debugger)
* [Spring Security | Full Course - Section 8 JWT (youtube)](https://www.youtube.com/watch?v=her_7pa0vrg&t=12924s)

## Key generator
JWT requires a server side password  
[Key Generator](https://www.allkeysgenerator.com/Random/Security-Encryption-Key-Generator.aspx)

## Warning
It is not safe to send password over http. To secure sending password please use SSL over HTTPS. 
This will encrypt the communication and hide your password. 

## How to
Use [Postman](https://www.postman.com/downloads/), Curl or whatever is your favorite tool. I use Postman.

Send: POST -> http://localhost:8080/api/public \
Result: ```Hello from public API controller```

Send: Post -> http://localhost:8080/api/private \
Result: 
```
{
    "timestamp": "2020-02-11T10:47:43.160+0000",
    "status": 403,
    "error": "Forbidden",
    "message": "Access Denied",
    "path": "/api/private"
}
```

Send: POST -> http://localhost:8080/api/authenticate?username=user&password=password \
Result: Look at application console output and you will se something like the following
```Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJzZWN1cmUtYXBpIiwiYXVkIjoic2VjdXJlLWFwcCIsInN1YiI6InVzZXIiLCJleHAiOjE1ODIyODI0MTAsInJvbCI6WyJST0xFX1VTRVIiXX0.bd2YDYt4KmXATjh45E9WtOS57UEfSP2mvhVXOTW9wMdYQr-O4aNQ6gkRn1JCQo_pAsWcnN7pjwM9mgVLgdYkTg``` \
You can also find the token in Postman Headers from the response.
 
* Copy ```Bearer <token>``` where ```<token>``` is the token from the console output or from Postman 
* Open Postman and find the GET request for /api/private and add the header 'Authorization' with value ```Bearer <token>``` 

Send: GET -> http://localhost:8080/api/private \
Result: ```Hello from private api controller```