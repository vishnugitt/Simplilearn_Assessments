//global scope
var fruit = 'apple'
console.log(fruit);        //apple

function getFruit(){
    console.log(fruit);    //fruit is accessible here
}

getFruit();



function foo1(){
    var fruit ='apple';
    console.log('inside function: ',fruit);
}

foo1();                    //inside function: apple
console.log(fruit);


function foo1(){
    if(true){
        var fruit1 = 'apple';        //exist in function scope
        const fruit2 = 'banana';     //exist in block scope
        let fruit3 = 'strawberry';   //exist in block scope

    }
    console.log(fruit1);
    console.log(fruit2);
    console.log(fruit3);
}

foo1();


function foo2(){
    var fruit1 = 'apple';        
    const fruit2 = 'banana';     
    let fruit3 = 'strawberry';
    function foo2(){
        console.log(fruit1);
        console.log(fruit2);
        console.log(fruit3);
    }
    foo2();
}
