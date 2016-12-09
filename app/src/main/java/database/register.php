<?php
    $con = mysqli_connect("turtlefrown.000webhost.com", "id168357_rmv", "password", "id168357_register");
    
    $firstname = $_POST["firstname"];
    $lastname = $_POST["lastname"];
    $location = $_POST["location"];
    $email = $_POST["email"];
    $password = $_POST["password"];
    $statement = mysqli_prepare($con, "INSERT INTO user (firstname, lastname, location, email, password) VALUES (?, ?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "siss", $firstname, $lastname, $location, $email, $password);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>