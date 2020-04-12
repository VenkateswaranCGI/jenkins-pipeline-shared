#!/usr/bin/env groovy

package org.foo
class utils implements Serializable {

  def mvn() {
    sh 'mvn -version'
    echo 'hello'
  }
}
