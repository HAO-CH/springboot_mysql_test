//公共的提示框
function msg(data,time){
	var myDialog = dialog({
		content:data
	});
	myDialog.show();
	setTimeout(function(){
		myDialog.close();
	},time)
}

//根据路径获取form表单
//ajax 三种方法
function getContentByurl(url){
	var content = "";
	$.ajax({
		url:url,
		type:"post",
		dataType:"html",
		data:{},
		async:false,//同步
		success:function(result){
			content = result;
		},
		error:function(){
			msg("系统错误，请联系邵逸夫",3000);
		}
	});
	return content;
}