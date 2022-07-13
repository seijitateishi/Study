function tabuada(){
    var entrada = document.getElementById('numero')
    var resultado = document.getElementById('resultado')
    var num = Number(entrada.value)
    var soma = 0
    resultado.innerText=''
    for(var a = 1;a <= 10;a++){
        soma = a*num
        resultado.innerHTML += `${num}x${a}=${soma}<br></br>`
    }

}