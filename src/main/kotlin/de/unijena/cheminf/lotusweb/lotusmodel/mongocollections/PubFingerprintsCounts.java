package de.unijena.cheminf.lotusweb.lotusmodel.mongocollections;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PubFingerprintsCounts {

    @Id
    public Integer id; //bit number


    public Integer count;


}
