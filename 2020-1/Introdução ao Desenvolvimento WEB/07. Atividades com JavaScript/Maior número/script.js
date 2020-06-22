function numeros(){
    var num = document.getElementById('numero').value
    num = num.split(",")
    var i
    var res=0
    
    for(i=0; i<num.length;i++){
        num[i]= parseFloat(num[i])
        if (res < num[i]) 
            res=num[i]
    }
    

    document.getElementById("resultado").innerHTML = 'O maior número é: '+res
}