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
    var assunto = document.getElementById("assunto").value

    $('section').load('views/person.html', function(){

        document.getElementById('nomeContato').innerHTML = nome
        document.getElementById('emailContato').innerHTML = email
        document.getElementById('telefoneContato').innerHTML= telefone
        document.getElementById('comentarioContato').innerHTML =assunto

    })
    
}