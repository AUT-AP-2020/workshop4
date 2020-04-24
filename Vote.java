package com.company;

public class Vote {
    //person who votes
    private Person person;
    //date of voting
    private String date;

    /**
     * initialize person and date
     * @param person person field
     * @param date date field
     */
    public Vote(Person person, String date){
        this.person = person;
        this.date = date;
    }

    /**
     * returns voter
     * @return person who votes
     */
    public Person getPerson() {
        return person;
    }

    /**
     * returns date
     * @return date of voting
     */
    public String getDate() {
        return date;
    }

    /**
     * equality of two object
     * @param object is a person
     * @return true if equal
     */
    public boolean equals(Object object){
        if (person.equals(object)){
            return true;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 7;
        hash = prime * hash + (int) date.length();
        hash = prime * hash + (date == null ? 0 : date.hashCode());
        hash = prime * hash + (person == null ? 0 : person.hashCode());
        return hash;
    }
}
