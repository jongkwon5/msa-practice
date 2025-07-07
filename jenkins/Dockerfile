FROM jenkins/jenkins:lts

USER root

# Java 17 설치
RUN apt-get update && apt-get install -y openjdk-17-jdk

# Docker 및 docker-compose 설치
RUN apt-get install -y docker.io curl
RUN curl -L "https://github.com/docker/compose/releases/download/1.29.2/docker-compose-$(uname -s)-$(uname -m)" \
  -o /usr/local/bin/docker-compose && chmod +x /usr/local/bin/docker-compose

# docker 그룹에 jenkins 사용자 추가
RUN groupadd -f docker && usermod -aG docker jenkins

USER jenkins