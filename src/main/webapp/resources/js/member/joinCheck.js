console.log("비번체크")

//js
// const password = document.getElementById("password");
// const passwordCheck = document.getElementById("passwordCheck");
// const passwordResult = document.getElementById("passwordResult");
// const passwordCheckResult = document.getElementById("passwordCheckResult");
// const btn = document.getElementById("btn");

// let p1=false; //password check
// let p2=false; //passwordCheck check

// btn.addEventListener("click", function({
//     if(p1&&p2)
// }))


// password.addEventListener('blur', function(){
//     let p = password.value;
//     if(p.length>7){
//         passwordResult.innerHTML='ok'
//         p1=ture;
//     }else{
//         passwordResult.innerHTML='비번은 8글자 이상이어야 한다.'
//         p1=false;

//     }
// })

// password.addEventListener('keyup', function(){
//     if(passwordCheck.value==password.value){
//         passwordCheckResult.innerHTML='일치한다.'
//         p2=ture;

//     }else{
//         passwordCheckResult.innerHTML='일치하지 않는다.'
//         p2=false;

//     }
// });

//jquery

let checks={p1:false, p2:false}

$('#btn').click(function(){
    let flag=true;
    for(p in checks){
        console.log(p);
        console.log(checks[p])
        if(checks[p]){
            flag=false;
        }
    }

    if(flag){
        alert('ok');
    }else{
        alert('no');
    }
})

$('password').blur(function(){
    if($('passwordResult').value().length>7){
        $('passwordResult').html('ok');
        checks.p1=true;
    }else{
        $('passwordResult').html('비번은 8글자 이상이어야 한다.')
        checks.p1=false;

    }

    $('#passwordCheck').val('');
    checks.p2
});

$('passwordCheck').keyup(function(){
    if($('passwordCheck').val()==$('password').val()){
        $('passwordCheckResult').html('일치한다.')
        checks.p2=true;

    }else{
        $('passwordCheckResult').html('일치하지 않는다.')
        checks.p2=false;

    }
});
