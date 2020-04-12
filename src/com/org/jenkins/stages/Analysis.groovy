
#!/usr/bin/env groovy

package com.org.jenkins.stages.foo
class Analysis {
  
  def sonaranalysis(script) {
    //def buildcommand = 'mvn package'
    println('Starting Code Analysis')
    //script.sh buildcommand
    println('Completed Code Analysis')
  }
}
