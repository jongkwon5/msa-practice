FROM jenkins/jenkins:lts

USER root

# Java 17 설치
RUN apt-get update && apt-get install -y openjdk-17-jdk

# Docker CLI 설치 (이미 했다면 생략 가능)
RUN apt-get install -y docker.io

# Jenkins 유저에게 docker 권한 부여
RUN usermod -aG docker jenkins

USER jenkins