package com.STIW3054.A191.Ckjm;

import java.net.URL;

class CkjmPath {
    static String getPath(){
        URL location = CkjmPath.class.getProtectionDomain().getCodeSource().getLocation();
        return location.getFile().substring(1).replace("target/classes/","ckjm-1.9.jar");
    }
}