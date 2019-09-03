package com.tecsup.lab01.controller;
import com.tecsup.lab01.model.*;

public class UserController {
User f = new User();

public void nombre_completo(){
System.out.println("Nombre : "+f.nombre + " " + f.apellido_pat);
System.out.println("Edad: "+ f.edad);
}
}