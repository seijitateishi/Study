function calculo(){
    window.alert('pede desculpa pro greloninjalol')
    escolha = document.getElementsByName('nradio')
    descricao = document.querySelector('div#res')
    var img = document.createElement('img')
    var footer = document.getElementById('rodape')
    footer.style.opacity =0.5
    img.setAttribute('id','foto')
    if (escolha[0].checked){
        img.setAttribute('src','muca2.png')
        descricao.innerHTML='megamuca'
    }else if (escolha[1].checked){
        img.setAttribute('src','muca3.png')
        descricao.innerHTML='smurfinhodomuca'
    }else if (escolha[2].checked){
        img.setAttribute('src','muca4.png')
        descricao.innerHTML='nerdola(smurfdomuca)'
    }else if (escolha[3].checked){
        img.setAttribute('src','mucachan.png')
        descricao.innerHTML='kawaii muca-chan'
    }else if (escolha[4].checked){
        img.setAttribute('src','mucacomendobarro.png')
        descricao.innerHTML='muca comendo barro'
    }
    res.appendChild(img)


}