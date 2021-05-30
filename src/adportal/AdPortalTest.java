package adportal;

import adportal.exeptions.GenderException;
import adportal.interfaces.Commands;
import adportal.model.Advertisment;
import adportal.model.User;
import adportal.storage.AdStorage;
import adportal.storage.UserStorage;
import adportal.enums.Category;

import java.util.Scanner;

public class AdPortalTest {
    private static Scanner scanner = new Scanner(System.in);
    private static UserStorage userStorage = new UserStorage();
    private static AdStorage adStorage = new AdStorage();
    private static User loginUser;


    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("Please input " + Commands.EXIT + " for Exit");
            System.out.println("Please input " + Commands.LOGIN + " for Log In");
            System.out.println("Please input " + Commands.REGISTER + " for Register");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case Commands.EXIT:
                    run = false;
                    break;
                case Commands.LOGIN:
                    boolean isEmpty = userStorage.isEmpty();
                    if (!isEmpty) {
                        System.out.println("Please input phoneNumber");
                        String phoneNumber = scanner.nextLine();
                        System.out.println("please input password");
                        String password = scanner.nextLine();
                        boolean isLogin = userStorage.logIn(phoneNumber, password);
                        if (isLogin) {
                            loginUser = userStorage.getUserByPhoneNumber(phoneNumber);
                        }
                        while (isLogin) {
                            System.out.println("please input " + Commands.LOGOUT + " for log out");
                            System.out.println("please input " + Commands.ADD_NEW_AD + " for Ad AD");
                            System.out.println("please input " + Commands.PRINT_MY_ALL_ADS + " for print my all ads");
                            System.out.println("please input " + Commands.PRINT_ALL_ADS + " for print all ads");
                            System.out.println("please input " + Commands.PRINT_AD_BY_CATEGORY + " for print by category");
                            System.out.println("please input " + Commands.DELETE_MY_ALL_ADS + " for delete my all ads");
                            System.out.println("please input " + Commands.DELETE_AD_BY_TITLE + " for delete  ads by title");
                            int command1 = Integer.parseInt(scanner.nextLine());
                            switch (command1) {
                                case Commands.LOGOUT:
                                    isLogin = false;
                                    break;
                                case Commands.ADD_NEW_AD:
                                    addAD();
                                    break;
                                case Commands.PRINT_MY_ALL_ADS:
                                    adStorage.myAds(loginUser);
                                    break;
                                case Commands.PRINT_ALL_ADS:
                                    adStorage.print();
                                    break;
                                case Commands.PRINT_AD_BY_CATEGORY:
                                    System.out.println("please input category");
                                    String category = scanner.nextLine();
                                    adStorage.printByCategory(category);
                                    break;
                                case Commands.DELETE_MY_ALL_ADS:
                                    adStorage.delete(loginUser);
                                    break;
                                case Commands.DELETE_AD_BY_TITLE:
                                    System.out.println("Please input title");
                                    String title = scanner.nextLine();
                                    adStorage.deleteByTitle(title);
                                    break;
                                default:
                                    System.out.println("Wrong command");
                            }
                        }
                    } else {
                        System.out.println("There is no any user in application");
                    }
                    break;
                case Commands.REGISTER:
                    checkIn();
                    break;
                default:
                    System.out.println("Wrong command");

            }
        }

    }

    private static void addAD() {
        Advertisment advertisment = new Advertisment();
        System.out.println("Please input your AD");
        System.out.println("Please input title ");
        String title = scanner.nextLine();
        advertisment.setTitle(title);
        System.out.println("please input text");
        String text = scanner.nextLine();
        advertisment.setText(text);
        System.out.println("please input price");
        try {
            double price = Double.parseDouble(scanner.nextLine());
            advertisment.setPrice(price);
        } catch (NumberFormatException e) {
            System.out.println("please inpud price");
            addAD();
        }
        System.out.println("please input category");
        for (int i = 0; i < Category.values().length; i++) {
            System.out.println(Category.values()[i]);
        }
        try {
            Category category = Category.valueOf(scanner.nextLine());
            advertisment.setCategory(category);
            advertisment.setAuthor(loginUser);
            adStorage.add(advertisment);
        } catch (IllegalArgumentException e) {
            System.out.println("please input right category");
            addAD();
        }


    }


    private static void checkIn() {
        User user = new User();
        System.out.println("Please for register fill all lines");
        System.out.println("Please input name");
        String name = scanner.nextLine();
        user.setName(name);
        System.out.println("Please input surname");
        String surName = scanner.nextLine();
        user.setSurname(surName);
        System.out.println("Please input gender");
        try {
            String gender = scanner.nextLine();
            user.setGender(gender);
            if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("famale")) {
                throw new GenderException();
            }
        } catch (GenderException e) {
            System.out.println(e.getMessage());
            checkIn();
        }
        System.out.println("Please input age");
        try {
            int age = Integer.parseInt(scanner.nextLine());
            user.setAge(age);
        } catch (NumberFormatException e) {
            System.out.println("please input age");
            checkIn();
        }
        System.out.println("Please input phone number");
        String phoneNumber = scanner.nextLine();
        user.setPhoneNumber(phoneNumber);
        System.out.println("Please input password");
        String password = scanner.nextLine();
        user.setPassword(password);
        userStorage.add(user);
    }
}
