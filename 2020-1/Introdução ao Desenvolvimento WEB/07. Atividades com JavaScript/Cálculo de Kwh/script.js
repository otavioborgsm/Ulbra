function calcular(){
    var valor = document.getElementById('valor').value
    var kwh = document.getElementById('kwh').value
    var res
    
    res = kwh * valor
    if(kwh >= 100 && kwh<200){
        res= res*1.25
    }
    if(kwh >= 200){
        res= res*1.5
    }
    

    
    alert("O valor será de: "+res)
}