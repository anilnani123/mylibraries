def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}
def newDeploy(jobname,ip,context)
{
 deploy adapters: [tomcat9(credentialsId: '0f783f78-088a-4576-a3be-24a2481b65dd', path: '', url: 'http://172.31.10.87:8080')], contextPath: 'qaapp', war: '**/*.war'
}

def runselenium(jobname)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}
  
  
  

