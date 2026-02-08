def call(String  ProjectName,String ImageTag="latest",String dockerHubUser){
  echo 'Building docker image'
  sh "docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag} ."
}
