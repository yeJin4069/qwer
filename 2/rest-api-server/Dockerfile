# Temurin OpenJDK 17을 베이스 이미지로 사용
FROM eclipse-temurin:17

# 빌드된 애플리케이션 파일 저장 위치 설정
WORKDIR /springboot-app

# 'JAR_FILE'이라는 빌드 인수를 정의(빌드된 JAR 파일의 경로)
ARG JAR_FILE=build/libs/*.jar

# JAR_FILE 경로에 있는 파일(.jar)을 위에서 설정한 작업 디렉토리로 복사
COPY ${JAR_FILE} app.jar

# 컨테이너가 시작될 때 실행할 명령을 정의(즉, SpringBoot 애플리케이션 실행)
ENTRYPOINT ["java", "-jar", "app.jar"]