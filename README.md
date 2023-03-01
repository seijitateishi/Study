# Estudo
repositório para rascunho, acompanhar cursos e treinos


API de Wallet feito em Java com Spring Boot, MongoDB e Postman.
criar conta no postman:
post com http://localhost:8080/wallets?holderName=ciclano

depositar x na conta y:
post com http://localhost:8080/wallets/deposit?id=y&value=x

retirar x na conta y:
post com http://localhost:8080/wallets/withdraw?id=y&value=x
