package prefi_tudai_2020;

public class CompApellido extends CompPersonal{

    public CompApellido(CompPersonal next) {
        this.next = next;
    }

    public CompApellido() {}

    @Override
    public int comparar(Personal p1, Personal p2) {
        return p1.getApellido().compareTo(p2.getApellido());
    }
    
}
