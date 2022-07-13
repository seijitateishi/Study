let num = document.querySelector('input#fnum')
let lista = document.querySelector('select#flista')
let res = document.querySelector('div#res')
let valores = []

function isNumero(n){
    if(Number(n) >= 1 && Number(n) <= 100) {
        return true
    } else {
        return false
    }
}

function inLista(n,l){
    if (l.indexOf(Number(n)) != -1) {
        return true
    } else {
        return false
    }
}

function adicionar(){
    if(isNumero(num.value) && !inLista(num.value,valores)){
        valores.push(Number(num.value))
        let item = document.createElement('option')
        item.text = `Valor ${num.value} adicionado`
        lista.appendChild(item)        
    } else {
        window.alert('numero invalido')
    }
    num.value = ''
    num.focus()
}
function finalizar(){
    let maior = valores[0]
    let menor = valores[0]
    let soma = 0 
    let tot = valores.length
    let media = 0
    
    for (let pos in valores){
        if (valores[pos]>maior){
            maior = valores[pos]
        }
    }
    for (let pos in valores){
        if (valores[pos]<menor){
            menor = valores[pos]
        }
    }
    for (let pos in valores){
            soma += valores[pos]
    }
    media = soma / tot

    res.innerHTML=''
    res.innerHTML += `${valores.length} numeros cadastrados`
    res.innerHTML += `<br>${maior} é o maior valor`
    res.innerHTML += `<br>${menor} é o menor valor`
    res.innerHTML += `<br>${soma} é a soma de todos os numeros`
    res.innerHTML += `<br>${media} é a media de todos os numeros`
}