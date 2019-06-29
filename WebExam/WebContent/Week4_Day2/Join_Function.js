function enroll(){
 
 var ipcheck = /^[a-zA-Z0-9]{4,12}$/  
 var emailcheck = /^[a-zA-Z0-9]([-_.]?[a-zA-Z0-9])*@[0-9a-zA-Z]*.[0-9a-zA-Z]{2,3}$/i;

 var id = document.getElementById("idd");
 var pw1 = document.getElementById("pw1");
 var pw2 = document.getElementById("pw2");
 var email = document.getElementById("email");
 var num1 = document.getElementById("num1");
 var num2 = document.getElementById("num2");

 var arrNum1 = new Array();
 var arrNum2 = new Array();

 if(ipcheck.test(id.value)){
 }else{ 
  alert("아이디를 다시 입력하세요.");id.value="";id.focus();return false;}

 
        if(id.value == pw1.value){
  alert("비밀번호가 아이디와 똑같습니다. 다시 입력하세요.");
  pw1.value="";pw1.focus();return false;
 }else if(ipcheck.test(pw1.value)){
 }else{ 
  alert("비밀번호를 다시 입력하세요.");pw1.value="";pw1.focus();return false;}

 if(pw1.value != pw2.value){
  alert("비밀번호가 다릅니다.");pw2.value="";pw2.focus();return false;
 }

 if(emailcheck.test(email.value)){
 }else{
  alert("이메일 형식이 다릅니다.");email.value="";email.focus();return false;
 }

 for(var i=0;i<num1.value.length;i++){
  arrNum1[i]=num1.value.charAt(i); 

 }
 for(var i=0;i<num2.value.length;i++){
  arrNum2[i]=num2.value.charAt(i); 

 }

       var tempSum=0;

       for (var i=0; i<num1.value.length; i++) {
           tempSum += arrNum1[i] * (2+i);
       } 

       for (var i=0; i<num2.value.length-1; i++) {
           if(i>=2) {
               tempSum += arrNum2[i] * i;
           }
           else {
               tempSum += arrNum2[i] * (8+i);
           }
       }
       if((11-(tempSum%11))%10!=arrNum2[6]) {
           alert("올바른 주민번호가 아닙니다.");
           num1.value = "";
           num2.value = "";
           num1.focus();
           return false;
       }else if(arrNum2[6]==1||arrNum2[6]==2){
 join.year.value = 1900+parseInt(num1.value.substring(0,2));
 }else if(arrNum2[6]==3||arrNum2[6]==4){
 join.year.value = 2000+parseInt(num1.value.substring(0,2));
 }

 join.month.options[num1.value.substring(2,4)-1].selected = true;
 join.day.options[num1.value.substring(4,6)-1].selected = true;

 if( join.inter[0].checked == false && join.inter[1].checked == false  && join.inter[2].checked == false  && join.inter[3].checked == false  && join.inter[4].checked == false  ){
  alert("취미를 고르세요"); return false;
 }

 
 if(join.intro.value == ""){
  alert("자기소개를 입력하세요."); join.intro.focus();return false; 
 }
 
      
      }

