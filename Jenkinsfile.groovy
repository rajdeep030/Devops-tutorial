pipeline {
    agent any
    stages {
        stage('build') {
  bat "dir && g++ abcd.cpp -o run && run.exe"
}
    }
}
