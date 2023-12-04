package com.example.Calcolatrice;
/*
Questo è il controller applicativo, deve essere sganciato dalla view e dal controller grafico, dovrebbe eseguire
flusso principale dell'applicazione, in questo caso le due operazioni componiOperazione e calcolaOperazione
 */
public class CalcolatriceControllerApplicativo {
    public String calcolaOperazione(String s){

        String []operandi;
        int num1;
        int num2;
        int result;
        String strResult;

        if(s.contains("+")){

            operandi=s.split("\\+");

            num1=Integer.parseInt(operandi[0]);
            num2=Integer.parseInt(operandi[1]);
            result=num1+num2;
            strResult=String.valueOf(result);

        }
        else if(s.contains("x")){
            operandi=s.split("x");

            num1=Integer.parseInt(operandi[0]);
            num2=Integer.parseInt(operandi[1]);
            result=num1*num2;
            strResult=String.valueOf(result);

        }
        else if(s.contains("/")){
            operandi=s.split("/");

            num1=Integer.parseInt(operandi[0]);
            num2=Integer.parseInt(operandi[1]);
            result=(int)(num1/num2);
            strResult=String.valueOf(result);

        }
        else{
            operandi=s.split("-");

            num1=Integer.parseInt(operandi[0]);
            num2=Integer.parseInt(operandi[1]);
            result=num1-num2;
            strResult=String.valueOf(result);

        }
        return strResult;

    }

    public String componiOperazione(String s1,String s2){
        return s1+s2;
    }
}
