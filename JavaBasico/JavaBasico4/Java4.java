package CursoJavaNelioAlves4;

public class Java4 {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase(); // Irá deixar minúsculo a String original.

        String s02 = original.toUpperCase(); // Irá deixar maiúsculas a String original.

        String s03 = original.trim(); /* Ele vai deixar o String igual o Original,
        porém irá retirar os espaços que estão nos cantos */

        String s04 = original.substring(2); /* Deixa igual o original, porém
        o número dentro do () determina o caractere que terá o início. Digitando "2", se
        inicia no primeiro "c" e segue até o final */

        String s05 = original.substring(2,9); /* Recorta do "2" e vai até o antes do "9".
        nesse contexto, irá sair no print: "-cde FGH-" */

        String s06 = original.replace('a','x'); /* irá substituir o primeiro char,
        pelo segundo. Nesse contexto, toda vez que aparecer um 'a', será substituído por 'x' */

        String s07 = original.replace("abc", "xy"); /* replace funciona em
        casos de mais de uma letra ou número */

        int i = original.indexOf("bc"); /* Qual é a primeira vez que o "bc" aparece?
        O primeiro digito vale 0 e assim vai indo, 0, 1, 2, 3... */

        int j = original.lastIndexOf("bc"); /* última vez em que o "bc" apareceu
        no "original" */

        System.out.println("original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2,9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("IndexOf('bc'): "+ i);
        System.out.println("lastIndexOf('bc'): "+ j);
    }
}
