class TwelveDays {

    String[] ithNumberStrings = { "", "first", "second", "third", "fourth", 
    "fifth", "sixth", "seventh", "eighth", "ninth", 
    "tenth", "eleventh", "twelfth"} ;

    String[] NumberStrings = { "", "a Partridge in a Pear Tree.\n", "two Turtle Doves, and ", "three French Hens, ",
    "four Calling Birds, ", "five Gold Rings, ", "six Geese-a-Laying, ", "seven Swans-a-Swimming, ", 
    "eight Maids-a-Milking, ", "nine Ladies Dancing, ", "ten Lords-a-Leaping, ", "eleven Pipers Piping, ", 
    "twelve Drummers Drumming, "
    };

    String verse(int verseNumber) {

        String verse = "";

        verse += "On the " + this.ithNumberStrings[verseNumber] + " day of Christmas my true love gave to me: ";

        for (int i = verseNumber; i >= 1; i--) {
            verse += NumberStrings[i];
        }

        return verse;
    }

    String verses(int startVerse, int endVerse) {
        String song = "";

        song += this.verse(startVerse) ;

        for (int i = startVerse+1; i <= endVerse; i++) {

            song += "\n" + this.verse(i);
        }

        return song;
    }
    
    String sing() {

        return this.verses(1, 12);
    }
}
