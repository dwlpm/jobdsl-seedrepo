def githubUrl = "https://github.com/dwlpm/appcode.git"
def credentialsId = "github-token"

pipelineJob("pl-20725-php-new") {
definition {
    cpsScm {
        scm {
            git{
              remote {
                url("${githubUrl}")
                credentials("${credentialsId}")
              }
              branch("*/dockerfile")
            }
        }
    }
  }
}
