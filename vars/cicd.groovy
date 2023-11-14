def gitDownload(repo)
{
    git "https://github.com/intelliqittrainings/${repo}.git"
}
def build()
{
    sh 'mvn package'
}
