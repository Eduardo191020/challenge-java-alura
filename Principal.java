
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int op = 0;
        int valor = 0;
        String mensaje = "Ingrese en valor que deseas convertir: ";
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();


        while(op!=7){
            System.out.println("***********************************************");
            System.out.println("Sea Bienvenido/a al Conversor de Monedas =]");
            System.out.println("");
            System.out.print("""
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción valida:
                """);
            op = consola.nextInt();
            switch (op){
                case 1 :
                    Moneda moneda = consultaMoneda.tranformarMoneda("USD");
                    System.out.print(mensaje);
                    valor = consola.nextInt();
                    System.out.println("El valor "+valor+ " [USD] corresponde al valor final" +
                            " de =>> "+moneda.conversion_rates().get("ARS")*valor+" [ARS] ");
                    break;
                case 2:
                    moneda = consultaMoneda.tranformarMoneda("ARS");
                    System.out.println(mensaje);
                    valor = consola.nextInt();
                    System.out.println("El valor "+valor+" [ARS] corresponde al valor final" +
                            " de =>> "+moneda.conversion_rates().get("USD")*valor+" [USD] ");
                    break;
                case 3:
                    moneda = consultaMoneda.tranformarMoneda("USD");
                    System.out.print(mensaje);
                    valor = consola.nextInt();
                    System.out.println("El valor "+valor+ " [USD] corresponde al valor final" +
                            " de =>> "+Math.round(moneda.conversion_rates().get("BRL")*valor)+" [BRL] ");
                    break;
                case 4:
                    moneda = consultaMoneda.tranformarMoneda("BRL");
                    System.out.print(mensaje);
                    valor = consola.nextInt();
                    System.out.println("El valor "+valor+ " [BRL] corresponde al valor final" +
                            " de =>> "+moneda.conversion_rates().get("USD")*valor+" [USD] ");
                    break;
                case 5:
                    moneda = consultaMoneda.tranformarMoneda("USD");
                    System.out.print(mensaje);
                    valor = consola.nextInt();
                    System.out.println("El valor "+valor+ " [USD] corresponde al valor final" +
                            " de =>> "+moneda.conversion_rates().get("COP")*valor+" [COP] ");
                    break;
                case 6:
                    moneda = consultaMoneda.tranformarMoneda("COP");
                    System.out.print(mensaje);
                    valor = consola.nextInt();
                    System.out.println("El valor "+valor+ " [COP] corresponde al valor final" +
                            " de =>> "+moneda.conversion_rates().get("USD")*valor+" [USD] ");
                    break;
                case 7:
                    System.out.println("Finalizando el programa, nos vemos!!! :]");
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelve a intentarlo :D");
            }
        }
    }
}