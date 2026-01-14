/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
*/


fun prime(n:Double):Boolean{
    val srn:Double = Math.sqrt(n)
    val fsr:Int = srn.toInt()
    println("square root of "+ n + " is : " + fsr)
    for(i in 2..fsr){
        if(n.toInt() % i == 0){
            println(""+ n + " is not a prime number")
            println("because it is divisible by " + i)
            return false
        }
    }
    println("" + n + " is a prime number")
    return true
//    return false
}

fun factorialRec(n:Int):Int{ //Recursive Version
//     var r = 0;
    if(n>1){
    	return n*factorialRec(n-1);
    }else if(n==1){
        return 1;
    }
    
    return 0;
}

fun factorialItr(n:Int):Int{
    var s = n;
    var nbr = n;
    while(nbr>1){
        s = s * (nbr-1);
        nbr = nbr - 1;
    }
    return s;
}

fun palindrome(str:String):Boolean{
    if(str.length <=1){
        println("This is not a word");
        return false;
    }else{
        var str = str.lowercase()
//     val lastIndex = str.length-1;
      if(str.get(0)!=str.get(str.length-1)){
        return false;
    }else
    if(str.length % 2 == 0){
        for(ci in 0..(str.length-1)/2){
            for(cri in str.length-1..(str.length-1)/2){
                if(str[ci]!=str[cri]){
                    return false
                }
            }
            
        }
        return true;
    }else{
        for(ci in 0..((str.length-1)/2).toInt()-1){
            for(cri in str.length-1..((str.length-1)/2).toInt()+1){
                if(str[ci] != str[cri]){
                    return false;
                }
            }
        }; return true
    }
  
//     return false;
    }
}

fun toBinary(n:Int):String{ /* converts integer decimal to binary */
    var q = n;
    var bin = "";
    var r = 0;
    while(q!=0){
        r = q%2;
        bin = bin + r.toString();
        q = (q/2).toInt();
//         println(q);
    }
    
    return bin;
}

fun toDecimal(b: String):Int{
    val lastIndex = b.length - 1;
//     var digit = b[lastIndex];
    var digit:Int = 0;
    var sum = 0;
    var p = 0;
    
    var d = lastIndex;
    
    while(d >= 0){
// 		println(d);
        if(b[d]=='0'){
            digit = 0;
            
        }else if(b[d]=='1') {
            digit=1;
        };
        
//         println("digit : $digit");
        sum = sum + Math.pow(2.0, p.toDouble()).toInt() * digit;
        p = p + 1;
//         println(p);
        d = d-1;
       
    }
    
    
    return sum;
}

val f:(Int)->Int = {it+1}; //Lambda function


fun main(){ //returns void (nothing)
//     println("This is the main method")
//     println(prime(3599.0))
//     println(factorialRec(5))
//     println(factorialItr(5))
//     println(palindrome(""))
//     println(toBinary(21));
    
    println(toDecimal("101101"));
    println(f(28))
    
    
//     println({it + 1});
    
    
//     println(Math.pow(2.0,2.toDouble()).toInt()%10);
//     println(4%10)
//     println((21/2).toInt());
//     prime(3600.0)
}
