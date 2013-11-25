package edu.asu.nlp.reviewsummarizer.dataloader;

import java.io.*;

/**
 * Created by arun on 11/24/13.
 */
public class CleanProductDataUtils {


    public static void main(String[] args) throws Exception{

        File file = new File("/media/Data/datasets/amazon_reviews/products/productinfo.txt");
        File outfile = new File("/media/Data/datasets/amazon_reviews/products/productinfoout.txt");


        BufferedReader br=new BufferedReader(new FileReader(file));
        BufferedWriter wr=new BufferedWriter(new FileWriter(outfile));

        String str;

        int count=0;
        int maxVal=0;

        int minVal=100;

        while((str=br.readLine())!=null){
            if(str.startsWith(" ")){
                count++;

                String[] prodInfo=str.split("\\t");
                StringBuilder builder=new StringBuilder();
                if(prodInfo.length==8){
                    for(int i=0;i<prodInfo.length-2;i++){
                        builder.append(prodInfo[i].trim()+"\t");
                    }
                    builder.append(prodInfo[7].trim());
                }

                wr.write(builder.toString());
                wr.newLine();
            }

        }

        System.out.println(count);
        System.out.println("Max Value:"+maxVal);
        System.out.println("Min Value:"+minVal);

        wr.flush();
        wr.close();
        br.close();
    }
}
