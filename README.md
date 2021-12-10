# Apache camel tutorial with sample code.

1. File Route
2. Timer Route
3. activemq Route
4. kafka

For activemq docker use following command

```
docker pull rmohr/activemq
docker run -p 61616:61616 -p 8161:8161 rmohr/activemq
```
Ref: https://hub.docker.com/r/rmohr/activemq


For kafka docker use following command

```
docker-compose -f docker-compose-kafka.yml up -d
```

Ref: https://hub.docker.com/r/wurstmeister/kafka

Ref: https://camel.apache.org/components/3.13.x/activemq-component.html

Note: All components are commented..uncomment code in packages file and test it...