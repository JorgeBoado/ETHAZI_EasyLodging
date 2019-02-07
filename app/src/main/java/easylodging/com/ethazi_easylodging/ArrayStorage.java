package easylodging.com.ethazi_easylodging;

import java.util.ArrayList;
import java.util.List;

import easylodging.com.ethazi_easylodging.Main.Model.Booking;
import easylodging.com.ethazi_easylodging.Main.Model.Lodging;
import easylodging.com.ethazi_easylodging.Main.Model.PostalCode;
import easylodging.com.ethazi_easylodging.Main.Model.User;

public class ArrayStorage {
    private static ArrayStorage ourInstance;
    private User mUser;
    private List<Lodging> mLodgings;
    private List<Booking> mBookings;
    private List<PostalCode> mPostalCodes;

    public static ArrayStorage getInstance() {
        if (null == ourInstance) {
            ourInstance = new ArrayStorage();
        }
        return ourInstance;
    }

    private ArrayStorage() {
        mBookings = new ArrayList<>();
        //TODO meter un ArrayList de los alojamientos completo, para su uso en los filtros.
        //TODO igualar aqui el ArrayList de los alojamientosFiltrado.
        mLodgings = lodgingCreator();
        mPostalCodes = new ArrayList<>();
        mUser = new User();

    }

    //TODO Eliminar metodo, solo valido para las pruebas
    //Genera alojamientos aleatorios
    private List lodgingCreator() {
        List<Lodging> lodgings = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Lodging lodging = new Lodging();
            lodging.setId(i);
            lodging.setName("Hotel" + i);
            if (i <= 15) {
                lodging.setType("Albergues");
            } else if (15 < i && i <= 30) {
                lodging.setType("Agroturismos");
            } else if ( 30< i && i <=45) {
                lodging.setType("Campings");
            }else{
                lodging.setType("Casas Rurales");
            }
            lodging.setDescription("eiwuorqqwohjfbv<iwegbgau<ueowapouegb<ebsbwuegbawoiuegwoiuegwoiuegwoiuegwoiuegwoiuegwoiuegwoiuegwoiuegwoiuegwoiuegwoiuegwoiuegwoiuegwoiuegwoiuegsuegbv");
            lodging.setPhone("696728757");
            lodging.setAddress("Calle larburu");
            lodging.setPostalcode("48903");
            lodging.setCategory("S");
            lodging.setMarks("23985913");
            lodging.setTurismemail("jorge@fubgfuisb.com");
            lodging.setWeb("www.google.com");
            lodging.setCapacity(150);
            lodging.setFriendlyurl("wqeoihrqwiohrqobgolngolgbno");
            lodgings.add(lodging);
        }


        return lodgings;
    }

    private Lodging getLodging(int id) {
        for (Lodging lodging : mLodgings) {
            if (lodging.getId() == id) {
                return lodging;
            }
        }
        return null;
    }

    public List<Lodging> getLodgings() {
        return mLodgings;
    }

    public int getSize(){return mLodgings.size();}

    //TODO registro de usuario
    public boolean signInUser(User user) {
        return false;
    }

    //TODO hacer reserva
    public boolean addBooking(Booking booking) {
        return false;
    }

    //TODO eliminar reservas
    public boolean deleteBooking(Booking booking) {
        return false;
    }

}
