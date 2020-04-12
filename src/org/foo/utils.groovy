#!/usr/bin/env groovy

package org.foo
class utils implements Serializable {

  def mvn() {
    echo 'hello'
    sh 'mvn -version'
  }
}
