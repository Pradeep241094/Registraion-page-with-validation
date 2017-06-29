 function userValid()
 {
	 var uname=document.getElementsByName("user")[0].value;
	  var uMsg=document.getElementsByName("userMsg")[0];
	  
	  if(uname=="")
		  {
		 uMsg.innerHTML="enter user name";
		  }
	  else if (uname.length<=8)
		  {
		  uMsg.innerHTML="user name should be greater than 8 charecters";
		  }
	  else if(uname.length>=9)
		  {
		  uMsg.innerHTML="Valid username";
		 uMsg.style.color="green";
		  
		  }
	  
 }
function validate()
    {
        var pas=document.getElementsByName("pas")[0].value;
        var errmsg=document.getElementsByName("msg")[0];
  
   
    
    if(pas=="")
        {
            errmsg.innerHTML="enter password";
            errmsg.style.color="blue";
        }
    else if(pas.length<=4)
        {
            errmsg.innerHTML="weak password";
             errmsg.style.color="red";
        }
    else if(pas.length>5 && pas.length<=10)
        {
            errmsg.innerHTML="strong password";
             errmsg.style.color="green";
        }
    else if(pas.length>11)
        {
            errmsg.innerHTML="very strong";
            errmsg.style.color="black"
        }
    }
        function validateEmailId()
        {
            var user = document.getElementsByName("eid")[0].value
    var errmsg=document.getElementsByName("msg123")[0];
    var atpos = user.indexOf("@");
    var dotpos = user.lastIndexOf(".");
            if(user=="")
                {
                    errmsg.innerHTML="enter email-id";
                }
    else if (atpos<1 || dotpos<atpos+2 || dotpos+2>=user.length) {
        errmsg.innerHTML="Not a valid email id";
        return false;        }
   else{
        errmsg.innerHTML=" valid email-id";
        errmsg.style.color="green";
     }
       }
        function ValidateMobileNO()
        {
            var number=document.getElementsByName("mobno")[0].value
            var errmesg=document.getElementsByName("alertmsg")[0];
            if(number="" || number.length<10)
                {
                    errmesg.innerHTML="enter the valid mobile no"
                }
            else{
                errmesg.innerHTML="valid mobile no";
                errmesg.style.color="green";
            }
            
        }