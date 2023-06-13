/**
 * 
 */

 function calcjs(){
	 //parseInt를 하는 이유 > parseInt를 하지 않으면 정수형태가 아닌 문자열 형태로 들어오기때문에 parseInt를 해줘야함
	 var n1 = parseInt(document.getElementById("n1").value)
	 //var n1 = document.getElementById("n1").value
	 //n1 = parseInt(n1)
	 var n2 = parseInt(document.getElementById("n2").value)
	 var op = document.getElementById("op").value
	 
	 var result = 0;
	 switch(op){
		 case "+" : result = n1 + n2; break;
		 case "-" : result = n1 - n2; break;
		 case "*" : result = n1 * n2; break;
		 case "/" : result = n1 / n2; break;
	 }
	 
	 console.log(result)
	 
	 var ans = documet.getElementById("ans")
	 ans.value = result
}