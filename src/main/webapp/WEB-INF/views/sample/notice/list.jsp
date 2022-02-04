<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html>
<head>
 <!-- Bootstrap core JavaScript-->
    <!--  <script src="/resources/vendor/jquery/jquery.min.js"></script> -->
    <script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="/resources/js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="/resources/vendor/chart.js/Chart.min.js"></script>
	<script src="/resources/vendor/datatables/dataTables.bootstrap4.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="/resources/js/demo/chart-area-demo.js"></script>
    <script src="/resources/js/demo/chart-pie-demo.js"></script>

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

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">掲示板
					<button id='regBtn' type="button" class="btn btn-xs pull-right">Register</button> 
				</div>
				
				<div class="panel-body">
					<table class="table table-striped table-bordered table-hover">
						<thead>
							<tr>
								<th>#番号</th>
								<th>タイトル</th>
								<th>作成日</th>
								<th>修正日</th>
							</tr>
						</thead>
							
						<c:forEach items="${list}" var="notice">
							<tr>
								<td><c:out value="${notice.no}" /></td>
								<td><a class='move' href='<c:out value="${notice.no }"/>'>
								<c:out value="${notice.title}" /></a></td>
								<td><fmt:formatDate pattern="yyyy-MM-dd" value="${notice.created_at}" /></td>
								<td><fmt:formatDate pattern="yyyy-MM-dd" value="${notice.updated_at}" /></td>
							</tr>
						</c:forEach>
					</table>
					
					<div class='pull-right'>
						<ul class="pagination">
							<c:if test="${pageMaker.prev }">
								<li class="paginate_button previous"><a href="${pageMaker.startPage -1}">以前</a>
								</li>
							</c:if>
							<c:forEach var="num" begin="${pageMaker.startPage }"
								end="${pageMaker.endPage }">
								<li class="paginate_button ${pageMaker.cri.pageNum == num ? "active":""} ">
								<a href="${num}">${num}</a>
								</li>
							</c:forEach>
							
							<c:if test="${pageMaker.next }">
								<li class="paginate_button next"><a href="${pageMaker.endPage +1}">次</a>
								</li>
							</c:if>
						</ul>
					</div>
					
					<form id ='actionForm' action="/sample/notice/list" method='get'>
						<input type='hidden' name='pageNum' value = '${pageMaker.cri.pageNum}'>
						<input type='hidden' name='amount' value = '${pageMaker.cri.amount}'>
					</form>
					
					<!-- modal -->
					<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
					 aria-labelledby="myModalLabel" aria-hidden="true">
					 <div class="modal-dialog">
					 	<div class="modal-content">
					 		<div class="modal-header">
					 			<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					 			<h4 class="modal-title" id="myModalLabel">Modal title</h4>
					 		</div>
					 		<div class="modal-body">処理が完了しました。</div>
					 		<div class="modal-footer">
					 			<button type="button" class="btn btn-default">Close</button>
					 			<button type="button" class="btn btn-primary">Save changes</button>
					 		</div>
					 	</div>
					 </div>
				   </div>
				</div>
			</div>
		</div>
	</div>
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> 
	<script type="text/javascript">
$(document).ready(function(){
	
	
	$("#regBtn").on("click", function(){
		self.location ="/sample/notice/register";
	});
	
	var actionForm = $("#actionForm");
	
	$(".paginate_button a").on("click", function(e) {
		e.preventDefault();
		
		console.log('click');
		
		actionForm.find("input[name='pageNum']").val($(this).attr("href"));
		actionForm.submit(); 
	});
	
	$(".move").on("click", function(e){
		
		e.preventDefault();
		actionForm.append("<input type='hidden' name='no' value='"+
	$(this).attr("href")+"'>");
		actionForm.attr("action","/sample/notice/get");
		actionForm.submit();
		
	});
});
</script>
	
	

</body>
</html>
