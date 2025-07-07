FROM jenkins/jenkins:lts

USER root

# Java 17 설치
RUN apt-get update && apt-get install -y openjdk-17-jdk

# Docker Compose v2 설치 (시스템 전역 경로에 설치)
RUN mkdir -p /usr/local/lib/docker/cli-plugins && \
    curl -SL https://github.com/docker/compose/releases/download/v2.27.0/docker-compose-linux-x86_64 \
    -o /usr/local/lib/docker/cli-plugins/docker-compose && \
    chmod +x /usr/local/lib/docker/cli-plugins/docker-compose

# Jenkins에게 Docker 권한 부여
RUN apt-get install -y docker.io && \
    usermod -aG docker jenkins

USER jenkins