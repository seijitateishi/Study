function padrao(){
    var inicio=document.getElementById('inicio')
    var final=document.getElementById('final')
    var intervalo=document.getElementById('intervalo')
    var res=document.getElementById('resultado')
    var i=Number(inicio.value)
    var f=Number(final.value)
    var inter=Number(intervalo.value)
    var a=1 
    for(a=i;a<=f;a+=inter){
        res.innerText+=a+' \u{1F449}'
    }
}