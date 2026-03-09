package org.example;


import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        ConSubject sub;

        sub = new ConSubject( 1 );

        new AlarmObserver( sub, 3 );
        new PrintObserver( sub );

        for ( int i=2; i<5; i++ )
            sub.changeState( i );
    }

}
