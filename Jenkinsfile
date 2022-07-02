pipeline {
    agent any

    triggers {
            pollSCM('* * * * *')
    }

    environment {
        APPLICATION_NAME = 'e-canteen-backend'
    }

    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }
    }
}
