package Exam;
import java.util.ArrayList;
import javax.print.Doc;
public class Policeman {

    private ArrayList<Policeman> POLICEMAN=new ArrayList<>();
    public static int ActiveCounter=0;
    private int id;
    private String name;
    private String surname;
    private String login;
    private boolean isActive=false;
   // private ArrayList<String> Partners = new ArrayList<>();

    public Policeman(int id, String name, String surname, String login) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.login = login;
        POLICEMAN.add(this);
    }



    @Override
        public String toString(){
        return "Policeman {" + "id='" + id + '\'' + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", login='" + login + '\'' + '}';
    }

    public void displayInfo(){
        StringBuilder builder=new StringBuilder();
        builder.append(this+"\n");

        System.out.println(builder.toString());
    }


    public int polAdded(){
        int z = 0;
        for (int m = 0; m < POLICEMAN.size(); m++) {
            z += 1;
        }
        return z;
    }



    public void deactivate(){
        this.isActive=false;
        ActiveCounter--;
    }
    public void activate(){
        this.isActive=true;
        ActiveCounter++;
    }

    public int getActive(){
        int t = 0;
        for (int h = 0; h < ActiveCounter; h++) {
            t += 1;
        }
        return t;
    }

    /*public void addPartner(Policeman p){
        this.Partners.add(p);
        p.Partners.add(this);
    }

    public void removePartner(Policeman p){
        this.Partners.remove(p);
    } */












        }






