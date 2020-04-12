#!/usr/bin/env groovy

package com.org.jenkins.stages.foo
class Analysis {
  
  def sonaranalysis(script) {
    //def analysiscommand = "/opt/sonar-scanner/bin/sonar-scanner"
    println('Starting Code Analysis')
    //script.sh analysiscommand
    println('Completed Code Analysis')
  }
}
