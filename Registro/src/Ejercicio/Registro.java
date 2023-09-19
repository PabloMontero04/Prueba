package Ejercicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Usuario> usuariosRegistrados = new ArrayList<>();
        boolean registrado = false;
        String nombre = "";
        String correo = "";
        String contraseña = "";

        while (true) {
            System.out.println("|__________Bienvenido al programa de registro___________|");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Registrarse");
            System.out.println("3. Mostrar usuarios registrados");
            System.out.println("4. Salir");
            System.out.print("Elije una opción (1/2/3/4): ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Por favor, introduce tu correo electrónico: ");
                    String correoInicio = scanner.nextLine();
                    System.out.print("Introduce tu contraseña: ");
                    String contraseñaInicio = scanner.nextLine();
                    Usuario usuario = buscarUsuario(correoInicio, contraseñaInicio, usuariosRegistrados);
                    if (usuario != null) {
                        System.out.println("¡Bienvenido a la aplicación, " + usuario.getNombre() + "!");
                    } else {
                        System.out.println("Inicio de sesión fallido. Comprueba tus credenciales.");
                    }
                    break;
                case 2:
                    System.out.println("Vamos a registrarte \n");
                    System.out.print("Introduce tu nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Introduce tu correo electrónico: ");
                    correo = scanner.nextLine();
                    System.out.print("Introduce tu contraseña: ");
                    contraseña = scanner.nextLine();
                    Usuario nuevoUsuario = new Usuario(nombre, correo, contraseña);
                    usuariosRegistrados.add(nuevoUsuario);
                    System.out.println("¡Registro exitoso!");
                    break;
                case 3:
                    System.out.println("Usuarios registrados:");
                    for (Usuario u : usuariosRegistrados) {
                        System.out.println("Nombre: " + u.getNombre() + ", Correo electrónico: " + u.getCorreo());
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar la aplicación. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
                    break;
            }
        }
    }

    public static Usuario buscarUsuario(String correo, String contraseña, List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña)) {
                return usuario;
            }
        }
        return null;
    }
}

class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;

    public Usuario(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }
}
