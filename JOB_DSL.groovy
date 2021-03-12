job('First maven project VIA DSL') {
  description ("First project via DSL generated on ${new Date()} ")
  scm {
    git(https://github.com/jigglypuff27/Jenkins_Upgradev3.git,master)
  }
  triggers {
    scm('* * * * *')
  }
  steps {
    maven('clean package','maven-samples/single-module/pom.xml')
  }
  publishers {
          archiveArtifacts '**/*.jar'
        }
        
}  
