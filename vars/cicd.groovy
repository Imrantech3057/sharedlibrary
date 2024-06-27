def gitDownload(repo)
{
  git "https://github.com/Imrantech3057/${repo}.git"
}
def mavenBuild()
{
  sh "mvn package"
}

