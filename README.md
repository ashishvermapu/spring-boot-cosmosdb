# Introduction 
This project uses cosmos db SQL container/database. It demonstrates how cosmos db can be used with springboot.

# Getting Started
1. Clone the project to your local.
2. Create a comsos db account; SQL API based database & container.
    - Database Name : "TMUsers" (This will be added to the application.yml file)
    - URI : Read/Write URI to the cosmosdb account; update in applicaiton.yml
    - Key : Read/Write key to the cosmosdb account; update in application.yml
    - Continer Name : "tmusers" If container is missing, applicaiton will create new container.
3. Use Build and Test section to build and use for your testing.

# Build and Test
1. Do a maven install
    - Start from root directory of the project
    - use maven to build and install `mvn clean install`
    - This will create jar file `target/demo.jar`
    - You can directly run this jar file in java runtime `java -jar target/demo.jar`
  
2. Build docker image
    - If you dont want to run this in docker runtime or in a kubernetes cluster build a docker image.
    - To build docker image use `docker build --tag imagename:tag .`
    - You can tag this image to be pushed to a repository and use for deploymetn on K8s
    - Use command `docker tag imagename:tag repository.domain.com/imagename:tag`
    - Push to repository `docker push repository.domain.com/imagename:tag`
    
3. Testing
    - Creating user
    `curl --request POST  --header "Content-Type: application/json" --data '{ "firstName":"Ashish", "lastName":"Verma", "id":"127906" }' http://localhost:8080/tmuser`

    - Get User by ID
    `curl http://localhost:8080/tmuser/id/{userId}`

    - Get User by First Name
    `curl http://localhost:8080/tmuser/firstname/{firstName}`