Project created for course 
https://www.udemy.com/course/spring-boot-and-apache-kafka
https://kafka.apache.org/quickstart

When use Kafka and when use RabbitMQ: https://www.youtube.com/watch?v=PQHf_IzmUXE

To start kafka locally:

cd C:\apps\kafka_2.12-3.9.1
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties


check for messages in the topic
.\kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic javaguides --from-beginning --max-messages 10


https://stream.wikimedia.org/v2/stream/recentchange
https://stream.wikimedia.org/v2/stream/recentchange

to read events from wikimedia it is necessary to use the library okhttp-eventsource. it requires okhttp dependency to have all other libs that are required. 
It is also necessary to use jackson-core and jackson-databind to read the json values

example of implementation: https://github.com/RameshMF/springboot-kafka-course


kafka vs rest api https://stackoverflow.com/questions/57852689/kafka-msg-vs-rest-calls