import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      /* ARRAYS
      Usuario[] usuarios = new Usuario[10];

      for( int i = 0; i < usuarios.length; i ++){
          Usuario atual = new Usuario();
          atual.setFirstName("nome " + i);
          atual.setLastName("Luís "+ i);
          usuarios[i] = atual;
      }
        System.out.println(usuarios[2].getFirstName());
        System.out.println(usuarios[2].getLastName());
        System.out.println(usuarios[7].getFirstName());


        Usuario[] user = new Usuario[]{
                new Usuario("Robson ", "Luís"),
                new Usuario("Eduardo ", "Gael"),
                new Usuario("Renata ", "Silva"),


        };

        System.out.println(user[0].getFullName());
        System.out.println(user[1].getFullName());
        System.out.println(user[2].getFullName());
*/

        List<Usuario> usuarios = new ArrayList<>();

        int i = 0;
        while (i < 10) {
            Usuario atual = new Usuario("nome " + i, "sobrenome " + i);
            usuarios.add(atual);
            i++;
        }

        System.out.println(usuarios.get(9).getFirstName());
        System.out.println(usuarios.get(9).getLastName());

        Usuario usuario11 = new Usuario("nome 11 ", "sobrenome 11");
        usuarios.add(usuario11);

        System.out.println(usuarios.get(10).getFirstName());
        System.out.println(usuarios.get(10).getLastName());

    }
}