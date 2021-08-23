import java.util.Scanner;


public class driver 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        familia[] familias = new familia[15];
        perro perro_recibido = null;
        int fams = 3;
        familias[0] = new familia("Nunez", 1, 0, 0, 0);
        familias[1] = new familia("Alvarez", 5, 2, 1, 1);
        familias[2] = new familia("Martínez", 3, 1, 0, 2);


        System.out.println("Bienvenido");
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("Opciones: ");
            System.out.println("1) ingresar perro");
            System.out.println("2) asignar perro ingresado");
            System.out.println("3) ingresar familia");
            System.out.println("4) salir");
            String opcion = input.nextLine();
            switch (opcion)
            {
                case "1": 
                System.out.println("Ingresar raza del perro: ");
                String raza = input.nextLine();
                System.out.println("Ingresar tamano del perro: ");
                String tamano = input.nextLine();
                System.out.println("Ingresar edad del perro: ");
                int edad = Integer.parseInt(input.nextLine());
                System.out.println("Ingresar salud del perro (porcentaje)");
                int salud = Integer.parseInt(input.nextLine());
                System.out.println("Ingresar color del perro: ");
                String color = input.nextLine();
                perro_recibido = new perro(raza, tamano, edad, salud, color);
                break;
                case "2": 
                if (perro_recibido != null)
                {
                    for (int i = 0; i < 15; i++)
                    {
                    String mensaje = "No se pudo asignar al perro con la familia " + familias[i].get_apellido();
                    if (familias[i].aceptar(perro_recibido)) 
                    {
                        mensaje = "La familia " + familias[i].get_apellido() + " puede adoptarlo";
                        familias[i].adoptar();
                        i = 15;
                    }
                    System.out.println(mensaje);
                    }
                }
                break;
                case "3":
                if (fams < 15)
                {
                    System.out.println("Ingresar apellido: ");
                    String apellido = input.nextLine();
                    System.out.println("Ingresar cantidad de miembros de la familia: ");
                    int miembros = Integer.parseInt(input.nextLine());
                    System.out.println("Ingresar cantidad de niños: ");
                    int ninos = Integer.parseInt(input.nextLine());
                    System.out.println("Ingresar cantidad de niños pequeños: ");
                    int ninospequenos = Integer.parseInt(input.nextLine());
                    System.out.println("Ingresar cantidad de perros: ");
                    int perros = Integer.parseInt(input.nextLine());
                    familias[fams] = new familia(apellido, miembros, ninos, ninospequenos, perros);
                }
                else
                {
                    System.out.println("No se pueden ingresar más familias");
                }
                break;
                case "4":
                continuar = false; 
                break;
                default:
                System.out.println("Error, asegurese de solo ingresar el número correspondiente a una de las opciones");
            }
        }
    }
}