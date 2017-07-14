FROM cloudbees/jnlp-slave-with-java-build-tools:latest
ADD petclinic-test-driver.jar app.jar
RUN sh -c 'touch ./app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
