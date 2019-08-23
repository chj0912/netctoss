



/**
 *登录
 **/

$(function () {
    alert($);
    //绑定登录按钮,绑定登录事件
    $(".login_button a").click(login);
    //实现回车登录
    $("body").keydown(function(event){
        var code=event.keyCode;
        if(code==13){
            login();//调用login函数
        }
    });

    function login() {
        var uname=$("#uname").val();
        var password=$("#pwd").val().trim();
        console.log(uname);
        console.log(password);
        //检查参数格式
        var check =true;//true检查通过，false未通过

        if(check){
            $.ajax({
                url: "http://localhost:8090/login.action",
                type: "POST",
                data: {"name":uname,"password":password},
                dataType: "JSON",
                contenttype:"application/json",
                success:function (data) {
                   // var status =data.status;
                    var status =0;
                    var msg=data.msg;
                    if(status=="1"){
                        alert(msg);
                    }
                    if(status=="0"){
                        var type=data.data.type;
                        //获取返回的用户id和token,存入Cookie
                        var userId=data.data.userId;
                        console(userId);
                        console(type);
                        //调用cookie_util.js函数写入cookie
                        addCookie("userId",userId,2);
                        if(type=="1"){
                            window.location.href="index.html";
                        }else {
                            window.location.href="login.html";
                        }
                    }
                },
                error:function () {
                    alert("登录发生异常");
                }

            });
        }
    }

});

