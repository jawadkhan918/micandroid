<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="left_section">
	<ul>
		<li class="selected ie_f"><a href="/contact">Contacts</a></li>
		<li class="ie_s"><a href="/project">Projects</a></li>
		<li class="ie_t"><a href="/report">Reports</a></li>
	</ul>
</div>
<script>
$(function(){
	$(".left_section ul li").click(function(){
		_this = this ;
		$(".left_section ul li").removeClass("selected");
		$(_this).addClass("selected");
	});
	
});
</script>