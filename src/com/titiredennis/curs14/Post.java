package com.titiredennis.curs14;

public class Post {
//    private Actiune actiune = Actiune.LIKE;
//    private Actiune altaActiune = Actiune.DISLIKE;
//    private Actiune altaActiune2 = Actiune.SAVE;

    private ApprovalState state;
    private Categories categories = Categories.CAFENEA;
    private String name = Categories.RESTAURANT.name();

    Post() {
        this.state = ApprovalState.WHAITING_FOR_APPROVAL;
    }
}
