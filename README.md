# PostgreSQL Fun Todo List

## How to Run
```text
mvn clean package spring-boot:run -D"jasypt.encryptor.password"=encryptKey
```
## How to Run with Environment Variable
```text
JASYPT_ENCRYPTOR_PASSWORD=encryptKey
```
## How to Encrypt Properties
```text
mvn jasypt:encrypt-value -D"jasypt.encryptor.password"="encryptKey" -D"jasypt.plugin.value"="valueToEncrypt"
```
