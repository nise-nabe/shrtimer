<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="../css/smoothness/jquery-ui-1.8.14.custom.css"/>
<style type="text/css">
body {
	font-size:9px;
}

.numbox {
	width:40;
	text-align:right;
	color:#999;
}

.titlebox {
	width:100;
	color:#999;
}

.datebox {
	width:70;
}

.timebox {
	width:40;
}

.config {
	width:350;
	border-width:2px;
	border-style:solid;
	padding:2px;
	margin:2px;
}

</style>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">
google.load("jquery", "1");
google.load("jqueryui", "1");

google.setOnLoadCallback(function() {
	$(document).ready(function() {
		$(".config").draggable({
			opacity : 0.4
		});
		$(".numbox,.titlebox").focus(function(){
			var $this = $(this);
			if($this.val() == this.defaultValue){
				$this.css("color", "#000").val("");
			}
		}).blur(function() {
			var $this = $(this);
			if($.trim($this.val()) == ""){
				$this.css("color", "#999").val(this.defaultValue);
			}
		});
		var now = new Date();
		$(".datebox").val($.datepicker.formatDate("yy/mm/dd", now));
		$(".datebox").datepicker({
			dateFormat : "yy/mm/dd"
		}); // ﾋﾟｯｶｰ!
		$(".timebox").val((now.getHours()+100+"").substring(1) + ":" + (now.getMinutes()+100+"").substring(1));
		
		$(".startbutton").click(function(){
			var form = $(this).parent();
			
			var divname = "capsule_div";
			var timename = "capsule_time";
			var dom = '<div id="'+divname+'" class="capsule">';
			dom += '<p id="'+timename+'">まどかーっ</p>';
			dom += '</div>';
			console.log(dom);
			$("#inner").append(dom);
			
			$("#capsule_div").draggable({
				opacity : 0.4
			});
//			console.log(form);
		});
	});
});
</script>

<title>Sharable Timer</title>
</head>
<body>
<div id="inner">

<div id="timer_div" class="config">
<form id="timer_form">
<input type="text" name="day" class="numbox" value="day" />
<input type="text" name="hour" class="numbox" value="hour" />
<input type="text" name="minute" class="numbox" value="min" />
<input type="text" name="second" class="numbox" value="sec" />
<input type="text" name="title" class="titlebox" value="title" />
<input type="button" value="start" class="startbutton"/>
</form>
</div>

<div id="countdown_div" class="config">
<form id="countdown_form">
<input type="text" name="deaddate" class="datebox" value="" />
<input type="text" name="deadtime" class="timebox" value="" />
<input type="text" name="title" class="titlebox" value="title" />
<input type="button" value="start" class="startbutton" />
</form>
</div>

<div id="stopwatch_div" class="config">
<form id="stopwatch_form">
<input type="text" name="title" class="titlebox" value="title" />
<input type="button" value="start" class="startbutton" />
</form>
</div>

</div>
<p>すごいよほむらちゃん！</p>
</body>
</html>
