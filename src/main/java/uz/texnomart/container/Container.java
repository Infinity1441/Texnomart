package uz.texnomart.container;

import uz.texnomart.bot.MyBot;
import uz.texnomart.entity.Discount;
import uz.texnomart.entity.MessageData;
import uz.texnomart.entity.Product;
import uz.texnomart.enums.AdminStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Container {

    public static MyBot MY_BOT = null;
    public static String TOKEN = "5769474941:AAEEgcFwkVu7-ANOBQO1K7wq9CtgeVwel8M";
    public static String USERNAME = "http://t.me/abdullo_khayrulloev_s_bot";

    public static List<String> adminList = new ArrayList<>(List.of("164940659","609762012", "698010075"));

    // database stuff

    public static final String USER = "utpvoxxsoitfbq";
    public static final String PASSWORD = "0ae03e88b14ced6a6e431080225030545efe9af022cc14f62fb96346a3a16ea5";
    public static final String URL = "jdbc:postgresql://ec2-54-75-26-218.eu-west-1.compute.amazonaws.com:5432/dae44hkoegn6lq";

    // admin status 👇

    public static Map<String, AdminStatus> adminMap = new HashMap<>();

    // resourses folder path

    public static final String BASE_FOLDER = "src/main/resources/files/documents";
    public static Integer parent_c_id;
    public static String parent_c_name;

    //vaqtincha(tablega yozib bolguncha) discountlarni saqlash uchun list
    public static List<Discount> discountList = new ArrayList<>();

    //to contact with admin
    public static Map<String, Boolean> customerMap = new HashMap<>();

    public static Map<String, MessageData> adminAnswerMap = new HashMap<>();

    // map for containing the products for a certain time
    public static Map<String, List<Product>> productMap = new HashMap<>();
    // for tracking the amount of button presses by the users
    public static Map<String, Integer> buttonPressCount = new HashMap<>();
}
