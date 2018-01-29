package shiva.booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by e056441 on 1/24/18.
 */
@Repository
public interface BookingRepository extends JpaRepository<HotelBooking, Long> {

    List<HotelBooking> findByPricePerNightLessThan(double price);
}
