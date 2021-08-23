public class perro
{
    private String raza;
    private String tamano;
    private int edad;
    private int salud;
    private String color;
    private boolean peligroso;

    public perro(String r, String t, int e, int s, String c)
    {
        raza = r;
        tamano = t;
        edad = e;
        salud = s;
        color = c;
        switch (r)         //ningun perro es peligroso solo por la raza, son los malos dueños que son un peligro
        {
            case "Pit bull terrier":
            peligroso = true;
            break;

            case "American Staffordshire terrier":
            peligroso = true;
            break;

            case "Tosa Inu":
            peligroso = true;
            break;

            case "Dogo argentino":
            peligroso = true;
            break;

            case "Fila brasileño":
            peligroso = true;
            break;

            case "Presa canario":
            peligroso = true;
            break;

            case "Dóberman":
            peligroso = true;
            break;

            case "Gran perro japonés":
            peligroso = true;
            break;
            
            case "Mastín napolitano":
            peligroso = true;
            break;

            case "Presa Mallorqui":
            peligroso = true;
            break;

            case "Dogo de burdeos":
            peligroso = true;
            break;

            case "Bullmastiff":
            peligroso = true;
            break;

            case "Bull terrier inglés":
            peligroso = true;
            break;

            case "Bulldog americano":
            peligroso = true;
            break;

            case "Rhodesiano":
            peligroso = true;
            break;

            case "Rottweiler":
            peligroso = true;
            break;

            default:
            peligroso = false;
        }
    }


    public String raza()
    {
        return raza;
    }

    public String tamano()
    {
        return tamano;
    }

    public boolean raza_peligrosa()
    {
        return peligroso;
    }

}