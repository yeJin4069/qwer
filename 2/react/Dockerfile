# 20 버전의 Node.js를 베이스 이미지로 사용.
FROM node:20

# 작업 디렉토리를 /react-app으로 설정.
WORKDIR /react-app

# 현재 디렉토리 경로 기준, package.json 파일을 /react-app 디렉토리로 복사.
COPY package.json .

# React 애플리케이션의 의존성 설치.
RUN npm install

# 현재 디렉토리의 모든 파일을 /react-app 디렉토리로 복사.
COPY . .

# 해당 컨테이너가 외부로 포트 80(HTTP)을 노출하도록 설정.

EXPOSE 80

# 컨테이너가 실행되면 'npm start' 명령어를 실행(즉, React 애플리케이션 실행).
CMD ["npm", "start"]
