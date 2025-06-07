pipeline{
    agent any

    stages{
        stage('Clone Repository'){
            steps{
                git 'https://github.com/pillaiyedhu/jenkins-test.git'
            }
        }
        stage('Maven Build'){
            steps{
                sh './mvnw clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                sh 'docker build -t myjenkinsapp'
            }
        }
        stage('Run Docker Container'){
            steps{
                sh '''
                docker stop myjenkinsapp || true
                docker rm myjenkinsapp || true
                docker run -d -p 8000:8000 --name myjenkinsappcon myjenkinsapp
                '''
            }
        }

    }


}