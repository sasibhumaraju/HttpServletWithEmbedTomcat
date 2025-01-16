# HttpServlet With Embed Tomcat Project

## Overview

This project is a simple Java web application using embedded Tomcat. It includes a servlet that responds with a plain text message. The project is set up to be built and run using Visual Studio Code.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Tomcat
- Visual Studio Code with Java extensions

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/BlogBackend.git
    cd BlogBackend
    ```

2. Open the project in Visual Studio Code:
    ```sh
    code .
    ```

3. Build the project:
    - Open the command palette (Ctrl+Shift+P) and select `Java: Compile Workspace`.

4. Run the project:
    - Open the command palette (Ctrl+Shift+P) and select `Java: Run`.

## Folder Structure

The workspace contains the following folders:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies
- `bin`: the folder to maintain compiled output files

## File Structure

```
/c:/test/java/Blog/BlogBackend/
├── src/
│   ├── servlets/
│   │   └── HelloServlet.java
│   └── App.java
├── webapp/
│   └── WEB-INF/
│       └── web.xml
├── .vscode/
│   └── settings.json
├── bin/
│   ├── servlets/
│   │   └── HelloServlet.class
│   └── App.class
```

## Dependencies

The project uses the following dependencies:

- `tomcat-embed-core-9.0.50` — for embedded Tomcat server.
- `tomcat-embed-jasper-9.0.50` — for resolving JSPs to run in Tomcat server.
- `javax.servlet-api-4.0.1` — for creating HttpServlet.
- `javax.annotation-api-1.3.2` — for HttpServlet related annotations if any.

## Running the Application

1. Start the Tomcat server:
    - The server will start on `http://localhost:8080`.

2. Access the servlet:
    - Open a web browser and navigate to `http://localhost:8080/api/hello`.

## Dependency Management

The `JAVA PROJECTS` view in Visual Studio Code allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Contact

Your Name - [@sasibhumaraju](https://x.com/sasibhumaraju) - your_email@example.com


