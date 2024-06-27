def gitDownload(repo)
{
  git "https://github.com/Imrantech3057/${repo}"
}
def mavenBuild()
{
  sh "mvn package"
}

