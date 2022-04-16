def addition(x, y) {
    echo "${x} and ${y} do ${x+y}"
    def docker = org.jenkinsci.plugins.docker.workflow.Docker docker
    docker.image('mysql:5')
}