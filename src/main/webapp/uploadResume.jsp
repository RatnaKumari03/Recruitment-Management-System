<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Resume</title>
</head>
<body>

<h2>Upload Resume</h2>

<form action="UploadResumeServlet" method="post"
      enctype="multipart/form-data">

    Select Resume (PDF):
    <input type="file" name="resume" required>

    <br><br>

    <input type="submit" value="Upload Resume">

</form>

<br>

<a href="dashboard.jsp">Back to Dashboard</a>

</body>
</html>