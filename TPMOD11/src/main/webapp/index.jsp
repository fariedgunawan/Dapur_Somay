<%-- 
    Document   : index
    Created on : 24 Nov 2024, 17.57.30
    Author     : farie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TP_MOD_11</title>
      <style>
            body {
              margin: 0;
              font-family: Arial, sans-serif;
              display: flex;
              flex-direction: column;
              min-height: 100vh;
            }

            .navbar {
              display: flex;
              justify-content: space-between;
              align-items: center;
              background-color: #1d81e5;
              padding: 30px 20px;
              color: white;
              box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            }

            .navbar h2 {
              margin: 0;
              font-size: 20px;
            }

            .container {
              display: flex;
              flex-direction: row;
              padding: 20px;
              gap: 20px;
              flex-wrap: wrap;
              flex-grow: 1;
            }

            .container img {
              width: 500px;
              border-radius: 8px;
              box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
              object-fit: cover;
            }

            .tabs {
              display: flex;
              flex-direction: column;
              align-items: flex-start;
              max-width: 300px;
              gap: 10px;
            }

            .tabs button {
              margin-bottom: 10px;
              padding: 10px 20px;
              font-size: 16px;
              cursor: pointer;
              border: none;
              border-radius: 5px;
              background-color: #1d81e5;
              color: white;
              box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            }

            .tabs button.active {
              background-color: #155ca6;
            }

            .tab-content {
              margin-top: 20px;
              font-size: 16px;
              color: #333;
              padding: 10px;
              background-color: #f9f9f9;
              border: 1px solid #ddd;
              border-radius: 5px;
              box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
              width: 100%;
            }

            .hidden {
              display: none;
            }

            .input-container {
              display: flex;
              align-items: center;
              gap: 10px;
            }

            .input-container input[type="text"] {
              flex: 1;
              padding: 10px 15px;
              font-size: 16px;
              border: 1px solid #ddd;
              border-radius: 5px;
              outline: none;
              box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
              transition: border 0.3s ease;
            }

            .input-container input[type="text"]:focus {
              border-color: #1d81e5;
            }

            .input-container button {
              padding: 10px 20px;
              font-size: 16px;
              color: white;
              background-color: #1d81e5;
              border: none;
              border-radius: 5px;
              cursor: pointer;
              box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
              transition: background-color 0.3s ease;
              margin-top: 10px;
            }

            .input-container button:hover {
              background-color: #155ca6;
            }
            
             @media (max-width: 768px) {
             .container {
               flex-direction: column;
               align-items: center;
             }

             .container img {
               width: 100%;
             }
             

            .tabs {
              width: 100%;
              max-width: 500px;
            }
          }
          
          @media (max-width: 480px) {
            .navbar {
              flex-direction: column;
              text-align: center;
            }

            .tabs button {
              font-size: 14px;
              padding: 8px 16px;
            }

            .input-container input[type="text"] {
              font-size: 14px;
            }

            .input-container button {
              font-size: 14px;
              padding: 8px 16px;
            }
          }
          
          .footer {
            text-align: center;
            background-color: #1d81e5;
            color: white;
            padding: 15px 0;
            margin-top: auto;
            box-shadow: 0 -4px 6px rgba(0, 0, 0, 0.1);
            font-size: 14px;
          }
      </style>
    </head>
    <body>
        <div class="navbar">
      <h2>Telkom University</h2>
      <h2>Tp_Mod11</h2>
    </div>
    <div class="container">
      <img src="https://images.unsplash.com/photo-1541539924877-6dc3d2adf8d3?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" 
           alt="Beautiful Landscape" />
      <div class="tabs">
        <div>
          <button class="tab-button active" onclick="showTab('tab1')">Tab 1</button>
          <button class="tab-button" onclick="showTab('tab2')">Tab 2</button>
        </div>
        <div>
          <div class="tab-content" id="tab1">
            <div class="input-container">
              <input type="text" placeholder="Enter your text here tab 1" />
              <button>Send</button>
            </div>
          </div>
          <div class="tab-content hidden" id="tab2">
            <div class="input-container">
              <input type="text" placeholder="Enter your text here tab 2" />
              <button>Send</button>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="footer">
      <p>&copy; 2024 Telkom University. All Rights Reserved.</p>
    </div>

    <script>
      function showTab(tabId) {
        const contents = document.querySelectorAll(".tab-content");
        contents.forEach((content) => content.classList.add("hidden"));

        const buttons = document.querySelectorAll(".tab-button");
        buttons.forEach((button) => button.classList.remove("active"));

        document.getElementById(tabId).classList.remove("hidden");
        document.querySelector(`button[onclick="showTab('${tabId}')"]`).classList.add("active");
      }
    </script>
    </body>
</html>
