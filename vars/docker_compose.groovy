def call() {
    echo 'Deploying using Docker Compose'
    sh "docker-compose up -d"
}
