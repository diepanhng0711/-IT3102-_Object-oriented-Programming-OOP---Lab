package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.disc.*;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.disc.track.Track;

//import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
//import java.util.ListIterator;

public class TestMediaCompareTo {
    public static void main(String[] args) {
        //Initialize new CD cd1
        CompactDisc cd1 = new CompactDisc("ID01", "Chung ta" , "Son Tung M-TP", 50);
        //ArrayList<Track> cd1List = new ArrayList<Track>();

        cd1.addTrack(new Track("Chung ta cua hien tai", 5));
        cd1.addTrack(new Track("Co chac yeu la day", 3));
        cd1.addTrack(new Track("Muon roi ma sao con", 4));

        
        //Initialize new CD cd2
        CompactDisc cd2 = new CompactDisc("ID02", "Anh la ai", "Phuong Ly", 45);

        cd2.addTrack(new Track("Anh la ai", 4));
        cd2.addTrack(new Track("Thang dien", 4));
        cd2.addTrack(new Track("Missing you", 5));
        cd2.addTrack(new Track("Mat troi cua em", 4));

        //Initialize new DVD dvd1 & dvd2
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("ID03", "The greatest showman", "Musical movie", "Micheal Gracey", 104, 82f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("ID04", "Kimi no nawa", "Anime movie", "Shinkai Makoto", 107, 35);

        //Initialize new discList in which contains information of CDs & DVDs added 
        Collection<Media> discList = new ArrayList<Media>();

        discList.add(cd1);
        discList.add(dvd1);
        discList.add(cd2);
        discList.add(dvd2);

        Iterator<Media> iterator = discList.iterator();

        System.out.println("******* <BEFORE SORTING> *******: \n");
        while(iterator.hasNext()) {
            Media newMedia = iterator.next();
            newMedia.printMedia();
        }

        Iterator<Media> iterator1 = discList.iterator();
        System.out.println();
        System.out.println("The discList's order before sorting: ");
        System.out.println();
        while(iterator1.hasNext()) {
            Media newMedia = iterator1.next();
            System.out.println(newMedia.getTitle());
        }

        System.out.println();

        Collections.sort((List<Media>) discList);

        Iterator<Media> iterator2 = discList.iterator();

        //Sorting in alphabetical order since Collections.sort((List<String>) stringsList) is an alphabetical-sorting method
        System.out.println("******* <AFTER SORTING> *******: \n");
        /*while(iterator2.hasNext()) {
            Media newMedia = iterator2.next();
            newMedia.printMedia();
        }*/
        System.out.println();
        System.out.println("The discList's after sorting: ");
        System.out.println();
        while(iterator2.hasNext()) {
            Media newMedia = iterator2.next();
            System.out.println(newMedia.getTitle());
        }
        System.out.println();
    }
}
