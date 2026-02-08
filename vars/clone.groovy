def call(String url,String branch){
  echo 'clonning code'
  git url: "${url}", branch: "${branch}"
  echo "successfully clone"
}
