<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="window">
<div class="left">
<iframe src="https://www.youtube.com/embed/9mBhWQ-_iqM" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</div>
<div id="right">
 <p id="p1">詞・作曲／宇崎竜童<br>
男子衆(おとこし)　女子衆(おなごし)　プーヤレにせかされ　（どうてて　こうてて　Dancing in the street）<br>
テンヤワンヤだよ　くり出す　あの娘は　（どがいも　こがいも　 I don't know what to do）<br>
　牛鬼かついで　（Warei Warei）<br>
　太鼓にうかれて　（Warei Warei）　Ha!<br>
　　Gaiya!Ha!<br>
商売繁盛　五穀豊穣　(行てみなはったか Going to the 神社）<br>
Mama & Daddy Brothers & Sisters<br>
（そうてて　ええてて　Honkytonk tonight）<br>
 <br>
※（Gaiya Gaiya Gaiya Gaiya Gaiya）<br>
　Everybody dance to the （Hippi hippi Shake）<br>
　（Gaiya Gaiya Gaiya Gaiya Gaiya）<br>
　Do it, Say it,Everybody can't stop<br>
　（Gaiya Gaiya Gaiya Gaiya Gaiya）<br>
　Everybody dance to the （Hippi hippi Shake）<br>
　（Gaiya Gaiya Gaiya Gaiya Gaiya）<br>
　Do it, Say it,Everybody can't stop<br>
 <br>
――───　間奏　―――──
 <br>
男子衆(おとこし)　女子衆(おなごし)　神輿が走れば　（どうてて　こうてて　Running on the road）<br>
もみ込み　寄り込み　チャツリ　横掛け　（牛もめかして　Fighting in the ring）<br>
　牛鬼かついで　（Warei Warei）<br>
　太鼓にうかれて　（Warei Warei）　Ha!<br>
 <br>
※２回くりかえし</p>
<input type="button" value="歌詞" onclick="clickBtn1()" />

<script>
//初期表示は非表示
document.getElementById("p1").style.display ="none";

function clickBtn1(){
	const p1 = document.getElementById("p1");

	if(p1.style.display=="block"){
		// noneで非表示
		p1.style.display ="none";
	}else{
		// blockで表示
		p1.style.display ="block";
	}
}
</script>
</div>
</div>
</body>
</html>