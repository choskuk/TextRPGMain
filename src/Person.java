//import java.io.IOException;
import java.io.*;
import java.util.*;
//import java.io.FileOutputStream;
//import java.io.OutputStream;



class Person {
    String sName;
    String iJobName;
    int LevleupDamage;
    int iJob;
    int iHP;
    int iLevel;
    int iDamage;
    int iEXP;
    int iMaxHP;
    int iGold;
    int LevelupHP;

    String sSkillName1;
    String sSkillName2;
    String sSkillName3;
    int iSkill1;
    int iSkill2;
    int iSkill3;

    public Person()
    {
        sName = "";
        iJobName = "";
        iJob = 0;
        iEXP = 0;
        iLevel = 1;
        iMaxHP = 0;
        iHP = iMaxHP;
        iGold =0;
        LevelupHP = 0;
        iSkill1 = 0;
        iSkill2 = 0;
        iSkill3 = 0;

    }

    void NameSelect()
    {

        System.out.println("이름을 적어주세요.");
      //  @SuppressWarnings("resource")
        Scanner Name = new Scanner(System.in);
        sName = Name.next();

    }

 //   @SuppressWarnings("resource")
    void JobSelect()  {



        while(iJob <4 || iJob >0) {   //iJob ==1 || iJob ==2 || iJob ==3
            System.out.println("직업 선택 : 1. 전사  2. 마!법사  3. 도적");
            Scanner iSelect = new Scanner(System.in);
            iJob = iSelect.nextInt();

            if(iJob == 1)
            {
                iJobName = "전사";
                iMaxHP = 100;
                iHP = iMaxHP;
                iDamage = 2;
                LevleupDamage = 2;
                LevelupHP = 100;
                sSkillName1 = "파워슬래시";
                iSkill1 = 4;
                break;
            }
            else if(iJob == 2)
            {
                iJobName = "마!법사";
                iMaxHP = 50;
                iHP = iMaxHP;
                iDamage = 10;
                LevleupDamage = 6;
                LevelupHP = 50;
                break;
            }
            else if(iJob == 3)
            {
                iJobName = "도적";
                iMaxHP = 70;
                iHP = iMaxHP;
                iDamage = 5;
                LevleupDamage = 4;
                LevelupHP = 70;

                break;
            }
            else
                System.out.println("1~3번사이의 숫자를 선택해주세요");


        }


    }

    void showData()
    {
        System.out.println("이름 : " + sName);
        System.out.println("직업 : " + iJobName);
        System.out.println("H.P : " + iHP);
        System.out.println("Level: " + iLevel);
        System.out.println("EXP : " + iEXP);
        System.out.println("Gold: " + iGold);
        System.out.println("데미지: " + iDamage);
        System.out.println("스킬 : " + sSkillName1 + iSkill1);
        //System.out.println("데미지: " + iDamage);
    }
}