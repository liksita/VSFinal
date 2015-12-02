package de.hawhamburg.microservices.core.price.product;

import de.hawhamburg.microservices.composite.price.model.CalculatedPrice;
import de.hawhamburg.microservices.composite.price.service.PriceCompositeIntegration;
import de.hawhamburg.microservices.core.price.jpa.domain.Price;
import org.junit.Before;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;


public class PriceCompositeServiceUnitTests {

    private PriceCompositeIntegration priceCompositeIntegration;

    @Before
    public void init(){
        this.priceCompositeIntegration = new PriceCompositeIntegration();

    }

    //Tests fuer PriceCompositeIntegration

    @Test
    public void TestGetPrice() {

        UUID id1;
        UUID id2;
        UUID id3;

        Price price1;
        Price price2;
        Price price3;

        ResponseEntity<Price> response1;
        ResponseEntity<Price> response2;
        ResponseEntity<Price> response3;

        //UUID anlegen
        id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        id2 = UUID.fromString("1b4acc1d-3439-4b67-905a-1f7a4bb692cb");
        id3 = UUID.fromString("2b4acc1d-3439-4b67-905a-1f7a4bb692cc");
        //Preisobjekt mit Preis:100 und einer UUID anlegen
        price1 = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();
        price2 = new Price.PriceBuilder().withFlightId(id2).withValue(200).build();
        price3 = new Price.PriceBuilder().withFlightId(id3).withValue(300).build();
        //Preis Ausgaben erzeugen
        response1 = new ResponseEntity<>(price1, HttpStatus.OK);
        response2 = new ResponseEntity<>(price2, HttpStatus.OK);
        response3 = new ResponseEntity<>(price3, HttpStatus.OK);

        //Objekte & Methoden mocken
        priceCompositeIntegration = Mockito.mock(PriceCompositeIntegration.class);

        //Preise speichern
        priceCompositeIntegration.createPrice(price1);
        priceCompositeIntegration.createPrice(price2);
        priceCompositeIntegration.createPrice(price3);

        Mockito.when(priceCompositeIntegration.getPrice(id1)).thenReturn(response1);
        Mockito.when(priceCompositeIntegration.getPrice(id2)).thenReturn(response2);
        Mockito.when(priceCompositeIntegration.getPrice(id3)).thenReturn(response3);

        Assert.assertEquals(response1, priceCompositeIntegration.getPrice(id1));
        Assert.assertEquals(response2, priceCompositeIntegration.getPrice(id2));
        Assert.assertEquals(response3, priceCompositeIntegration.getPrice(id3));


    }

    @Test
    public void TestCreatePrice() {

        UUID id1;
        UUID id2;
        UUID id3;

        Price price1;
        Price price2;
        Price price3;

        ResponseEntity<Price> response1;
        ResponseEntity<Price> response2;
        ResponseEntity<Price> response3;

        //UUID anlegen
        id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        id2 = UUID.fromString("1b4acc1d-3439-4b67-905a-1f7a4bb692cb");
        id3 = UUID.fromString("2b4acc1d-3439-4b67-905a-1f7a4bb692cc");
        //Preisobjekt mit Preis:100 und einer UUID anlegen
        price1 = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();
        price2 = new Price.PriceBuilder().withFlightId(id2).withValue(200).build();
        price3 = new Price.PriceBuilder().withFlightId(id3).withValue(300).build();
                //Preis Ausgaben erzeugen
        response1 = new ResponseEntity<>(price1, HttpStatus.OK);
        response2 = new ResponseEntity<>(price2, HttpStatus.OK);
        response3 = new ResponseEntity<>(price3, HttpStatus.OK);

//        //Objekte & Methoden mocken
        priceCompositeIntegration = Mockito.mock(PriceCompositeIntegration.class);
        Mockito.when(priceCompositeIntegration.createPrice(price1)).thenReturn(response1);
        Mockito.when(priceCompositeIntegration.createPrice(price2)).thenReturn(response2);
        Mockito.when(priceCompositeIntegration.createPrice(price3)).thenReturn(response3);
//        //Tests
        Assert.assertEquals(response1, priceCompositeIntegration.createPrice(price1));
        Assert.assertEquals(response2, priceCompositeIntegration.createPrice(price2));
        Assert.assertEquals(response3, priceCompositeIntegration.createPrice(price3));
    }

    @Test public void TestPutPrice() {
        UUID id1;
        UUID id2;
        UUID id3;

        Price price1;
        Price price2;
        Price price3;

        ResponseEntity<Price> response1;
        ResponseEntity<Price> response2;
        ResponseEntity<Price> response3;

        //UUID anlegen
        id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        id2 = UUID.fromString("1b4acc1d-3439-4b67-905a-1f7a4bb692cb");
        id3 = UUID.fromString("2b4acc1d-3439-4b67-905a-1f7a4bb692cc");
        //Preisobjekt mit Preis:100 und einer UUID anlegen
        price1 = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();
        price2 = new Price.PriceBuilder().withFlightId(id2).withValue(200).build();
        price3 = new Price.PriceBuilder().withFlightId(id3).withValue(300).build();
        //Preis Ausgaben erzeugen
        response1 = new ResponseEntity<>(price1, HttpStatus.OK);
        response2 = new ResponseEntity<>(price2, HttpStatus.OK);
        response3 = new ResponseEntity<>(price3, HttpStatus.OK);
//        //Objekte & Methoden mocken
        priceCompositeIntegration = Mockito.mock(PriceCompositeIntegration.class);
//        Mockito.when(priceCompositeIntegration.putPrice(id1)).thenReturn(response1);
    }

    @Test
    public void TestDeletePrice() {

        UUID id1;
        UUID id2;
        UUID id3;

        Price price1;
        Price price2;
        Price price3;

        ResponseEntity<Price> response1;
        ResponseEntity<Price> response2;
        ResponseEntity<Price> response3;

        //UUID anlegen
        id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        id2 = UUID.fromString("1b4acc1d-3439-4b67-905a-1f7a4bb692cb");
        id3 = UUID.fromString("2b4acc1d-3439-4b67-905a-1f7a4bb692cc");
        //Preisobjekt mit Preis:100 und einer UUID anlegen
        price1 = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();
        price2 = new Price.PriceBuilder().withFlightId(id2).withValue(200).build();
        price3 = new Price.PriceBuilder().withFlightId(id3).withValue(300).build();
        //Preis Ausgaben erzeugen
        response1 = new ResponseEntity<>(price1, HttpStatus.OK);
        response2 = new ResponseEntity<>(price2, HttpStatus.OK);
        response3 = new ResponseEntity<>(price3, HttpStatus.OK);

        //Objekte & Methoden mocken
        priceCompositeIntegration = Mockito.mock(PriceCompositeIntegration.class);
    }



        //Tests fuer CalculatedPrice

    @Test public void TestCalculatePriceFirstClassByInternet() {

        UUID id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        Price basicPrice = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();

        CalculatedPrice calculatedPrice;
        calculatedPrice = new CalculatedPrice(basicPrice);

        double firstClassPriceByInternet = 150.0;
        Assert.assertEquals(firstClassPriceByInternet,calculatedPrice.getFirstClassPriceByInternet());

    }

    @Test public void TestCalculatePriceEconomyClassByInternet() {

        UUID id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        Price basicPrice = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();

        CalculatedPrice calculatedPrice;
        calculatedPrice = new CalculatedPrice(basicPrice);

        double economyPriceByInternet = 120.0;
        Assert.assertEquals(economyPriceByInternet,calculatedPrice.getEconomyClassPriceByInternet());

    }

    @Test public void TestCalculatePriceFirstClassByTravelOffice() {

        UUID id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        Price basicPrice = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();

        CalculatedPrice calculatedPrice;
        calculatedPrice = new CalculatedPrice(basicPrice);

        double firstClassPriceByTravelOffice = 150.0 * 1.2;
        Assert.assertEquals(firstClassPriceByTravelOffice,calculatedPrice.getFirstClassPriceByTravelOffice());

    }

    @Test public void TestCalculatePriceEconomyClassByTravelOffice() {

        UUID id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        Price basicPrice = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();

        CalculatedPrice calculatedPrice;
        calculatedPrice = new CalculatedPrice(basicPrice);

        double economyPriceByTravelOffice = 120.0 * 1.2;
        Assert.assertEquals(economyPriceByTravelOffice,calculatedPrice.getEconomyClassPriceByTravelOffice());

    }

    @Test public void TestCalculatePriceFirstClassByCounter() {

        UUID id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        Price basicPrice = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();

        CalculatedPrice calculatedPrice;
        calculatedPrice = new CalculatedPrice(basicPrice);

        double firstClassPriceByCounter = 150.0 * 0.8;
        Assert.assertEquals(firstClassPriceByCounter,calculatedPrice.getFirstClassPriceByCounter());

    }

    @Test public void TestCalculatePriceEconomyClassByCounter() {

        UUID id1 = UUID.fromString("0b4acc1d-3439-4b67-905a-1f7a4bb692ca");
        Price basicPrice = new Price.PriceBuilder().withFlightId(id1).withValue(100).build();

        CalculatedPrice calculatedPrice;
        calculatedPrice = new CalculatedPrice(basicPrice);

        double economyPriceByCounter = 120.0 * 0.8;
        Assert.assertEquals(economyPriceByCounter,calculatedPrice.getEconomyClassPriceByCounter());

    }
}
