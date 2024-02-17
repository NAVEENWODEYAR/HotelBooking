#Dockerfile, blueprint to create dockerImages.,
FROM openjdk:21
RUN mkdir /usr/app/
COPY target/HotelBooking.jar /usr/app 
WORKDIR /usr/app/ 
ENTRYPOINT [ "java","-jar","HotelBooking.jar" ]