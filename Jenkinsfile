pipeline {
    agent any

    stages {
        stage('git & clean') {
            steps {
                bat "rmdir /s /q Assignment__6"
                bat "git clone https://github.com/ChandanaPR10/Assignment__6.git"
                bat "mvn clean -f Assignment__6"
            }
        }
        
        stage('install') {
            steps {
             bat "mvn install -f Assignment__6"
                
            }
        }
        stage('Test') {
            steps {
               bat "mvn test -f Assignment__6"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f Assignment__6"
            }
        }
    }
}
