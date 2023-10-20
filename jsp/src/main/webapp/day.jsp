<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <header>
        <nav id="navbar">
            <div class="left">Santosh</div>
            <div class="right">
                <ul>
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="#">Days</a></li>
                </ul>
            </div>
        </nav>
    </header>
    
    <main>
        <div id="container">
            <h1>Days Information</h1>
            <form class="form" action="jsps" method="post">
                <div class="input-box">
                    <label for="name">Day</label>
                    <input type="text" name="day" placeholder="enter weapon name" required>
                </div>

                <div class="input-box">
                    <label for="price">Date</label>
                    <input type="text" name="date" placeholder="enter price" required>
                </div>

                <div class="input-box">
                    <label for="month">Month</label>
                    <select name="month" id="" class="input-box">
                        <option name="">Select option</option>
                        <option name="January">January</option>
                        <option name="Russia">Febrary</option>
                        <option name="America">March</option>
                        <option name="Japan">April</option>
                    </select>
                </div>

                <div class="input-box">
                    <label for="crop">Year</label>
                    <input type="number" name="year" />
                </div>


                <button type="submit">Submit</button>
            </form>
        </div>
    </main>
</body>
</html>