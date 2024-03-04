public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte mouse=2;
        short dog=10;
        int horse=15;
        long cat=13666;

        System.out.println("Значение переменной "+ "mouse"+ " с типом " + "byte"+ " равно "+ mouse);
        System.out.println("Значение переменной "+ "dog"+ " с типом " + "short"+ " равно "+ dog);
        System.out.println("Значение переменной "+ "horse"+ " с типом " + "int"+ " равно "+ horse);
        System.out.println("Значение переменной "+ "cat"+ " с типом " + "long"+ " равно "+ cat);
        //Задача 2
        float a=27.12F;
        long big= 987678965549L;
        float c=2.786F;
        short d=569;
        short f=-159;
        short g=27897;
        byte h=67;
        //Задача 3
        byte lyudmilaPavlovna =23;
        byte annaSegeevna=27;
        byte ekaterinaAndreevna=30;
        short totalList =480;
        short  listCount= (short) (totalList/(lyudmilaPavlovna+ekaterinaAndreevna+annaSegeevna));
        System.out.println("На каждого ученика рассчитано "+listCount+" листов бумаги");
        //Задача 4
        byte proizvoditelnost=16/2;
        short  dvadsatMinut=(short) (20*proizvoditelnost);
        short sutkiVminutah= (short) (1440*proizvoditelnost);
        int triDnyaVminutah= 4320*proizvoditelnost;
        int mesyatsVminutah=44640*proizvoditelnost;                   //в условии не указано количество дней, взято 31

        System.out.println("За "+"двадцать минут" +" машина произвела "+dvadsatMinut+" штук бутылок");
        System.out.println("За "+"сутки" +" машина произвела "+sutkiVminutah+" штук бутылок");
        System.out.println("За "+"три дня" +" машина произвела "+ triDnyaVminutah+" штук бутылок");
        System.out.println("За "+"месяц" +" машина произвела "+mesyatsVminutah+" штук бутылок");
        //Задача 5
        byte totalJar=120;
        byte whitePerClass=2;
        byte brownPerClass=4;
        byte classCount= (byte) (totalJar/(whitePerClass+brownPerClass));
        byte whiteCount= (byte) (classCount*whitePerClass);
        byte brownCount= (byte) (classCount*brownPerClass);
        System.out.println("В школе, где " +classCount+ " классов, нужно "+whiteCount+" банок белой краски и "+brownCount+" банок коричневой краски");
        //Задача 6
        byte bananaCount=5;
        byte babanaWeight=80;
        byte milkCount= 2;
        byte milkWeight= 105;
        byte iceCreamCount=2;
        byte iceCreamWeight=100;
        byte eggCount=4;
        byte eggWeight=70;
        int totalWeight=bananaCount*babanaWeight+milkCount*milkWeight+iceCreamCount*iceCreamWeight+eggCount*eggWeight;
        float weightKg=totalWeight/1000f;
        System.out.println("Общий вес такого спортзавтрака составляет "+weightKg+" кг");
        //Задача 7
        short totalLoss=7000;
        short slowLoss=250;
        short fastLoss=500;
        short averageLoss= (short) ((slowLoss+fastLoss)/2);
        byte daysIfSlow=(byte) (totalLoss/slowLoss);
        byte daysIfFast=(byte) (totalLoss/fastLoss);
        byte daysAverage=(byte) (totalLoss/averageLoss);
        System.out.println("Если терять по "+slowLoss+"грамм в день, то на похудение уйдет "+daysIfSlow+" дней");
        System.out.println("Если терять по "+fastLoss+"грамм в день, то на похудение уйдет "+daysIfFast+" дней");
        System.out.println("Если терять по "+averageLoss+"грамм в день, то на похудение уйдет "+daysAverage+" дней");
        //Задача 8
        int mashaPayment=67760;
        int denisPayment=83690;
        int kristinaPayment=76230;
        float increaseCoeff=1.1f;
        byte mounths=12;

        int mashaPayUp= (int) (mashaPayment*increaseCoeff);        //значения новых зарплат будут целыми, поскольку изначально заканчиваются на 0
        int denisPayUp= (int) (denisPayment*increaseCoeff);
        int kristinaPayUp= (int) (kristinaPayment*increaseCoeff);

        int mashaDifference = (mashaPayUp-mashaPayment)*mounths;
        int denisDifference = (denisPayUp-denisPayment)*mounths;
        int kristinaDifference = (kristinaPayUp-kristinaPayment)*mounths;

        System.out.println("Маша теперь получает "+mashaPayUp+" рублей. Годовой доход вырос на "+mashaDifference+" рублей" );
        System.out.println("Маша теперь получает "+denisPayUp+" рублей. Годовой доход вырос на "+denisDifference+" рублей" );
        System.out.println("Маша теперь получает "+kristinaPayUp+" рублей. Годовой доход вырос на "+kristinaDifference+" рублей" );
    }
}