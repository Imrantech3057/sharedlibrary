def gitDownload(repo)
{
  git "https://github.com/Imrantech3057/${repo}.git"
}
def mavenBuild()
{
  sh "mvn package"
}
def deploy(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}

