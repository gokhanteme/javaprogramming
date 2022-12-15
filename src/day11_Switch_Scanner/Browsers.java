package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {


        String browseName = "chrome";
        String result = "";
        boolean validBrowser =browseName == "chrome"||browseName =="firefox"||browseName == "opera"||
                browseName =="safari"||browseName =="edge";
        if (validBrowser){
            //5 options
            if (browseName == "chrome"){
                result="Chrome Browser İs selected";
            } else if (browseName =="firefox") {
                result= "Firefox Browser İs selected";

            } else if (browseName == "opera") {
                result= "Opera Browser İs selected";

            } else if ( browseName =="safari") {
               result = "Safari Browser İs selected";

            } else if (browseName =="edge") {
               result = "Edge Browser İs selected";

            }
        }else {
            result ="Invalid Browser Name ";
        }
        System.out.println(result);
        System.out.println("-----------------");

    }
}
