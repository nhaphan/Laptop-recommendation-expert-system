
<html>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <link rel="stylesheet" href="bootstrap.min.css">
  <head>
    <title>Kết quả </title>
  </head>
  <body>

  <div class="container">
    <c:forEach items="${computers}" var="computer">
      <div class="row">
          <div class="col-md-6">
            <img height=50px; class="img-fluid img-thumbnail" src="image/${computer.image}"></div>
          <div class="col-md-6">
            <div class="row">
              <div class="col-md-6">Tên máy tính: </div>
              <div class="col-md-6">${computer.name}</div>
            </div>
            <div class="row">
              <div class="col-md-6">Hãng sản xuất:</div>
              <div class="col-md-6">${computer.kind}</div>
            </div>
            <div class="row">
              <div class="col-md-6">Màu sắc:</div>
              <div class="col-md-6">${computer.color}</div>
            </div>
            <div class="row">
              <div class="col-md-6">Giá tiền:</div>
              <div class="col-md-6">${computer.price}. đồng</div>
            </div>

            <div class="row">
              <div class="col-md-6">Loại CPU:</div>
              <div class="col-md-6">Core ${computer.cpu}</div>
            </div>

            <div class="row">
              <div class="col-md-6">Dung lượng bộ nhớ RAM:</div>
              <div class="col-md-6">${computer.ram} GB</div>
            </div>

            <div class="row">
              <div class="col-md-6">Card đồ họa:</div>
              <div class="col-md-6">${computer.graphicCard} inch</div>
            </div>

            <div class="row">
              <div class="col-md-6">Ổ cứng:</div>
              <div class="col-md-6">${computer.memory}</div>
            </div>

            <div class="row">
              <div class="col-md-6">Battery:</div>
              <div class="col-md-6">${computer.pin} Cell</div>
            </div>

            <div class="row">
              <div class="col-md-6">Kích thước màn hình:</div>
              <div class="col-md-6">${computer.screen}</div>
          </div>
        </div>
      </div>
    </c:forEach>
  </div>
  </body>
</html>
