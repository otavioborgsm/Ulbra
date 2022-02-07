// grupo de exemplos 

var x11 = 1, x12 = 1, y1 = 1; 
var x21 = 1, x22 = 0, y2 = 1;
var x31 = 0, x32 = 1, y3 = 0; 
var x41 = 0, x42 = 0, y4 = 0;

//viés

var vies = 1;

// (0 * 1) + (0 * 1) -> soma = 0 -> y = 0


// (1 * 1) + (1 * 1) -> soma = 2 -> y = 1

// pesos iniciais


var w0 = 0,w1 = 0, w2 = 0;

// auxiliares
var sum , y, ajustes, ajustesTotais = 0, repeticoes = 0;

do{
    ajustes = 0;


    sum = soma(vies, x11, x12);
    y = transferencia(sum);
    if(y != y1){
        ajuste(vies, x11, x12, y1, y);
        ajustes++;
        ajustesTotais++;
    }


    sum = soma(vies, x21, x22);
    y = transferencia(sum);
    if(y != y2){
        ajuste(vies, x21, x22, y2, y);
        ajustes++;
        ajustesTotais++;
    }

    sum = soma(vies, x31, x32);
    y = transferencia(sum);
    if(y != y3){
        ajuste(vies, x31, x32, y3, y);
        ajustes++;
        ajustesTotais++;
    }


    sum = soma(vies, x41, x42);
    y = transferencia(sum);
    if(y != y4){
        ajuste(vies, x41, x42, y4, y);
        ajustes++;
        ajustesTotais++;
    }



    console.log("Saidas: " + y);
    repeticoes++;
}while(ajustes != 0);

console.log("Os pesos finais são " +w1+ " e " + w2);
console.log("Ajustes totais: " + ajustesTotais);
console.log("Repetições: " + repeticoes);


function soma(_x0,_x1, _x2){
    return (_x1 * w1) + (_x2 * w2);
}

function transferencia(_sum){
    if(_sum<0){
        return 0;
    }else if(0<= _sum && _sum <= 1){
        return _sum
    }else{
        return 1
    }
}

function ajuste(_x0, _x1, _x2, _yd, _yo){
    w0 = w0 + 1 * (_yd - _yo) * _x0;
    w1 = w1 + 1 * (_yd - _yo) * _x1;
    w2 = w2 + 1 * (_yd - _yo) * _x2;

}