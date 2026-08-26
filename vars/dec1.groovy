def gitdownload(repo){
  git branch: 'main', url: "https://github.com/banu5645/${repo}.git" }
def buildartifact(){
  sh'mvn package'}
def deploy(url,contextpath){
  deploy adapters: [tomcat9(alternativeDeploymentContext: '', credentialsId: 'f21de2d3-84ee-4d2a-9955-34945d3c43cc', path: '', url: url)], contextPath: contextpath, war: '**/*.war'}
def delivary(url,contextpath){
  deploy adapters: [tomcat9(alternativeDeploymentContext: '', credentialsId: 'f21de2d3-84ee-4d2a-9955-34945d3c43cc', path: '', url: url)], contextPath: contextpath, war: '**/*.war'}
