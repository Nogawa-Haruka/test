<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>BuyItemConfirm画面</title>
</head>

<body>
<div id="header"></div>
<div id="main">
	<div id="top">
		<p>BuyItemConfirm</p>
	</div>
	<div>
	<s:form action="BuyItemConfirmAction">
	<table>
		<tr>
			<td>商品名</td>
			<td>
				<s:property value="session_buyItem_name"/>
			</td>
		</tr>
		<tr>
			<td>購入個数</td>
			<td>
				<s:property value="session.stock"/>
				<span>個</span>
			</td>
		</tr>
		<tr>
			<td>支払い方法</td>
			<td>
				<s:property value="session.pay"/>
			</td>
		</tr>
		<tr>
			<td>
				<s:submit value="完了"/>
			</td>
		</tr>
	</table>
	</s:form>
	</div>
</div>
<div id="footer">
</div>
</body>
</html>