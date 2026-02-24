# 🌐 URL-to-Website Request Flow Simulation

A Java-based simulation project that demonstrates the complete lifecycle of a URL request — from entering a URL in the browser to rendering the webpage.

---

## 📌 Overview

This project simulates how the internet works internally when a user types a URL.

It includes:

- URL Parsing
- DNS Resolution
- TCP 3-Way Handshake
- TLS Handshake (HTTPS)
- Reverse Proxy Handling
- Web Server Processing
- HTTP Request & Response Flow
- Browser Rendering Simulation

---

## 🏗 System Architecture

![URL Flow Diagram](uml/sequence-diagram.png)

The system follows this request flow:

User → Browser → DNS → TCP → TLS → Reverse Proxy → Web Server → Response → Browser Render

---

## 📂 Project Structure
url-flow-simulation/
├── src/
│ ├── components/
│ ├── models/
│ └── Main.java
├── uml/
│ └── sequence-diagram.puml
└── README.md


---

## 🚀 How to Run

1. Clone the repository
git clone https://github.com/Nandan0198/url-flow-simulation.git


2. Open in IntelliJ IDEA
3. Run `Main.java`

---

## 🔐 HTTP vs HTTPS

| Feature | HTTP | HTTPS |
|----------|-------|--------|
| Port | 80 | 443 |
| Encryption | ❌ No | ✅ Yes |
| TLS Handshake | ❌ | ✅ |

---

## 🎯 Learning Outcomes

- Understand DNS resolution
- Understand TCP/IP handshake
- Understand TLS encryption
- Learn Reverse Proxy concept
- Learn Web Architecture design
- Practice System Design basics

---

## 👨‍💻 Author

**Nandan Kumar**  
B.Tech IT | System Design Enthusiast
