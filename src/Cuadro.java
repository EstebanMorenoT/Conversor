import javax.swing.*;
import java.util.Objects;

public class Cuadro {
    public static void main(String[] args) {
        // Opcion que seleciona el usuario entre conversor de moneda o de temperatura
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Selecciona una opción de conversion", "Menu",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de moneda", "Conversor de temperatura"}, "Seleccion");

        // Array con opciones de conversion de pesos colombianos a otra moneda o visceversa
        String[] monedas = {"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
        "De Pesos a Won", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won a Pesos"};

        // Valores de las monedas a convertir
        double pesoADolar = 0.00025;
        double pesoAEuro = 0.00022;
        double pesoALibra = 0.00020;
        double pesoAYen = 0.0347;
        double pesoAWon = 0.3151;
        double dolarAPeso = 4.000;
        double euroAPeso = 4.500;
        double libraAPeso = 5.200;
        double yenAPeso = 28.8366;
        double wonAPeso = 3.1732;

        // Array con opciones de conversion de temperatura
        String[] temperaturas = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin",
        "De Kelvin a Celsius", "De Kelvin a Fahrenheit"};

        // Si seleccionan conversor de moneda
        while(Objects.equals(opcionSeleccionada, "Conversor de moneda")){
            //Ingresar cantidad de dinero a ser convertida en otra moneda
            String moneda = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir:",
                    "Input", JOptionPane.QUESTION_MESSAGE);
            if(moneda != null){
                // Atrapar la exception si es dieferente a una valor numerico
                try {
                    // Conversion de las monedas
                    String monedaAConvertir = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero",
                            "Monedas", JOptionPane.PLAIN_MESSAGE, null, monedas, monedas[0]);
                    double resultado = Double.parseDouble((moneda));
                    if(Objects.equals(monedaAConvertir, monedas[0])){
                        resultado *= pesoADolar;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(monedaAConvertir, monedas[1])){
                        resultado *= pesoAEuro;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(monedaAConvertir, monedas[2])){
                        resultado *= pesoALibra;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(monedaAConvertir, monedas[3])){
                        resultado *= pesoAYen;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(monedaAConvertir, monedas[4])){
                        resultado *= pesoAWon;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(monedaAConvertir, monedas[5])){
                        resultado *= dolarAPeso;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(monedaAConvertir, monedas[6])){
                        resultado *= euroAPeso;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(monedaAConvertir, monedas[7])){
                        resultado *= libraAPeso;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(monedaAConvertir, monedas[8])){
                        resultado *= yenAPeso;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(monedaAConvertir, monedas[9])){
                        resultado *= wonAPeso;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }
                    // Opcion para continuar o cerrar el ciclo
                    int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?",
                            "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (continuar == JOptionPane.YES_OPTION) {
                        System.out.println("Ha seleccionado Sí");
                    } else if (continuar == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "Programa terminado", "Message", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    } else if (continuar == JOptionPane.CANCEL_OPTION) {
                        JOptionPane.showMessageDialog(null, "Programa terminado", "Message", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }else {
                break;
            }
        // Si seleccionan conversor de temperatura
        }while(Objects.equals(opcionSeleccionada, "Conversor de temperatura")){
            //Ingresar cantidad de temperatura a ser convertida
            String temperatura = JOptionPane.showInputDialog(null, "Ingresa la temperatura deseas convertir:",
                    "Input", JOptionPane.QUESTION_MESSAGE);
            if(temperatura != null) {
                // Atrapar la exception si es dieferente a una valor numerico
                try{
                    // Conversion de la temperatura
                    String temperaturaAConvertir = (String) JOptionPane.showInputDialog(null, "Elije la opcion a la que deseas convertir la temperatura",
                            "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, temperaturas, temperaturas[0]);
                    double resultado = Double.parseDouble((temperatura));
                    if(Objects.equals(temperaturaAConvertir, temperaturas[0])) {
                        resultado = (9 * resultado)/5 + 32;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(temperaturaAConvertir, temperaturas[1])) {
                        resultado += 273.15;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(temperaturaAConvertir, temperaturas[2])) {
                        resultado = (resultado - 32) *5 /9;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(temperaturaAConvertir, temperaturas[3])) {
                        resultado = (resultado - 32) *5 /9 +273.15;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(temperaturaAConvertir, temperaturas[4])) {
                        resultado -= 273.15;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }else if(Objects.equals(temperaturaAConvertir, temperaturas[5])) {
                        resultado = (resultado - 273.15) *9 /5 +32;
                        JOptionPane.showMessageDialog(null, resultado, "Message", JOptionPane.PLAIN_MESSAGE);
                    }
                    // Opcion para continuar o cerrar el ciclo
                    int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?",
                            "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (continuar == JOptionPane.YES_OPTION) {
                        System.out.println("Ha seleccionado Sí");
                    } else if (continuar == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "Programa terminado", "Message", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    } else if (continuar == JOptionPane.CANCEL_OPTION) {
                        JOptionPane.showMessageDialog(null, "Programa terminado", "Message", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Valor no valido", "Message", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                break;
            }
        }
    }
}
