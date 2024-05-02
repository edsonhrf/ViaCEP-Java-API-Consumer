# ViaCEP-Java-API-Consumer
This repository contains a Java client for interacting with the ViaCEP API, which provides access to Brazilian postal code data. With this client, you can easily retrieve address information based on postal codes, enabling seamless integration of CEP (Código de Endereçamento Postal) functionality into your Java applications.

# Java ViaCEP API Client

[![Java](https://img.shields.io/badge/Java-17-orange)](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)

## Overview

This Java library provides a client for interacting with the ViaCEP API, which offers access to Brazilian postal code (CEP) data. It allows you to retrieve detailed address information based on postal codes, facilitating integration of CEP functionality into your Java applications.

## Features

- Retrieve address information by postal code
- Support for both synchronous and asynchronous API calls
- Error handling for invalid requests or server errors
- Lightweight and easy to integrate into existing Java projects

## Usage

### Installation

You can include this library in your Java project using Maven or Gradle.

Maven:
```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>viacep-java-api</artifactId>
    <version>1.0.0</version>
</dependency>
```

Gradle:
```implementation 'com.example:viacep-java-api:1.0.0'```

### Example
Here's a simple example demonstrating how to use the library to retrieve address information:

```
import com.example.viacep.ViaCEPClient;
import com.example.viacep.model.ViaCEPAddress;

public class Main {
    public static void main(String[] args) {
        ViaCEPClient client = new ViaCEPClient();

        try {
            ViaCEPAddress address = client.getAddressByCEP("01001000");
            System.out.println(address.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```


