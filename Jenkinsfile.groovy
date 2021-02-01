pipeline {
    agent any 
    stages {
        stage('build') {
            steps {
                bat 'g++ abcd.cpp -o run run.exe'
            }
        }
    }
}

