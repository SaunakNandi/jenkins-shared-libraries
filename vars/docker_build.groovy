def call(String  ProjectName){
  echo 'Building docker image'
  sh "docker build -t ${ProjectName}:latest ."
}
