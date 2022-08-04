def githubUrl = "https://github.com/dwlpm/appcode.git"

pipelineJob("pl-20725-php-new") {
definition {
    cpsScm {
        scm {
            git{
              remote {
                url("${githubUrl}")
              }
              branch("*/dockerfile")
            }
        }
    }
  }
}
