## Related Blog Article

* [Elasticsearch & Spring Data Elasticsearch](https://medium.com/@oralenes/elasticsearch-and-spring-data-617a5fa4ff71
)

## Running elasticsearch-demo locally

First, let's start an Elasticsearch instance that listens on port 9200.

```
docker run -d --name es791 -p 9200:9200 -e "discovery.type=single-node" elasticsearch:7.9.1
```

<br />

Now we need to clone the project.\
Elasticsearch-demo is a Spring Boot application built using Maven. \
Thus, we can use maven command to run the application.

```
git clone https://github.com/enesoral/code-examples
cd code-examples/elasticsearch-demo

mvn spring-boot:run
```