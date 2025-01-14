public class Main {
    public static void main(String[] args){

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
*/

        Usuario[] user = new Usuario[]{
                new Usuario("Robson ", "Luís"),
                new Usuario("Eduardo ", "Gael"),
                new Usuario("Renata ", "Silva"),


        };

        System.out.println(user[0].getFullName());
        System.out.println(user[1].getFullName());
        System.out.println(user[2].getFullName());

    }
}