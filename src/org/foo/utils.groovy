#!/usr/bin/env groovy

package org.foo
class utils{

  def mvn(script) {
    println('hello')
    steps.sh "mvn -version"
    sh 'mvn -version'
  }
}
