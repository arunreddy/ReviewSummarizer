package edu.asu.nlp.reviewsummarizer;

import edu.asu.nlp.reviewsummarizer.entity.Review;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by arun on 11/22/13.
 */
public class LoadData {


    public static void main(String args[]){


        File file=new File("/media/JUNK/downloads/reviewsNew.txt");
        try{
            BufferedReader br=new BufferedReader(new FileReader(file));
            String str;

            while((str=br.readLine())!=null){
                Review review=new Review(str);
                HibernateUtil.createRecord(review);
            }


        }catch(Exception ex){
            ex.printStackTrace();
        }

        HibernateUtil.closeSession();
    }
}
