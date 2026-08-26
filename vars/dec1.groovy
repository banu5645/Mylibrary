def gitdownload(repo){
  git branch: 'main', url: "https://github.com/banu5645/${repo}.git" }
def buildartifact(){
  sh'mvn package'}
