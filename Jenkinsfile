pipeline {
    // master executor should be set to 0
    agent any
    stages {
        stage('Build Jar') {
            steps {
                // bat for windows
//                 sh "mvn clean package -DskipTests"
                    sh "mvn clean package"
            }
        }
        stage('Build Image') {
            steps {
                // bat for windows
                sh "docker build -t='pavangurram/docker-integration' ."
            }
        }
        stage('Push Image') {
            steps {
			    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'pass', usernameVariable: 'user')]) {
                    // bat for windows
			        sh "docker login --username=${user} --password=${pass}"
			        sh "docker push pavangurram/docker-integration:latest"
			    }
            }
        }
    }

  post {
                always {
                    publishHTML([
                            allowMissing         : false,
                            alwaysLinkToLastBuild: false,
                            keepAll              : false,
                            reportDir            : 'target',
                            reportFiles          : 'report.html',
                            reportName           : 'Cucumber Extent report',
                            reportTitles         : ''
                    ])
                }
            }

}