def call(String imageName,String credID) {
    withCredentials([
        usernamePassword(
            credentialsId: "${credID}",
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
