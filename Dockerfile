FROM ghcr.io/graalvm/graalvm-ce:22.3.0
RUN curl https://dlcdn.apache.org/maven/maven-3/3.9.0/binaries/apache-maven-3.9.0-bin.tar.gz --output apache-maven-3.9.0-bin.tar.gz
RUN mkdir -p /usr/local/apache-maven/apache-maven-3.9.0
RUN tar -xvf apache-maven-3.9.0-bin.tar.gz -C /usr/local/apache-maven/apache-maven-3.9.0

WORKDIR /usr/src/app
COPY . .
RUN /usr/local/apache-maven/apache-maven-3.9.0/apache-maven-3.9.0/bin/mvn clean package -Pnative