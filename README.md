# API REST em Java Spring Boot com Autenticação JWT
Esse projeto é uma API construida em Java, com Java Spring Boot, Spring Security e JWT para o controle de autenticação. Foi utilizado o banco de dados H2 em memória, que facilita testes e o desenvolvimento em geral.

## Funções
| Endpoint  | Retorno |
| ------------- | ------------- |
| GET /users  | Retorna uma lista de usuários que realizaram cadastro e já foram autenticados.  |
| POST /users  | Adiciona um novo usuário (requer role de ADMIN). |
| POST /auth/login | Realiza um login e recebe um token para validações futuras. |
| POST /auth/register | Realiza o cadastro do usuário. |

## Autenticação
A aplicação utiliza Spring Security para gerenciar as autenticações e possui dois papéis:

```
USER:
Permissão padrão, atribuida aos usuários logados que não são administradores

ADMIN:
É o administrador da aplicação, pode gerenciar a endpoint /users
```

Para realizar uma requisição permitida apenas para administradores, é necessário um bearer token.


## Instalação

```
1- Clonar repositorio:
git clone https://github.com/bbering/springboot-authapi.git

2- Instalar dependências com o Maven:
mvn install ...

```

## Executando o Projeto

### Pré-requisitos

- JDK 17 ou superior
- Maven 3.6+

A aplicação fica disponível em **http://localhost:8080**
