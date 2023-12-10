import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1: ");

        System.out.println("Введите строку:  ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String exp = "\\b[a-zA-z]{2,6}\\b";
        Pattern pattern = Pattern.compile(exp);
        Matcher matcher = pattern.matcher(line);

        System.out.println("Абрревиатуры из строки: ");
        while (matcher.find()){
            String group = matcher.group();
            System.out.println(group);
        }


        System.out.println("Задание *: ");

        String text = "email: teachmeskills@gmail.com document number: 1423-1512-51 some information and telephone number: (12)34567 +(29)1234567 +0000 +(11)1111111 pochta.com 66-76-89";
        String email = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
        String documentNumber = "\\b\\d{4}-\\d{4}-\\d{2}\\b";
        String telephone = "\\s\\+\\(\\d{2}\\)\\d{7}\\s";


        Pattern patternEmail = Pattern.compile(email);
        Matcher matcher1 = patternEmail.matcher(text);

        Pattern patternDoc = Pattern.compile(documentNumber);
        Matcher matcher2 = patternDoc.matcher(text);

        Pattern patternTel = Pattern.compile(telephone);
        Matcher matcher3 = patternTel.matcher(text);

        while(matcher1.find()){
            System.out.println("email:"+matcher1.group());
        }
        while(matcher2.find()){
            System.out.println("document number:"+matcher2.group());
        }
        while(matcher3.find()){
            System.out.println("telephone number:"+matcher3.group());
        }



    }
}