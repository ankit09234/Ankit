------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:




<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>YBL DND</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            padding: 40px;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        .container {
            max-width: 400px;
            margin: 0 auto;
            background: #fff;
            padding: 25px 30px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 8px;
        }

        input[type="number"] {
            width: 100%;
            padding: 10px;
            font-size: 16px;
        }

        .error {
            color: red;
            font-size: 14px;
            margin-top: 5px;
        }

        .radio-group {
            display: none;
            margin-top: 20px;
        }

        .radio-option {
            margin: 10px 0;
        }

        button {
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
        }

        .submit-btn {
            display: none;
            margin-top: 20px;
        }
    </style>
</head>
<body>

<h2>YBL DND</h2>

<div class="container">
    <div class="form-group">
        <label for="appNumber">Application Number:</label>
        <input type="number" id="appNumber" name="appNumber" maxlength="13" />
        <div class="error" id="appError"></div>
    </div>

    <button id="nextBtn">Next</button>

    <div class="radio-group" id="dndOptions">
        <label>Select DND:</label>
        <div class="radio-option">
            <input type="radio" id="dndYes" name="dnd" value="yes">
            <label for="dndYes">Yes</label>
        </div>
        <div class="radio-option">
            <input type="radio" id="dndNo" name="dnd" value="no">
            <label for="dndNo">No</label>
        </div>
    </div>

    <button class="submit-btn" id="submitBtn">Submit</button>
</div>

<script>
    document.getElementById("nextBtn").addEventListener("click", function () {
        const appInput = document.getElementById("appNumber").value.trim();
        const errorDiv = document.getElementById("appError");

        if (appInput.length !== 13 || isNaN(appInput)) {
            errorDiv.textContent = "Please enter a correct 13-digit application number.";
            return;
        }

        errorDiv.textContent = "";
        document.getElementById("dndOptions").style.display = "block";
        document.getElementById("submitBtn").style.display = "block";
    });

    document.getElementById("submitBtn").addEventListener("click", function () {
        const selected = document.querySelector('input[name="dnd"]:checked');
        if (!selected) {
            alert("Please select a DND option before submitting.");
            return;
        }

        // You can replace this with your backend form submission logic
        alert("Application Submitted with DND = " + selected.value.toUpperCase());
    });
</script>

</body>
</html>
