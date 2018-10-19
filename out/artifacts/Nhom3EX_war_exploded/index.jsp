
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Hệ chuyên gia</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    <link rel="stylesheet" type="text/css" href="bootstrap.min.css">
</head>
<body>
<div id="form-main" class="bg-light">
    <div>
        <h1>Chọn cấu hình máy tính</h1>
    </div>
    <form id="form" action="/handle">
        <div id="form-type" class="form-sub border border-info">
            <h3>Hãng máy tính</h3>
            <div class="input-al">
                <input type="radio" name="type" value="Dell"> Dell<br>
                <input type="radio" name="type" value="Asus"> Asus<br>
                <input type="radio" name="type" value="HP"> HP<br>
            </div>
            <div class="button-al">
                <a href="#form-color" class="btn btn-primary">Next</a>
            </div>
        </div>
        <div id="form-color" class="form-sub border border-info">
            <h3>Màu sắc</h3>
            <div class="input-al">
                <input type="radio" name="color" value="Black"> Màu Đen<br>
                <input type="radio" name="color" value="Grey"> Màu Xám<br>
                <input type="radio" name="color" value="Silver"> Màu Bạc<br>
            </div>
            <div class="button-al">
                <a href="#form-type" class="btn btn-link">Back</a>
                <a href="#form-price" class="btn btn-primary">Next</a>
            </div>
        </div>
        <div id="form-price" class="form-sub border border-info">
            <h3>Khoảng giá</h3>
            <div class="input-al">
                <input type="radio" name="price" value="5-10"> 5-10 Triệu<br>
                <input type="radio" name="price" value="10-15"> 10-15 Triệu<br>
                <input type="radio" name="price" value="15-20"> 15-20 Triệu<br>
                <input type="radio" name="price" value=">20"> Lớn hơn 20 triệu<br>
            </div>
            <div class="button-al">
                <a href="#form-color" class="btn btn-link">Back</a>
                <a href="#form-CPU" class="btn btn-primary">Next</a>
            </div>
        </div>
        <div id="form-CPU" class="form-sub border border-info">
            <h3>CPU</h3>
            <div class="input-al">
                <input type="radio" name="cpu" value="i3">Core i3<br>
                <input type="radio" name="cpu" value="i5">Core i5<br>
                <input type="radio" name="cpu" value="i7">Core i7<br>
            </div>
            <div class="button-al">
                <a href="#form-price" class="btn btn-link">Back</a>
                <a href="#form-RAM" class="btn btn-primary">Next</a>
            </div>
        </div>
        <div id="form-RAM" class="form-sub border border-info">
            <h3>RAM</h3>
            <div class="input-al">
                <input type="radio" name="ram" value="2"> 2GB<br>
                <input type="radio" name="ram" value="4"> 4GB<br>
                <input type="radio" name="ram" value="8"> 8GB<br>
                <input type="radio" name="ram" value="16"> 16GB<br>
            </div>
            <div class="button-al">
                <a href="#form-CPU" class="btn btn-link">Back</a>
                <a href="#form-Graphics" class="btn btn-primary">Next</a>
            </div>
        </div>
        <div id="form-Graphics" class="form-sub border border-info">
            <h3>Lựa chọn card màn hình</h3>
            <div class="input-al">
                <input type="radio" name="graphic" value="Nvidia"> Nvidia<br>
                <input type="radio" name="graphic" value="AMD"> AMD<br>
            </div>
            <div class="button-al">
                <a href="#form-RAM" class="btn btn-link">Back</a>
                <a href="#form-Storage" class="btn btn-primary">Next</a>
            </div>
        </div>
        <div id="form-Storage" class="form-sub border border-info">
            <h4>Loại ổ đĩa</h4>
            <div class="input-al">
                <input type="radio" name="storage" value="SSD"> SSD<br>
                <input type="radio" name="storage" value="HDD"> HDD<br>
            </div>
            <div class="button-al">
                <a href="#form-Graphics" class="btn btn-link">Back</a>
                <a href="#form-Battery" class="btn btn-primary">Next</a>
            </div>
        </div> border border-info
        <div id="form-Battery" class="form-sub border border-info">
            <h4>Số Cell của pin</h4>
            <div class="input-al">
                <input type="radio" name="battery" value="4"> 4cell<br>
                <input type="radio" name="battery" value="6"> 6cell<br>
                <input type="radio" name="battery" value="8"> 8cell<br>
            </div>
            <div class="button-al">
                <a href="#form-Storage" class="btn btn-link">Back</a>
                <a href="#form-display" class="btn btn-primary">Next</a>
            </div>
        </div>
        <div id="form-display" class="form-sub border border-info">
            <h4>Kích thước màn hình</h4>
            <div class="input-al">
                <input type="radio" name="display" value="13"> 13inch<br>
                <input type="radio" name="display" value="14"> 14inch<br>
                <input type="radio" name="display" value="15"> 15inch<br>
            </div>
            <div class="button-al">
                <a href="#form-Battery" class="btn btn-primary">Back</a>
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>

    </form>

</div>
</body>
</html>