$(function(){

    $('#addrole').click(function(){

        var rolename = $('#rolename').val();
        var rolemessage = $('#rolemessage').val();
        var rolepower = ['N','N','N','N'];
            $("input[name='user-Character-0-0-0']:checked").each(function(i){
                rolepower[i] = 'Y';
            });

        if(rolename==''||rolemessage==''){
            layer.msg('信息不能为空');
        }else{
            var roleData = {
                rolename:rolename,
                rolemessage:rolemessage,
                rolepower:rolepower
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