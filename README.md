<h1 align="center" style="font-weight: bold;">CEP INFO 📍</h1>

<p align="center">
 <a href="#technologies">Tecnologias</a> • 
 <a href="#started">Começando</a> • 
 <a href="#routes">API Endpoints</a>
</p>

<p align="center">
    <b>Serviço que consome a API do <a href="https://postmon.com.br/">Postmon</a> utilizando o Spring Cloud OpenFeign</b>
</p>

<h2 id="technologies">💻 Tecnologias</h2>

- Java;
- Spring Web;
- Spring Cloud OpenFeign

<h2 id="started">🚀 Começando</h2>

<h3>Pré-requisitos</h3>

- [Java](https://www.java.com/pt-BR/)

<h3>Clonando</h3>

```
git clone git@github.com:joaovictornovais/cep-info.git
```


<h3>Iniciando</h3>

```bash
$ cd cep-info
$ ./mvnw clean package
```

Executar a aplicação
```
$ java -jar target/cep-info-0.0.1-SNAPSHOT.jar
```

<h2 id="routes">📍 API Endpoints</h2>
​

| Rota                                                 | Descrição                                          
|------------------------------------------------------|-----------------------------------------------------
| <kbd>GET /cep/{cep}                                  | Retorna as informações de um CEP.
