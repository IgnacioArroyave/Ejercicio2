public class familia 
{
    private String apellido;
    private int miembros;
    private int ninos;
    private int ninospequenos;
    private int perros;

    public familia(String ap, int m, int n, int np, int p)
    {
        apellido = ap;
        miembros = m;
        ninos = n;
        ninospequenos = np;
        perros = p;
    }

    public String get_apellido()
    {
        return apellido;
    }

    public int cantidad_perros()
    {
        return perros;
    }

    public int cantidad_ninos()
    {
        return ninos;
    }

    public int cantidad_ninospequenos()
    {
        return ninospequenos;
    }

    public void adoptar()
    {
        if (perros < 4)
            perros++;
    }

    public boolean aceptar(perro p)
    {
        boolean peligroso = p.raza_peligrosa();
        if (perros >= 4) return false;
        if (ninospequenos > 0 && (p.tamano() == "grande" || p.tamano() == "mediano" || peligroso)) return false; 
        if (ninos > 0 &&  (peligroso || p.tamano() == "grande")) return false; 
        return true;
    }
}