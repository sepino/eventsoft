<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../fragments/head.jspf" %>

<body class="hold-transition register-page">
<div class="">

    <!-- Main content -->
    <section class="content">

        <div class="error-page">

            <h1 class="headline text-red"><c:out value="${errorCode}"></c:out></h1>
            <div class="error-content">
                <h2><i class="fa fa-warning text-red"></i>Oooops!</h2>
                <h3>
                    <c:out value="${errorMsg}"></c:out>
                </h3>
            </div>
        </div>
        <!-- /.error-page -->

    </section>
    <!-- /.content -->
</div>

</body>
</html>