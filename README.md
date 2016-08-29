Mini-taller

Este ejercicio está basado en la documentación oficial de [SpringBoot](https://spring.io/guides/gs/rest-service/) para la construcción de APIs REST.


##Objetivo:

Construír un API REST que tenga el recurso:

/documentos

El cual tenga las siguientes características


GET /documentos/{nombredoc}

Retorna el contenido del documento

POST /documentos

Crea un nuevo documento

##Características adicionales

Al momento de consultarse un documento (GET), el sistema debe aplicar un procesador de texto al contenido del mismo. Por ahora, existen dos tipos de procesadores de textos (BasicTextProcessor, AdvancedTextProcessor). Haga que al al controlador del API REST se le inyecte uno de estos procesadores.


Nota: Cliente de un API REST:

##Construya un cliente para las pruebas


```bash
curl -i -X POST -H "Content-Type:application/json" RESOURCE_URL doc -d '{JSON_OBJECT}'
```


```bash
curl -i -X POST -H "Content-Type:application/json" http://localhost:8080/process/doc -d '{"titulo":"el titulo", "contenido":"el contenido aaaa bbbb ccc"}'
```

