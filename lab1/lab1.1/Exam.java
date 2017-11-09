import java.lang.reflect.Field;

public class Exam {
String title;
int CentreCode;
public void Exam( String T , int code)
{
this.title = T;
this.CentreCode = code;
}

public String  getTitle()
{
return this.title;

}

public void  setTitle( String s  )
{
	this.title = s;
}

public int  getCode()
{
return this.CentreCode;

}

public void  setCode ( int  a  )
{
	this.CentreCode = a;
}

public void printCentreName(){
        if(isValidCentre(CentreCode)) {
            try {
                for ( Field f : ExamCentres.class.getDeclaredFields()){
                    if((int)f.get(null) == CentreCode){
                        System.out.println(f.getName());
                        break;
                    }
                }
            }catch(Exception e){

            }
        }else{
            System.out.println("Unknown");
        }
    }
    public boolean isValidCentre(int CentreCode){
        boolean valid=false;
        try{
            for (Field i : ExamCentres.class.getDeclaredFields()){
                if((int)i.get(null) == CentreCode)
                {valid=true;
                    break;}
            }
        }catch(Exception e){
        }
        return valid;
    }

public static void main( String[] args )
{


}

}
