package com.pluralsight;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Reservation {

    private final static Map<String, BigDecimal> ROOM_TYPES = new HashMap<>() {{
        put("king", BigDecimal.valueOf(139.00));
        put("double", BigDecimal.valueOf(124.00));
    }};

    private String roomType;

    private BigDecimal price;
    private int numberOfNights;
    private boolean isWeekend;
    private BigDecimal reservationTotal;

    public Reservation(String roomType, BigDecimal price, int numberOfNights, boolean isWeekend, BigDecimal reservationTotal) {
        this.roomType = roomType;
        this.price = ROOM_TYPES.get(roomType);
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public BigDecimal getReservationTotal() {
        return reservationTotal;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
        this.price = ROOM_TYPES.get(roomType);
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public BigDecimal getReservationTotal() {
        
    }
}
