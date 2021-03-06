/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.helloworld;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * A simple CDI service which is able to say hello to someone
 *
 * @author Pete Muir
 *
 */
public class HelloService {

    String createHelloMessage(String name) {
        return "Hello " + name + "!";
    }

    //String createIPMessage(String ip) {
    //    return "MY BIND ADDRESS is: " + System.getProperty("jboss.bind.address") ;
    //}
    
    String createIPMessage(String ip) throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        //Getting IPAddress of localhost - getHostAddress return IP Address
        // in textual format
        String ipAddress = addr.getHostAddress();
        //return ipAddress;
        return "My container IP-ADDR is: " + ipAddress ;
    }
    
    String createPROPONEMessage(String valor1) {
        return "My Property one is: " + System.getProperty("valor1") ;
    }
    String createPROPTWOMessage(String valor2) {
        return "My Property two is: " + System.getProperty("valor2") ;
    }
    String createPROPTHREEMessage(String ambiente) {
        return "My Property three is: " + System.getProperty("ambiente") ;
    }
    
}
