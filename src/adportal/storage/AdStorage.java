package adportal.storage;

import adportal.model.Advertisment;
import adportal.model.User;
import adportal.enums.Category;

import java.util.ArrayList;
import java.util.List;

public class AdStorage {

    List<Advertisment> advertismentList = new ArrayList<>();


    public void add(Advertisment advertisment) {
        advertismentList.add(advertisment);
    }

    public void print() {
        System.out.println(advertismentList);
    }

    public void delete(User loginUser) {
        for (int i = 0; i < advertismentList.size(); i++) {
            if (advertismentList.get(i).getAuthor().equals(loginUser)){
                advertismentList.remove(advertismentList.get(i));
            }
        }


    }
    public void myAds(User loginUser){
        for (Advertisment advertisment : advertismentList) {
            if (advertisment.getAuthor().equals(loginUser)){
                System.out.println(advertisment);
            }


        }

    }
    public void printByCategory(String category){
        for (Advertisment advertisment : advertismentList) {
            if (advertisment.getCategory().equals(Category.valueOf(category))){
                System.out.println(advertisment);
            }
        }
    }
    public void deleteByTitle(String title){
        for (int i = 0; i < advertismentList.size(); i++)  {
            if (advertismentList.get(i).getTitle().equalsIgnoreCase(title)){
                advertismentList.remove(advertismentList.get(i));
            }
        }
    }
}
