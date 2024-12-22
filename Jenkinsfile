pipeline {
    agent any
    tools {
        maven 'Maven 3'
    }
    stages{
        stage('git checkout'){
            steps{
                git branch: 'master',
                url: 'https://github.com/demuduraviteja/jenkinshandsonspringboot.git'
            }
        }
        stage('Maven Build'){
            steps{
                sh 'mvn clean package spring-boot:repackage'
            }
        }
        stage('Docker Build'){
            steps{
                sh 'docker build -t my-springboot .'
            }
        }
        stage('Docker Run'){
            steps{
                sh 'docker run -it -d -p 8085:8085 --name my-springboot my-springboot'
            }
        }
    }
}
