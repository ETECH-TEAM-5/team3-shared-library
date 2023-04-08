def call(String repoUrl){
    pipeline{
        agent any 
        stages{
            stage('1-build'){
                steps{
                    sh 'free -g'
                    sh 'lsblk'
                }
            }
            stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage('closing'){
            steps{
                echo "new demo"
            }
           }
        }
    }
}
