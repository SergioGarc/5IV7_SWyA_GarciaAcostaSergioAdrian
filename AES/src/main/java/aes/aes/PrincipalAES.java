/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aes.aes;

/**
 *
 * @author alumno
 */
public class PrincipalAES {
public static void main(String[] args) throws Exception{
    String mensaje = "habia una vez un patrito que decia miau miau, y queria mimir todo el dia, pero ledejaban mucha tarea y queria matara un alumno enh particular,asi que empezo aplanear unascosasasi bien locas para dejar mas tareas a los alumnos, hasta queb ese alumno se petatee de las tareas y diga miau miau el patito y pueda dormir";
    String mensajecifrado = AES.cifrar(mensaje);
    String mensajedescifrado = AES.descifrar(mensajecifrado);
    
    System.out.println("Elmensaje original es:"+mensaje);
    System.out.println("Elmensaje original es:"+mensajecifrado);
    System.out.println("Elmensaje original es:"+mensajedescifrado);
}    
}
