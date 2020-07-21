# Introduction 
This is dummy springboot project which can be 
used a modified to do experiments. 
This with the help of a pipeline in Azure can be 
converted into a docker image which can be used to 
deploy on kubernetes or docker rutime.

# Getting Started
1. Clone the project to your local.
2. Modify it as per your requirements
3. Use Build and Test section to build and use for your testing.
4. If you want to keep changes for future then check in a different branch.

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
    