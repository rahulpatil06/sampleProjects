package practice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test8 {
    public static void main(String args[]) throws IOException {
        List<Quoter> list = new ArrayList<>();
        Quoter q1 = new Quoter("TEA","Common",0,0,100);
        Quoter q2 = new Quoter("POP","Common",8,0,100);
        Quoter q3 = new Quoter("ALE","Common",23,0,60);
        Quoter q4 = new Quoter("GIN","Preferred",8,.02f,100);
        list.add(q1); list.add(q2);
        list.add(q3); list.add(q4);


        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.println("Enter Stock Symbol and Stock Price");
        String stockSymbol = br.readLine();
        double stockPrice = Double.parseDouble(br.readLine());
        for(int i=0;i<list.size();i++){
            if(list.get(i).getStockSymbol().equals(stockSymbol) && list.get(i).getType().equals("Preferred") ){
                double dY =   (list.get(i).getFixedDivident()*list.get(i).getParValue())/stockPrice;
                System.out.println("Divident Yield ="+dY);
            }
            if(list.get(i).getStockSymbol().equals(stockSymbol) && list.get(i).getType().equals("Common") ){
                double dY =   (list.get(i).getLastDivident())/stockPrice;
                System.out.println("Divident Yield ="+dY);
            }
            if(list.get(i).getStockSymbol().equals(stockSymbol)){
                if(list.get(i).getFixedDivident() !=0){
                    double pE = stockPrice/list.get(i).getFixedDivident();
                    System.out.println("PE ratio ="+pE);
                }else{
                    System.out.println("Can not find the PE Ratio");
                }

            }

        }
    }

}
