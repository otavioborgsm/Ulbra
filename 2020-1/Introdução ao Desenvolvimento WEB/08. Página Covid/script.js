function calcular(){
    var select = document.getElementById("select").value
    var pessoas = document.getElementById("pessoas").value    
    var seteDias = 0
    var quatorzeDias = 0
    var trintaDias = 0
    var i=0
    if (select == 1) {
        document.getElementById("isolamento").innerHTML = "Mesmo cumprindo o isolamento social, o total de contagiados será:"
    }else {
        document.getElementById("isolamento").innerHTML = "Não cumprindo o isolamento social, o total de contagiados será:"
    }
    
    seteDias =pessoas*(Math.pow(1.05, 7))
    document.getElementById('seteDias').innerHTML = "Em 7 dias: "+seteDias.toFixed(0)+" pessoas"

    quatorzeDias =pessoas*(Math.pow(1.05, 14))
    document.getElementById('quatorzeDias').innerHTML = "Em 14 dias: "+quatorzeDias.toFixed(0)+" pessoas"
    
    trintaDias =pessoas*(Math.pow(1.05, 30))
    document.getElementById('trintaDias').innerHTML = "Em 30 dias: "+trintaDias.toFixed(0)+" pessoas"
}