import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] operat = {"+", "-", "*", "/"};
        int s1 = 0;
        int s2 = 0;
        int result = 0;
        System.out.println("Программа Калькулятор");
        System.out.println("Введите два операнда и один оператор в формате x операция у");
        System.out.println("Операцией могут быть сложение +, вычитание -, деление /, уминожение * ");
        Scanner scanner = new Scanner(System.in);

        String vyr = scanner.nextLine();
        int c = vyr.split(" ").length;

        if (c == 3) {
            String[] all = vyr.split(" ");
            String num1 = all[0];
                  String op = all[1];
                      String num2 = all[2];

            if (Arrays.asList(arabic).contains(num1) && Arrays.asList(arabic).contains(num2) && Arrays.asList(operat).contains(op)) {
                s1 = Integer.parseInt(num1);
                s2 = Integer.parseInt(num2);


                if (op.equals("+")) {

                    result = s1 + s2;
                    System.out.println("Результат = " + result);
                }
                if (op.equals("-")) {
                    result = s1 - s2;
                    System.out.println("Результат = " + result);
                }
                if (op.equals("*")) {
                    result = s1 * s2;
                    System.out.println("Результат = " + result);
                }
                if (op.equals("/")) {
                    result = s1 / s2;
                    System.out.println("Результат = " + result);
                }
            } else {
                if (Arrays.asList(roman).contains(num1) && Arrays.asList(roman).contains(num2) && Arrays.asList(operat).contains(op)) {

                    switch (num1) {
                    case ("I") :  s1 = 1; break;
                    case ("II") :  s1 = 2; break;
                    case ("III") :  s1 = 3; break;
                    case ("IV") :  s1 = 4; break;
                    case ("V") :  s1 = 5; break;
                    case ("VI") :  s1 = 6; break;
                    case ("VII") :  s1 = 7; break;
                    case ("VIII") :  s1 = 8; break;
                    case ("IX") :  s1 = 9; break;
                    case ("X") :  s1 = 10; break;

                    }
                    switch (num2) {
                        case ("I") :  s2 = 1; break;
                        case ("II") :  s2 = 2; break;
                        case ("III") :  s2 = 3; break;
                        case ("IV") :  s2 = 4; break;
                        case ("V") :  s2 = 5; break;
                        case ("VI") :  s2 = 6; break;
                        case ("VII") :  s2 = 7; break;
                        case ("VIII") :  s2 = 8; break;
                        case ("IX") :  s2 = 9; break;
                        case ("X") :  s2 = 10; break;

                    }

                    switch (op) {
                        case ("+") : result = s1 + s2; break;
                        case ("-") : result = s1 - s2; break;
                        case ("*") : result = s1 * s2; break;
                        case ("/") : result = s1 / s2; break;

                    }
                        if (result>0) {
                            String resulti = perevod(result);
                            System.out.println("Результат = " + resulti);
                        }
                            else {
                                System.out.println("В римской системе нет отрицательных чисел");
                        }


                }
                else {System.out.println("Неверно введены данные");}
            }

        }
        else { System.out.println("Неверно введены данные");
        }


//
        }
        static String perevod (int num ) {
            String chislo = "" + num;
            String itog = "";

            if (num == 100) {
                return "C";
            } else {
                if (num > 10) {


                    switch (chislo.charAt(0)) {
                        case ('1'):
                            itog = itog + "X";
                            break;
                        case ('2'):
                            itog = itog + "XX";
                            break;
                        case ('3'):
                            itog = itog + "XXX";
                            break;
                        case ('4'):
                            itog = itog + "XL";
                            break;
                        case ('5'):
                            itog = itog + "L";
                            break;
                        case ('6'):
                            itog = itog + "LX";
                            break;
                        case ('7'):
                            itog = itog + "LXX";
                            break;
                        case ('8'):
                            itog = itog + "LXXX";
                            break;
                        case ('9'):
                            itog = itog + "XC";
                            break;

                    }
                    switch (chislo.charAt(1)) {
                        case ('1'):
                            itog = itog + "I";
                            break;
                        case ('2'):
                            itog = itog + "II";
                            break;
                        case ('3'):
                            itog = itog + "III";
                            break;
                        case ('4'):
                            itog = itog + "IV";
                            break;
                        case ('5'):
                            itog = itog + "V";
                            break;
                        case ('6'):
                            itog = itog + "VI";
                            break;
                        case ('7'):
                            itog = itog + "VII";
                            break;
                        case ('8'):
                            itog = itog + "VIII";
                            break;
                        case ('9'):
                            itog = itog + "IX";
                            break;
                                            }
                } else {
                    if (num < 10) {
                        switch (chislo.charAt(0)) {
                            case ('1'):
                                itog = itog + "I";
                                break;
                            case ('2'):
                                itog = itog + "II";
                                break;
                            case ('3'):
                                itog = itog + "III";
                                break;
                            case ('4'):
                                itog = itog + "IV";
                                break;
                            case ('5'):
                                itog = itog + "V";
                                break;
                            case ('6'):
                                itog = itog + "VI";
                                break;
                            case ('7'):
                                itog = itog + "VII";
                                break;
                            case ('8'):
                                itog = itog + "VIII";
                                break;
                            case ('9'):
                                itog = itog + "IX";
                                break;

                        }

                    }
                    else
                        if (num == 10){ itog = "X";}

                }
            }
            return itog;
        }
    }