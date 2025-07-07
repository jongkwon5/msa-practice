FROM jenkins/jenkins:lts

USER root

# Java 17 설치 (이미 되어 있다면 생략 가능)
RUN apt-get update && apt-get install -y openjdk-17-jdk

# Docker CLI 설치
RUN apt-get install -y docker.io curl

# docker-compose 설치 (v1.x 안정 버전)
RUN curl -L "https://github.com/docker/compose/releases/download/1.29.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose && \
    chmod +x /usr/local/bin/docker-compose

# Jenkins 유저에 docker 권한 부여
RUN usermod -aG docker jenkins

USER jenkins