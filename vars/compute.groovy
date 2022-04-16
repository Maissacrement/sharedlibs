def addition(x, y) {
    echo "${x} and ${y} do ${x+y}"
    docker.image('mysql:5')
}