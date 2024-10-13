public class Processor {
    private final String type;

    // Konstruktor
    public Processor(String type) {
        
        this.type = type;
    }

    // Ellenőrzi, hogy a processzor Intel-e
    public boolean isIntel() {
        return type.startsWith("Intel");
    }

    // Ellenőrzi, hogy a processzor AMD-e
    public boolean isAmd() {
        return type.startsWith("AMD");
    }

    // Visszaadja az órajelet double típusban
    public double getClockSpeed() {
        // Ellenőrzi, hogy a processzor Intel-e
        if (isIntel()) {
            // Megkeresi az '@' karakter helyét
            int atIndex = type.indexOf('@');
            
            // Ha '@' nem található, -1.0-t ad vissza
            if (atIndex == -1) {
                return -1.0;
            }
            
            // Kivágja az órajelet tartalmazó részt (az '@' után)
            String clockSpeedPart = type.substring(atIndex + 1).trim();
            
            // Az órajel rész vége a "GHz" előtt található
            int ghzIndex = clockSpeedPart.indexOf("GHz");
            
            // Ha "GHz" nem található, -1.0-t ad vissza
            if (ghzIndex == -1) {
                return -1.0;
            }
            
            // Kivágja az órajel értékét (a "GHz" előtti részt)
            String clockSpeedStr = clockSpeedPart.substring(0, ghzIndex).trim();
            
            try {
                // Visszaadja a double típusú órajel értéket
                return Double.parseDouble(clockSpeedStr);
            } catch (NumberFormatException e) {
                // Ha valamilyen hiba történik a konverzió során, -1.0-t ad vissza
                return -1.0;
            }
        }
        
        // Ha a processzor nem Intel, -1.0-t ad vissza
        return -1.0;
    }

    // Két processzor órajelét hasonlítja össze
    public int cmpClockSpeed(Processor other) {
        if (this.isAmd() || other.isAmd()) {
            return -2; // AMD processzorok nem hasonlíthatók össze
        }

        double thisClockSpeed = this.getClockSpeed();
        double otherClockSpeed = other.getClockSpeed();

        if (thisClockSpeed < otherClockSpeed) {
            return -1; // Az aktuális processzor órajele kisebb
        } else if (thisClockSpeed > otherClockSpeed) {
            return 1; // Az aktuális processzor órajele nagyobb
        } else {
            return 0; // Az órajelek egyenlőek
        }
    }

    @Override
    public String toString() {
        return type;
    }

    
    
}
