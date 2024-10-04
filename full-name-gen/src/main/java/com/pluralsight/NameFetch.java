package com.pluralsight;

public class NameFetch {
    String FirstName;
    String MiddleInitial;
    String LastName;
    String Suffix;

    public String toString(){
        final StringBuilder sb = new StringBuilder("FirstMiddleLast");
        sb.append("First Name:").append(FirstName).append('\'');
        sb.append("\nMiddle Initial:").append(MiddleInitial);
        sb.append("\nLast Name::").append(LastName);
        sb.append("\nIf applicable please enter any Suffix:").append(Suffix);
        return sb.toString();

    }

    public UserName(){
        this.FirstName = System.in.();

    }
}

