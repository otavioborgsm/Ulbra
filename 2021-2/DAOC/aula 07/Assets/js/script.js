$(document).ready(function() {

    menu()

    $('#menu').click(function(){
        menu() 
    })
      
    $('#home').click(function(){
        home()
    })

    $('#about').click(function(){
        about()
    })

    $('#contact').click(function(){
        contact()
    })
})

function menu(){

    $('section').load('views/rapazes.html')

}

function home(){

    $('header').html(`
    <h1 id="titulo">Desenvolvimento de Aplicações<br>Orientado a Componentes</h1>
    <p>Otávio de Medeiros Borges</p>
    `)

}

function about() {

    $('header').html(`
    <h1 id="titulo">Cadeira do Vini</h1>
    <p>Otávio de Medeiros Borges</p>
    `)

}

function contact(){

    $('section').load('views/contact.html')

}

function pessoa(){

    var nome = document.getElementById("nome").value
    var email = document.getElementById("email").value
    var telefone = document.getElementById("telefone").value
    var cep = document.getElementById("cep").value
    var assunto = document.getElementById("assunto").value


    getLocal(cep, function(local){
        
        let contato = new Contato(nome, email, telefone, cep, assunto, local)
        
        $('section').load('views/person.html', function(){

            document.getElementById('nomeContato').innerHTML= contato.nome
            document.getElementById('emailContato').innerHTML= contato.email
            document.getElementById('telefoneContato').innerHTML= contato.telefone
            document.getElementById('cepContato').innerHTML= contato.cep
            document.getElementById('comentarioContato').innerHTML= contato.assunto
            document.getElementById('localContato').innerHTML= contato.local

        })
    })

    
    
}

class Contato{

    constructor(_nome, _email, _telefone, _cep, _assunto, _local){
        this.nome = _nome
        this.email = _email
        this.telefone = _telefone
        this.cep = _cep
        this.assunto = _assunto
        this.local = _local
    }

}

function getLocal(cep, callBack) {
    $.getJSON('http://viacep.com.br/ws/'+cep+'/json', function(data){
        return callBack(data.localidade)
    })
}