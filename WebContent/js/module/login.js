function login(){
	var parameter={};
	parameter["username"]=$('#username').val();
	parameter["password"]=$('#password').val();
	$.ajax({
		async:false,
	    type:"POST",
	    url:"/testwebproject/login/getUser",
	   // url:"/testwebproject/login/",
	    data:parameter,
	    dataType:'json',
	    success:function(backValue){
	    	if(backValue.flag==0){
	    		window.location="/testwebproject"+backValue.path;
	    	}
	    },
	error:function(Msg){
		alert('asdf');
		
	}
		
	});
}