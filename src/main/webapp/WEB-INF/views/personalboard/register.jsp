<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/header.jsp"%>

<%--<link rel="stylesheet" href="/resources/assets/css/soft-ui-dashboard.css">--%>

<style>
  .container
</style>

<section class="ftco-section contact-section ftco-degree-bg">
  <div class="container bg-light">
    <div class="row d-flex mb-5 contact-info">
      <div class="col-md-12 mb-4">
        <h2 class="h4">Contact Information</h2>
      </div>
      <div class="w-100"></div>
      <div class="col-md-3">
        <p><span>Address:</span> 198 West 21th Street, Suite 721 New York NY 10016</p>
      </div>
      <div class="col-md-3">
        <p><span>Phone:</span> <a href="tel://1234567920">+ 1235 2355 98</a></p>
      </div>
      <div class="col-md-3">
        <p><span>Email:</span> <a href="mailto:info@yoursite.com">info@yoursite.com</a></p>
      </div>
      <div class="col-md-3">
        <p><span>Website</span> <a href="#">yoursite.com</a></p>
      </div>
    </div>
    <div class="row block-9">
      <div class="col-md-12 pr-md-5">
        <form action="#">
          <div class="form-group">
            <input type="text" class="form-control" placeholder="Your Name">
          </div>
          <div class="form-group">
            <input type="text" class="form-control" placeholder="Your Email">
          </div>
          <div class="form-group">
            <input type="text" class="form-control" placeholder="Subject">
          </div>
          <div class="form-group">
            <textarea name="" id="" cols="30" rows="7" class="form-control" placeholder="Message"></textarea>
          </div>
          <div class="form-group">
            <input type="submit" value="Send Message" class="btn btn-primary py-3 px-5">
          </div>
        </form>

      </div>

    </div>
  </div>
</section>

<!-- File Upload -->

<link rel="stylesheet" href="/resources/upload/css/css.css">
<link rel="stylesheet" href="/resources/upload/js/js.js">

<div id="root">
  <h2 class="title">File Upload</h2>
  <hr>
  <div class="contents">
    <div class="upload-box">
      <div id="drop-file" class="drag-file">
        <img src="https://img.icons8.com/pastel-glyph/2x/image-file.png" alt="파일 아이콘" class="image">
        <p class="message">Drag files to upload</p>
      </div>
      <label class="file-label" for="chooseFile">Choose File</label>
      <input class="file" id="chooseFile" type="file" multiple onchange="dropFile.handleFiles(this.files)">
    </div>
    <div id="files" class="files">
      <div class="file">
        <div class="thumbnail">
          <img src="https://img.icons8.com/pastel-glyph/2x/image-file.png" alt="파일타입 이미지" class="image">
        </div>
        <div class="details">
          <header class="header">
            <span class="name">Photo.png</span>
            <span class="size">7.5 mb</span>
          </header>
          <div class="progress">
            <div class="bar"></div>
          </div>
          <div class="status">
            <span class="percent">37% done</span>
            <span class="speed">90KB/sec</span>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>

<%@include file="../includes/footer.jsp"%>

  </body>
</html>