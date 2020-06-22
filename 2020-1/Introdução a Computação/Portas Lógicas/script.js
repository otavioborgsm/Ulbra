function calcular(){
    var a = document.getElementById("a").value
    var b = document.getElementById("b").value
    var not_a
    var not_b
    var not_e
    var e
    var not_ou
    var ou
    var not_xor
    var xor
    
    if (a==1){
        not_a=("False")
    }else{
        not_a=("True")
    }
    document.getElementById('nota').innerHTML = "Not A= " + not_a;
    if (b==1){
        not_b=("False")
    }else{
        not_b=("True")
    }
    document.getElementById('notb').innerHTML = "Not B= " + not_b;

    if (a==1 && b==1){
        not_e=("False")
        e=("True")
    }
    else{
        not_e=("True")
        e=("False")
    }
    document.getElementById('note').innerHTML = "Not And= " + not_e;
    document.getElementById('and').innerHTML = "And= " + e;

    if (a==1 || b==1){
        not_ou=("False")
        ou=("True")
    }else{
        not_ou=("True")
        ou=("False")
    }
    document.getElementById('notor').innerHTML = "Not Or= " + not_ou;
    document.getElementById('or').innerHTML = "Or= " + ou;

    if ((a==1 || b==1) && (a !== b)){
        not_xor=("False")
        xor=("True")
    }else{
        not_xor=("True")
        xor=("False")
    }
    document.getElementById('notxor').innerHTML = "Not Xor= " + not_xor;
    document.getElementById('xor').innerHTML = "Xor= " + xor;
}