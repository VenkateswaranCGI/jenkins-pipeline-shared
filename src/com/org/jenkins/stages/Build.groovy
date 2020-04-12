#!/usr/bin/env groovy

package com.org.jenkins.stages.foo
class Build {
  
  def mvnbuild(script) {
    def buildcommand = 'mvn -B clean install -DskipTests'
    println('Starting Maven Build')
    script.sh buildcommand
    println('Completed Maven Build')
  }
}
