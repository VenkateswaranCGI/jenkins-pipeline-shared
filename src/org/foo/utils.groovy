#!/usr/bin/env groovy

package org.foo
class utils{

  def mvn() {
    println('hello')
    sh 'mvn -version'
  }
}
