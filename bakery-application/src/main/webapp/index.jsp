<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bakery page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="style.css">
</head>

<body>

    <nav class="navbar navbar-expand-lg text-bg-info p-3">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Bakery</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                            aria-expanded="false">
                            Dropdown
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#">Action</a></li>
                            <li><a class="dropdown-item" href="#">Another action</a></li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="#">Something else here</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                    </li>
                </ul>
                <div class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </div>
            </div>
        </div>
    </nav>

    <form class="form" action="bake" method="post">
        <div class="info">Bakery information</div>
        <div class="row">
            <div class="col">
                <input type="text" class="form-control" name="item" placeholder="Item name" aria-label="Item name">
            </div>
            <div class="col">
                <input type="number" class="form-control" name="price" placeholder="Item price"
                    aria-label="Item price">
            </div>
        </div>

        <div class="row">
            <div class="col">
                <!-- <input type="text" class="form-control" placeholder="Item name" aria-label="Item name"> -->
                <select name="quantity" id="">
                    <option value="">--select quantity--</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                </select>
            </div>
            <div class="col">
                <!-- <input type="number" class="form-control" placeholder="Item price" aria-label="Item price"> -->
                <select name="discount" id="">
                    <option value="">--select discount--</option>
                    <option value="5">5</option>
                    <option value="10">10</option>
                    <option value="15">15</option>
                    <option value="20">20</option>
                    <option value="25">25</option>
                    <option value="50">50</option>
                </select>
            </div>
        </div>

        <div class="row">
            <div class="col">
                <input type="text" class="form-control" name="gst" placeholder="GST number" aria-label="gst number">
            </div>
            <div class="col">
                <input type="text" class="form-control" name="name" placeholder="Shop name" aria-label="shop name">
            </div>
        </div>

        <div class="row">
            <div class="col">
                <input type="date" class="form-control" name="manuDate" placeholder="date" aria-label="date">
            </div>
            <div class="col">
                <input type="date" class="form-control" name="expDate" placeholder="date" aria-label="date">
            </div>
        </div>

        <div class="d-grid gap-2">
            <button class="btn btn-primary" type="submit">Submit</button>
        </div>
    </form>
</body>

</html>