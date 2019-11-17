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

## Key generator
JWT requires a server side password  
[Key Generator](https://www.allkeysgenerator.com/Random/Security-Encryption-Key-Generator.aspx)

## Warning
It is not safe to send password over http. To secure sending password please use SSL over HTTPS. 
This will encrypt the communication and hide your password. 