import org.jenkinsci.plugins.docker.workflow.DockerDSL

def addition(x, y) {
    echo "${x} and ${y} do ${x+y}"
    Object docker = new DockerDSL().getValue(script)
    println docker
}