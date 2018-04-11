pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo Build'
      }
    }
    stage('Backend') {
      parallel {
        stage('Unit') {
          steps {
            sh 'echo Backend'
          }
        }
        stage('Performacne') {
          steps {
            sh 'echo Performance'
          }
        }
      }
    }
    stage('Frontend ') {
      steps {
        sh 'echo Frontend'
        input(message: 'Deploy to QA?', id: 'depQA', ok: 'approveToQA', submitter: 'QA', submitterParameter: 'QAParam')
      }
    }
    stage('Static Analysis') {
      steps {
        sh 'echo StaticAnalysis'
      }
    }
    stage('Deploy') {
      steps {
        sh 'echo Deploy'
      }
    }
  }
}