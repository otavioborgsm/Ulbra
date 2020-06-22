function calcular(){
    var num1 = parseInt(document.getElementById('numero1').value);
    var num2 = parseInt(document.getElementById('numero2').value);
    var opr =  document.getElementById('operacao').value ;
    var res
    
    switch (opr) {
        case '1':
            res= num1+num2;
            break;
        case '2':
            res= num1-num2;
            break;
        case '3':
            res= num1*num2;
            break;
        case '4':
            res= num1/num2;
            break;        
        ;
    }
    
    document.getElementById("resultado").innerHTML = +res
}