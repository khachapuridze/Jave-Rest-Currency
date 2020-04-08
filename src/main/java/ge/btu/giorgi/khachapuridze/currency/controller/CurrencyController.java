package ge.btu.giorgi.khachapuridze.currency.controller;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import ge.btu.giorgi.khachapuridze.currency.model.Currency;
@Path("/currencyManager")
public class CurrencyController {

    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Currency> getCurrency() {
        List<Currency> currencyList=new ArrayList<>();
        currencyList.add(new Currency("EUR",3.16,3.2));
        currencyList.add(new Currency("USD",3.43,3.475));
        currencyList.add(new Currency("EUR",4.5,3.1));
        currencyList.add(new Currency("AZN",4.5,3.1));
        currencyList.add(new Currency("TRY",4.5,3.1));
        currencyList.add(new Currency("RUB",4.5,3.1));
        return currencyList;
    }

    @POST
    @Path("/currency/buy")
    @Produces(MediaType.APPLICATION_JSON) // აბრუნებს ჯეისონს
    @Consumes(MediaType.APPLICATION_JSON) // იღებს ჯეისონს
    public void addCurrency(Currency currency) {
        System.out.println(currency.toString());
    }


    @PUT
    @Path("/currency/sell")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Currency updateCurrency(Currency currency) {
        System.out.println(currency.toString());
        return currency;
    }
}

