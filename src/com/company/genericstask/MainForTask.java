package com.company.genericstask;

public class MainForTask {

    public static void main(String[] args) {

        var nationalLVParks = new Park[]{
                new Park("Gaujas Parks", "44.4882, -110.5916"),
                new Park("Kemeru Parks", "36.1085, -112.0965"),
                new Park("Sliteres dabas parks", "37.8855, -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalLVParks);
        parkLayer.renderLayer();

        var majorLVRivers = new River[]{
                new River("Daugava", "47.2160, -95.2348", "29.1566, -89.2495", "35.1556, -90.0659"),
                new River("Gauja", "45.9239, -111.4983", "38.8146, -90.1218")
        };

        Layer<River> riverLayer = new Layer<>(majorLVRivers);

        riverLayer.addElements(
                new River("Some name", "40.4708, -105.8286", "31.7811, -114.7724"),
                new River("Other some", "42.2026, -75.00836", "39.4955, -75.5592")
        );

        riverLayer.renderLayer();
    }

    // run result
//    Render Gaujas Parks National Park as POINT ([44.4882, -110.5916])
//    Render Kemeru Parks National Park as POINT ([36.1085, -112.0965])
//    Render Sliteres dabas parks National Park as POINT ([37.8855, -119.536])
//    Render Daugava River as LINE ([[47.216, -95.2348], [29.1566, -89.2495], [35.1556, -90.0659]])
//    Render Gauja River as LINE ([[45.9239, -111.4983], [38.8146, -90.1218]])
//    Render Some name River as LINE ([[40.4708, -105.8286], [31.7811, -114.7724]])
//    Render Other some River as LINE ([[42.2026, -75.00836], [39.4955, -75.5592]])

}
