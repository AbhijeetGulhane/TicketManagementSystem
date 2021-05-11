// * Groovy - Bsed off of Java

pipeline {
    agent any
    environment{
        dockerAccount = credentials('AbhijeetGulhane')
    }

    stages {

        stage('HelloWorld'){
            steps {
                sh 'echo helloworld'
                sh 'pwd'
                sh 'ls'
            }
        }
        stage('print out credentials'){
                steps{
			sh "echo docker login $dockerAccount"
			sh  "echo $dockerAccount_PSW"
			sh  "echo $dockerAccount_USR"
                        sh  "echo docker push"
		}
        }
        stage('Jenkins structure'){
            steps {
                sh "chmod +x ./scripts/test.sh"
		sh "./scripts/test.sh"
            }
        }
    }

}
