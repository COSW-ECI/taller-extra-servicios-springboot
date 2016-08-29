Mini-taller


Objetivo:

Construír un API REST que tenga el recurso:

/documentos

El cual tenga las siguientes características


GET /documentos/{nombredoc}

Retorna el contenido del documento

POST /documentos

Crea un nuevo documento





Este ejercicio está basado en la documentación oficial de [SpringBoot](https://spring.io/guides/gs/rest-service/) para la construcción de APIs REST.





```bash
curl -i -X POST -H "Content-Type:application/json" RESOURCE_URL doc -d '{JSON_OBJECT}'
```


```bash
curl -i -X POST -H "Content-Type:application/json" http://localhost:8080/process/doc -d '{"titulo":"el titulo", "contenido":"el contenido aaaa bbbb ccc"}'
```


1. Cree un Bean que haga el papel de controlador