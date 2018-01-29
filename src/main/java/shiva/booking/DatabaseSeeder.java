package shiva.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by e056441 on 1/24/18.
 */
@Component
public class DatabaseSeeder implements CommandLineRunner {

    private BookingRepository  bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
      List<HotelBooking> bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Marriot", 200.50, 3));
        bookings.add(new HotelBooking("Ibis", 90, 4));
        bookings.add(new HotelBooking("Marriot", 140.74, 1));

        bookingRepository.save(bookings);
    }
}
