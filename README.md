##Spring Boot Book Seller Application

###EndPoints

####Sign-up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "name": "user",
    "username": "xyz",
    "password": "123"
}
```

####Sign-in

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username": "xyz",
    "password": "123"
}
```