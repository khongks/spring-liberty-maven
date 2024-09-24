## Development

1. Create Liberty server
   ```
   ./mvnw clean liberty:create -Dtemplate=springBoot3
   ```
  
2. Build the war file and run on Liberty server
   ```
   ./mvnw package liberty:run
   ```

3. Test using browser
   ```
   http://localhost:9080/test-maven
   ```
   
## Build Docker image

1. Build image using podman
   ```
   podman build -t spring-liberty-maven:1.0-SNAPSHOT .
   ```

2. Run container
   ```
   podman run -p 9080:9080 -p 9443:9443 -it spring-liberty-maven:1.0-SNAPSHOT
   ```

## Reference

- https://openliberty.io/blog/2024/05/01/spring-boot-3.html