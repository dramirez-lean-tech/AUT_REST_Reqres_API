package utils;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class DataFakeGenerate {

    final Faker faker = new Faker(Locale.ENGLISH);

    public static DataFakeGenerate generateTo() {
        return new DataFakeGenerate();
    }

    public static String contacName(){
        String contacName = generateTo().faker.name().fullName();
        return  contacName;
    }

    public static String Gender(){
        String[]type={"Male","Famale"};
        Random random = new Random();
        int Gender = random.nextInt(1 + 1 - 1) + 1;
        return type[Gender];
    }

    public static String jobName(){
        String userName = generateTo().faker.job().title();
        return  userName;
    }
}