def gitDownload(repo)
{
  git "https://github.com/Imrantech3057/mvnproj.git"
}
def mavenBuild()
{
  sh "mvn package"
}

