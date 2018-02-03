package ram234.com.googlemapsgoogleplaces.models;

import android.net.Uri;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by user on 2/3/2018.
 */

public class PlaceInfo {


    private String name;
    private String phoneNumber;
    private String address;
    private String id;
    private String placeTypes;
    private float rating;
    private Uri websiteUri;
    private LatLng latlng;
    private String attributions;


    public PlaceInfo(String name,
                     String phoneNumber,
                     String address,
                     String id,
                     String placeTypes,
                     float rating,
                     Uri websiteUri,
                     LatLng latlng,
                     String attributions) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.id = id;
        this.placeTypes = placeTypes;
        this.rating = rating;
        this.websiteUri = websiteUri;
        this.latlng = latlng;
        this.attributions = attributions;
    }

    public PlaceInfo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaceTypes() {
        return placeTypes;
    }

    public void setPlaceTypes(String placeTypes) {
        this.placeTypes = placeTypes;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Uri getWebsiteUri() {
        return websiteUri;
    }

    public void setWebsiteUri(Uri websiteUri) {
        this.websiteUri = websiteUri;
    }

    public LatLng getLatlng() {
        return latlng;
    }

    public void setLatlng(LatLng latlng) {
        this.latlng = latlng;
    }

    public String getAttributions() {
        return attributions;
    }

    public void setAttributions(String attributions) {
        this.attributions = attributions;
    }

    @Override
    public String toString() {
        return "PlaceInfo{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", id='" + id + '\'' +
                ", placeTypes='" + placeTypes + '\'' +
                ", rating=" + rating +
                ", websiteUri=" + websiteUri +
                ", latlng=" + latlng +
                ", attributions='" + attributions + '\'' +
                '}';
    }
}
