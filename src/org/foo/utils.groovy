#!/usr/bin/env groovy

package org.foo
class utils{

  def mvn(script) {
    println('hello')
    script.sh "mvn -version"
    sh 'mvn -version'
  }
}
