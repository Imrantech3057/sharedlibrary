def gitDownload(repo)
{
  git "https://github.com/Imrantech3057/${repo}"
}
def mavenBuild()
{
  sh 'mvn package'
}
def deploy(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}
def runselenium(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar
}
