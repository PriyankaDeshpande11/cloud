# Pull tomcat latest image from dockerhub
FROM tomcat:8.0.51-jre8-alpine
MAINTAINER priyankadeshpande@gmail.com
# copy war file on to container
COPY ./target/cloud*.war /usr/local/tomcat/webapps
EXPOSE  8080
USER cloud
WORKDIR /usr/local/tomcat/webapps
CMD ["catalina.sh","run"]