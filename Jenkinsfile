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
                sh 'sudo docker build -t myjenkinsapp .'
            }
        }
        stage('Run Docker Container'){
            steps{
                sh '''
                sudo docker stop myjenkinsapp || true
                sudo docker rm myjenkinsapp || true
                sudo docker run -d -p 8000:8000 --name myjenkinsappcon myjenkinsapp
                '''
            }
        }

    }


}