#!/usr/bin/env groovy

package com.org.jenkins.stages.foo
class Publish {
  
  def publishfile(script) {    
    println('Starting Publish')
    //script.sh "docker build -t alsac-alsac-poc.jfrog.io/artifact ."
    //script.sh "docker tag alsac-alsac-poc.jfrog.io/artifact:latest ."
    println('Completed Publish')
  }
}
