package mcm.edu.ph.projectsafehaven.controller;

import android.content.res.Resources;

import java.util.Random;

import mcm.edu.ph.projectsafehaven.R;



public class GeneratePerson {

    private int SEED = 1; //random seeding not enabled at the moment

    private Random gen = new Random();
    private int pid, sex, health, relLvl, stress, trust;
    private double money, food;
    private String fname, lname, job, trait1, trait2, trait3, trait4, item1, item2;

    public int randomizeSex(){
        int sex;
        sex = gen.nextInt(2);
        return sex;
    }
    //randomizing health is turned off for testing purposes
    public int randomizeHealth(){return 100;}
    public int randomizeRelLvl(){
        int relLvl;
        relLvl = gen.nextInt(3);
        return relLvl;
    }
    public int randomizeStress(){
        int stress;
        stress = gen.nextInt(30);
        return  stress;
    }
    public int randomizeTrust(int relLvl){
        int trust;
        if(relLvl==0){
            //if he/she is a family member, trust level would be 70 - 100
            trust = gen.nextInt(30);
            trust += 70;
        }
        else if(relLvl==1){
            //if he/she is a friend, trust level would be 40 - 70
            trust = gen.nextInt(30);
            trust += 40;
        }
        else {
            //if he/she is a nobody, trust level would be 0 - 40
            trust = gen.nextInt(40);
        }
        return  trust;
    }
    public double randomizeMoney(){
        int intMoney;
        intMoney = gen.nextInt(10000);
        return (double)intMoney;
    }
    public double randomizeFood(){
        int food;
        food = gen.nextInt(100);
        return (double)food;
    }
    public String randomizeFname(int sex){
        //band-aid solution until names have been transferred to a file
        String[] fnameArray = new String[]{
                "Aezra","Lyka Dion", "Ria", "Abigail", "Aira", "Alexa",
                "Alice", "Alyannah", "Alyssa", "Ana", "Andrea", "Angel",
                "Angela", "Angelica", "Angelie", "Anna", "Anne", "Ara",
                "Aya", "Bea", "Belle", "Bianca", "Camille", "Catherine",
                "Cha", "Cherry", "Christine", "Claire", "Clare", "Clarissa",
                "Coleen", "Cristine", "Czarina", "Danica", "Daniela", "Daniella",
                "Danielle", "Denise", "Desiree", "Diana", "Eirene", "Ella",
                "Elle", "Erin", "Faye", "Frances", "Gabrielle", "Grace",
                "Hannah", "Ice", "Irene", "Isabel", "Jan", "Jane", "Jean",
                "Jeanne", "Jennly", "Jessica", "Joan", "Joy", "Joyce",
                "Judy", "Justine", "Karen", "Kate", "Kathleen", "Katrina",
                "Kim", "Kimberly", "Kris", "Kristine", "Kyla", "Lea", "Leah",
                "Lorraine", "Lou", "Louise", "Lovely", "Loysa", "Lyn",
                "Mae", "Maria", "Marian", "Marie", "Mary", "Mavi", "Mica",
                "Michelle", "Nadine", "Nathalie", "Nica", "Nicole", "Nikki",
                "Nina", "Pamela", "Patricia", "Paula", "Pauline", "Pia",
                "Precious", "Rachel", "Ren", "Rose", "Ruth", "Sam", "Sandy",
                "Sarah", "Sheila", "Shine", "Sofia", "Sophia", "Stephanie",
                "Thea", "Tricia", "Trina", "Trisha", "Valerie", "Vanessa",
                "Victoria", "Yana"};
        //String[] fname_female = Resources.getSystem().getStringArray(R.array.fname_f);
        //random name picker
        //return fname_female[gen.nextInt(120)];
        String fnamee = fnameArray[gen.nextInt(120)];
        return fnamee;
    }
    public String randomizeLname(){
        String[] lname = new String[]{"Andrada", "Aquino", "Arellano", "Bautista", "Bernardino",
                                    "Cardoza", "Caridad", "Castillo", "Castro", "Chan", "Chang",
                                    "Chua", "Cordero", "Cruz", "De Castro", "De La Cruz", "De La Rosa",
                                    "De Los Reyes", "De Los Santos", "Del Rosario", "Esteros",
                                    "Faviana", "Favio", "Flores", "García", "Go", "Ignacio",
                                    "Lee", "Lim", "Lovino", "Mendoza", "Mercado", "Navarro",
                                    "Ocampo", "Palermo", "Ramirez", "Ramos", "Reyes", "Rivera",
                                    "Salazar", "Santos", "Sumalpong", "Sy", "Tan", "Tolentino",
                                    "Tomas", "Torres", "Ty", "Valencia", "Villanueva", "Yap", "Yee"};
        String lnamee = lname[gen.nextInt(52)];
        this.lname = lnamee;
        return lnamee;

    }
    public String randomizeJob(){
        int jobType;
        String job="";
        //String[] jobClass1 = Resources.getSystem().getStringArray(R.array.job_arms);
        //String[] jobClass2 = Resources.getSystem().getStringArray(R.array.job_freeloader);
        //String[] jobClass3 = Resources.getSystem().getStringArray(R.array.job_medic);
        //String[] jobClass4 = Resources.getSystem().getStringArray(R.array.job_moraleboost);
        //String[] jobClass5 = Resources.getSystem().getStringArray(R.array.job_narrator);
        //String[] jobClass6 = Resources.getSystem().getStringArray(R.array.job_techies);
        //Workaround - Better Fix next update
        String[] jobClass1 = new String[]{"Police Retiree", "Army Veteran", "Security Guard"};
        String[] jobClass2 = new String[]{"Housewife", "House Husband", "Pensioner","Jobless","Homeless","High School"};
        String[] jobClass3= new String[]{"Veterinarian", "Student Doctor", "Student Nurse"};
        String[] jobClass4 = new String[]{"Psychotherapist", "Motivational Speaker", "Counsellor", "Teacher", "Pastor"};
        String[] jobClass5 = new String[]{"Attorney", "Librarian", "Author", "News Reporter", "Scriptwriter"};
        String[] jobClass6 = new String[]{"IT Specialist", "Engineer", "Architect", "Phyisicist", "Chemist"};

        jobType = (gen.nextInt(6))+1;
        if(jobType==1){job = jobClass1[gen.nextInt(3)];}
        else if(jobType==2){job = jobClass2[gen.nextInt(6)];}
        else if(jobType==3){job = jobClass3[gen.nextInt(3)];}
        else if(jobType==4){job = jobClass4[gen.nextInt(5)];}
        else if(jobType==5){job = jobClass5[gen.nextInt(5)];}
        else{job = jobClass6[gen.nextInt(5)];}
        return job;
    }
    public String randomizeTrait1(){
        String[]  trait1 = new String[]{"Positive Trait 1", "Positive Trait 1", "Positive Trait 1","Positive Trait 1","Positive Trait 1"};
        return trait1[gen.nextInt(5)];
    }
    public String randomizeTrait2(){
        String[] trait2 = new String[]{"Negative Trait 1", "Negative Trait 1", "Negative Trait 1","Negative Trait 1","Negative Trait 1"};
        return trait2[gen.nextInt(5)];
    }
    public String randomizeTrait3(){
        String[] trait3 = new String[]{"Positive Trait 2", "Positive Trait 2", "Positive Trait 2","Positive Trait 2","Positive Trait 2"};
        return trait3[gen.nextInt(5)];
    }
    public String randomizeTrait4(){
        String[] trait4 = new String[]{"Negative Trait 1", "Negative Trait 1", "Negative Trait 1","Negative Trait 1","Negative Trait 1"};
        return trait4[gen.nextInt(5)];
    }
    public String randomizeItem1(){
        String[]  item1 = new String[]{"Item 1", "No Item", "Item 1","No Item","Item 1"};
        return item1[gen.nextInt(5)];
    }
    public String randomizeItem2(){
        String[]  item2 = new String[]{"No Item", "Item 2", "No Item","Item 2","No Item"};
        return item2[gen.nextInt(5)];
    }

    public GeneratePerson(){
        sex = randomizeSex();
        health = randomizeHealth();
        relLvl = randomizeRelLvl();
        stress = randomizeStress();
        trust = randomizeTrust(relLvl);
        money = randomizeMoney();
        food = randomizeFood();
        fname = randomizeFname(sex);
        lname = randomizeLname();
        job = randomizeJob();
        trait1 = randomizeTrait1();
        trait2 = randomizeTrait2();
        trait3 = randomizeTrait3();
        trait4 = randomizeTrait4();
        item1 = randomizeItem1();
        item2 = randomizeItem2();
    }//default constructor




    public void randomizeP(){}
    public String fullName(){return fname+" "+lname;}

    /** Primary getters - this class might not have setters to avoid data override **/
    public int getSex() {return sex;}
    public int getHealth() {return health;}
    public int getRelLvl() {return relLvl;}
    public int getStress() {return stress;}
    public int getTrust() {return trust;}
    public double getMoney() {return money;}
    public double getFood() {return food;}
    public String getFName() {return fname;}
    public String getLName() {return lname;}
    public String getJob() {return job;}
    public String getTrait1() {return trait1;}
    public String getTrait2() {return trait2;}
    public String getTrait3() {return trait3;}
    public String getTrait4() {return trait4;}
    public String getItem1() {return item1;}
    public String getItem2() {return item2;}

    /** Secondary getters **/
    public String getSexString(){
        String sexString;
        if (sex==0){
            sexString ="Male";
        }
        else sexString = "Female";

        return sexString;
    }
    public String getRelLvlString(){
        String relLvlString;
        if(relLvl == 0){
            relLvlString = "Family";
        }
        else if(relLvl == 1){
            relLvlString ="Acquaintance";
        }
        else relLvlString = "Nobodies";
        return relLvlString;
    }


}
