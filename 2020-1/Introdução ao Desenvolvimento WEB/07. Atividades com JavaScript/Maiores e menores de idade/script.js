function calcular(){
    var idades = document.getElementById('idades').value
    idades = idades.split(",")
    var i
    var maiores=0
    var menores=0
    
    for(i=0; i<idades.length;i++){
        idades[i]= parseFloat(idades[i])
        if (idades[i] >=18){
            maiores=maiores+1
        }else{
            menores=menores+1
        } 

    
        
    }
    

    document.getElementById("resultado1").innerHTML = 'O total de maiores de idades: '+maiores
    document.getElementById("resultado2").innerHTML = 'O total de menores de idades: '+menores
}