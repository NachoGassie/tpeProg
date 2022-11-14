package prefi_tudai_2020;

public class CompNombre extends CompPersonal{

    public CompNombre(CompPersonal next) {
        this.next = next;
    }

    public CompNombre() {}

    @Override
    public int comparar(Personal p1, Personal p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }
}
