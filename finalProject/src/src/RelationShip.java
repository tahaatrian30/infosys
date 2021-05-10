package src;

import java.io.IOException;
import java.util.List;

public class RelationShip extends Mane{


    private String relation_type;
    private String relation_start_time;
    private String id_code_from;
    private String id_code_to;
    private String mane_key;



    public RelationShip() {
        mane_key = mergeTwoId(id_code_from, id_code_to);
    }

    public String mergeTwoId(String id1, String id2) {
        return id1 + id2;
    }

    public String getRelation_type() {
        return relation_type;
    }

    public void setRelation_type(String relation_type) {
        this.relation_type = relation_type;
    }

    public String getRelation_start_time() {
        return relation_start_time;
    }

    public void setRelation_start_time(String relation_start_time) {
        this.relation_start_time = relation_start_time;
    }

    public String getId_code_from() {
        return id_code_from;
    }

    public void setId_code_from(String id_code_from) {
        this.id_code_from = id_code_from;
    }

    public String getId_code_to() {
        return id_code_to;
    }

    public void setId_code_to(String id_code_to) {
        this.id_code_to = id_code_to;
    }

    public String getMane_key() {
        return mane_key;
    }

    public void setMane_key(String mane_key) {
        this.mane_key = mane_key;
    }

    @Override
    public void readCsv(String path) {
        super.readCsv(path);

    }
}
