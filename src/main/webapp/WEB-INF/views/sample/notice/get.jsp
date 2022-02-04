<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Tables</title>

    <!-- Custom fonts for this template -->
    <link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/css/sb-admin-2.min.css" rel="stylesheet">

    <!-- Custom styles for this page -->
    <link href="/resources/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">


<title>Insert title here</title>
</head>
<body>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">登録</h1>
	</div>
</div>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
		<div class="panel-heading">掲示板疎開</div>
		<div class="panel-body">
			
				<div class="form-group">
					<label>No</label><input class="form-control" name='no'
							value='<c:out value="${notice.no }"/>'readonly="readonly">
						</div>
			
				<div class="form-group">
					<label>Title</label><input class="form-control" name="title"
							value='<c:out value="${notice.title }"/>'readonly="readonly">
						</div>
						
						<div class="form-group">
							<label>Contents</label>
							<textarea class="form-control" rows="3" name='contents'
							readonly="readonly"><c:out value="${notice.contents }"></c:out></textarea>	
						</div>
						
						<div class="form-group">
							<label>delete_flag</label><input class="form-control" name="delete_flag"
							value='<c:out value="${notice.delete_flag }"/>'readonly="readonly">
						</div>
						
						<div class="form-group">
							<label>Build Code</label><input class="form-control" name='build_code'
							value='<c:out value="${notice.build_code }"/>'readonly="readonly">
						</div>
						<button data-oper='modify' class="btn btn-default">修正</button>
						<button data-oper='list' class="btn btn-info">リスト</button>
				
						<form id='operForm' action="/sample/notice/modify" method="get">
							<input type='hidden' id='no' name='no' value='<c:out value="${notice.no }"/>'>
							<input type='hidden' name='pageNum' value='<c:out value="${cri.pageNum}"/>'>
							<input type='hidden' name='amount' value='<c:out value="${cri.amount}"/>'>
						</form>
				</div>
			</div>
		</div>	
	</div>
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>	
<script type="text/javascript">
	$(document).ready(function() {
		
		var operForm = $("#operForm");
		
		$("button[data-oper='modify']").on("click", function(e){
			
			operForm.attr("action","/sample/notice/modify").submit();
			
		});
		
		$("button[data-oper='list']").on("click", function(e){
			
			operForm.find("#no").remove();
			operForm.attr("action", "/sample/notice/list")
			operForm.submit();
		});
	});
	
</script>
	
	 <!-- Bootstrap core JavaScript-->
    <script src="/resources/vendor/jquery/jquery.min.js"></script>
    <script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="/resources/js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="/resources/vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="/resources/js/demo/chart-area-demo.js"></script>
    <script src="/resources/js/demo/chart-pie-demo.js"></script>
</body>
</html>