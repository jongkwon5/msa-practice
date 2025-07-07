# 1단계: Gradle로 JAR 빌드
FROM gradle:8.5.0-jdk17 AS builder
COPY . /app
WORKDIR /app

# ✅ 실행 권한 부여
RUN chmod +x ./gradlew

RUN ./gradlew bootJar --no-daemon

# 2단계: 실행용 이미지
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]