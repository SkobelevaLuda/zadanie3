public class Main {
    public static void main(String[] args) {
        // Взвешивание боксеров, чтобы понять, что они соответствуют весовой категории
        var weigthBoxer1 = 78.2;
        var weigthBoxer2 = 82.7;
        var weigthFighters = weigthBoxer1 + weigthBoxer2;
        System.out.println( " Вес спортсменов " + weigthFighters + " кг");
        // Выясняем разницу между весами бойцов
        var difference = weigthBoxer1 - weigthBoxer2;
        System.out.println( " Разница между спортсменами " + difference + " кг");
        var differencePositiv = weigthBoxer2 - weigthBoxer1;
        System.out.println( " Положительная разница между весом спортсменов " + differencePositiv + " кг" );
        var differencePositiv3 = weigthBoxer2 % weigthBoxer1;
        System.out.println( " Разница в весе спортсменов " + differencePositiv3 + " кг");
    }
}