$(function(){

    $('#addrole').click(function(){

        var rolename = $('#rolename').val();
        var rolemessage = $('#rolemessage').val();
        var addpower = 'N';
        var delpower = 'N';
        var updpower = 'N';
        var chepower = 'N';
        if($("#user-Character-0-0-0").is(":checked")){
            addpower = 'Y';
        }
        if($("#user-Character-0-0-1").is(":checked")){
            delpower = 'Y';
        }
        if($("#user-Character-0-0-2").is(":checked")){
            updpower = 'Y';
        }
        if($("#user-Character-0-0-3").is(":checked")){
            chepower = 'Y';
        }

        if(rolename==''||rolemessage==''){
            layer.msg('信息不能为空');
        }else{
            var roleData = {
                rolename:rolename,
                rolemessage:rolemessage,
                addpower:addpower,
                delpower:delpower,
                updpower:updpower,
                chepower:chepower
            }
            $.ajax({
                url: '/addrole',
                type: 'POST',
                dataType:'json',
                data:JSON.stringify(roleData),
                contentType: "application/json",
                traditional:true,
                success:function(result){
                    if(result.status==1){
                        layer.msg(result.message);
                    }else{
                        layer.msg(result.message);
                    }

                },
                error:function(){
                    layer.msg('添加失败，请检查网络连接');
                }
            });
        }


    })

})