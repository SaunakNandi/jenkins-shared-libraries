def call(String imageName) {
    withCredentials([
        usernamePassword(
            credentialsId: 'dockerHubCred',
            usernameVariable: 'dockerHubUser',
            passwordVariable: 'dockerHubPass'
        )
    ]) {
        sh """
            docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}
            docker tag ${imageName}:latest ${env.dockerHubUser}/${imageName}:latest
            docker push ${env.dockerHubUser}/${imageName}:latest
        """
    }
    echo 'Pushing image to Docker Hub'
}
