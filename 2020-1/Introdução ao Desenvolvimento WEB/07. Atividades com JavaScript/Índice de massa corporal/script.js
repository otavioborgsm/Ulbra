function calcular(){
    var nome = document.getElementById("nome").value
    var sexo = document.getElementById("sexo").value
    var peso = parseFloat(document.getElementById("peso").value)
    var altura = parseFloat(document.getElementById("altura").value)
    var idade = document.getElementById("idade").value
    var imc= 0
    if(sexo==1){
        sexo="Masculino"
    }else{
        sexo="Feminino"
    }
    imc=peso/(altura*altura)

    if (imc < 18.5) {
        resultado = "Abaixo do peso ideal."
    }
    if (imc >=18.5 && imc <=25) {
        resultado = "Peso ideal."
    }
    if (imc > 25 && imc<=30) {
        resultado="Acima do peso ideal."
    }
    if (imc > 30) {
        resultado="Obeso."
    }

    document.getElementById('1nome').innerHTML = "Nome: " +nome
    document.getElementById('1sexo').innerHTML = "Sexo: "+sexo
    document.getElementById('1idade').innerHTML= "Idade: "+idade
    document.getElementById('1altura').innerHTML ="Altura: " +altura+"m"
    document.getElementById('1peso').innerHTML = "Peso: "+peso+"Kg"
    document.getElementById('imc').innerHTML = "IMC= "+imc.toFixed(2)
    document.getElementById('resultado').innerHTML = "Situação: "+resultado
}