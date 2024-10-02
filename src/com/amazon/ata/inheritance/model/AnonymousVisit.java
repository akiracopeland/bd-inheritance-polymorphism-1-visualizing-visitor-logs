package com.amazon.ata.inheritance.model;

public class AnonymousVisit extends Visit {
    @Override
    public char getVisitCharacter() {
        return ' ';
    }

    @Override
    public VisitColor getVisitColor() {
        return VisitColor.ANONYMOUS_VISITOR_COLOR;
    }
}