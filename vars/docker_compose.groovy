def call() {
    echo 'Deploying using Docker Compose'
    sh "docker-compose down && docker-compose up -d"
}
