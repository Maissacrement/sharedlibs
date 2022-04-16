import org.jenkinsci.plugins.docker.workflow.*

def addition(x, y) {
    echo "${x} and ${y} do ${x+y}"
    Docker
}