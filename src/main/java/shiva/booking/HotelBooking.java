package shiva.booking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by e056441 on 1/24/18.
 */
@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String hotelName;
    private double pricePerNight;
    private int noOfNights;

    public HotelBooking(){}

    public HotelBooking(String hotelName, double pricePerNight, int noOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.noOfNights = noOfNights;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getNoOfNights() {
        return noOfNights;
    }

    public void setNoOfNights(int noOfNights) {
        this.noOfNights = noOfNights;
    }


    public  double getTotalPrice(){
        return noOfNights * pricePerNight;
    }

    public long getId() {
        return id;
    }
}
