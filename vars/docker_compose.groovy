def call() {
    echo 'Deploying using Docker Compose'
    sh '''
        docker compose pull
        docker compose up -d
    '''
}
