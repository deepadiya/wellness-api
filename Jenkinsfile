pipeline {
  agent any

  tools {
    maven 'Maven'
    jdk 'Java 17'
  }

  stages {
    stage('Build') {
      steps {
        sh 'mvn clean compile'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
  }
}
