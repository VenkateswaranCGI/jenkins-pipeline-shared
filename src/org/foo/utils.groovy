#!/usr/bin/env groovy

package org.foo
class utils implements Serializable {

  def mvn() {
    println('hello')
    sh('mvn -version')
  }
}
