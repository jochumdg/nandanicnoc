package models.nanda;

import java.util.*;

import javax.persistence.*;

import com.avaje.ebean.Page;

import play.db.ebean.*;
import play.data.format.Formats;

/**
 * Company entity managed by Ebean
 */
@Entity 
public class Bepalendkenmerk_Diagnose extends Model {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name="bepalendkenmerk_id")
    public Bepalendkenmerk bepalendkenmerk;
    
    @ManyToOne
    @JoinColumn(name="diagnose_id")
    public Diagnose diagnose;
    
    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date diagnose_bepalendkenmerk_releasestatus_datum;
    
    public String diagnose_bepalendkenmerk_releasestatus_omschrijving;
    /**
     * Generic query helper for entity Company with id Long
     */
    public static Model.Finder<Long,Bepalendkenmerk_Diagnose> find = new Model.Finder<Long,Bepalendkenmerk_Diagnose>(Long.class, Bepalendkenmerk_Diagnose.class);

    public static Page<Bepalendkenmerk_Diagnose> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
                .ilike("diagnose_id", filter)
                .findPagingList(pageSize)
                .setFetchAhead(false)
                .getPage(page);
    }

}

