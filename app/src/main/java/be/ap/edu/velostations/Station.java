package be.ap.edu.velostations;

import com.google.gson.annotations.SerializedName;

public class Station {
    @SerializedName("id")
    public int Id;

    @SerializedName("objectid")
    public String Objectid;

    @SerializedName("point_lat")
    public String Point_lat;

    @SerializedName("point_lng")
    public String Point_lng;

    @SerializedName("obj_type")
    public String Obj_type;

    @SerializedName("type")
    public String Type;

    @SerializedName("o_id")
    public String O_id;

    @SerializedName("naam")
    public String Naam;

    @SerializedName("aantal_loc")
    public String Aantal_loc;

    @SerializedName("ligging")
    public String Ligging;

    @SerializedName("orientatie")
    public String Orientatie;

    @SerializedName("status")
    public String Status;

    @SerializedName("shape")
    public String Shape;

    public Station()
    {}
}
