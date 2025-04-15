# 💬 ChatterBox - Real-Time Chat Application

**ChatterBox** is a sleek and responsive real-time chat application built using **Java Spring Boot**, **WebSockets**, **STOMP**, and **SockJS**. It allows users to connect instantly, send messages in real-time, and experience seamless two-way communication via a modern dark-mode UI.

---

## 🚀 Features

- ⚡ **Real-time Messaging** – Instant chat using WebSocket technology.
- 🔗 **WebSocket + STOMP** – Efficient messaging protocol and fallback support.
- 🎨 **Responsive UI** – Clean, dark-mode frontend using Bootstrap 5.
- 🧠 **Spring Boot Backend** – Simple, modular, and fast.
- 🛡️ **CORS Configured** – Localhost frontend connection enabled.

---

## 🛠️ Tech Stack

| Layer     | Technology                  |
|-----------|-----------------------------|
| Backend   | Java, Spring Boot, STOMP    |
| WebSocket | Spring Messaging, SockJS    |
| Frontend  | HTML5, JavaScript, Bootstrap|
| Build     | Maven                       |

---

## 📸 UI Preview

_![Screenshot 2025-04-15 153628](https://github.com/user-attachments/assets/cd144caa-8ce0-443b-b0cd-31e3628645d8)_


---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/com/chat/app/
│   │   ├── config/            # WebSocket configuration
│   │   ├── controller/        # Message controller
│   │   ├── model/             # ChatMessage model
│   │   └── ChatAppApplication.java
│   └── resources/
│       ├── templates/chat.html       # Frontend UI
│       └── application.properties    # Spring configs
```


---

## 🚀 Getting Started

### 1️⃣ Prerequisites

- Java 17+
- Maven
- Git

### 2️⃣ Clone the Repository

```bash
git clone https://github.com/Ronak206/ChatterBox.git
cd ChatterBox
```

### 3️⃣ Run the Application

```bash
./mvnw spring-boot:run
```

### 4️⃣ Access the Chat UI

Open your browser and go to:
``` http://localhost:8080/chat```

---

##  📄 LICENSE
MIT License

Copyright (c) 2025 Ronak Rathod

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights  
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell      
copies of the Software, and to permit persons to whom the Software is          
furnished to do so, subject to the following conditions:                       

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.                                

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR     
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,       
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE    
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER         
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  
SOFTWARE.

---

###  🤝 Contributing
Contributions are always welcome! Feel free to fork the project, make your changes, and submit a pull request.

---

### 🧑‍💻 Author
Ronak Rathod
👨‍🎓 B.Tech Computer Engineering | CSI Jr. Associate
