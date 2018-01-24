$("#loginSubmit").click(function(){
    var $userName = $("#userName").val().trim();
    var $passWord = $("#passWord").val().trim();
    if($userName == "" || $userName == null){
        $("#msg").html("<font color='red'>用户名不能为空</font>");
    }
    if($passWord == "" || $passWord == null){
        $("#msg").html("<font color='red'>密码不能为空</font>");
    }
    $.ajax({
        cache: true,
        type: "POST",
        url:ajaxCallUrl,
        data:$('#loginForm').serialize(),// 你的formid
        async: false,
        dataType: json,
        error: function(request) {
            alert("Connection error");
        },
        success: function(data) {

        }
    });
});