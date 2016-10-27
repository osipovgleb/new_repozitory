package com.company;

/**
 * Created by student4 on 20.10.16.
 */
public class Ratio {
    int x, y;
    public Ratio(int x, int y) {
        this.x = x;
        this.y = y;

    }
    double toDouble(){
        return (double)this.x/(double)this.y;

    }
    double plus(Ratio other){
        int del=1;

        int chis=1;
        if(this.y==other.y) {
            del = this.y;

            chis=this.x+other.x;

        } else {
            del = this.y * other.y;
            this.x=this.x*other.y;
            other.x=other.x*this.y;
            chis = this.x + other.x;
        }
            return (double)chis/ (double)del;
    }

    double minus(Ratio other){
        int del=1;

        int chis=1;
        if(this.y==other.y) {
            del = this.y;

            chis=this.x-other.x;

        } else {
            del = this.y * other.y;
            this.x=this.x*other.y;
            other.x=other.x*this.y;
            chis = this.x - other.x;
        }
        return (double)chis/ (double)del;
    }
    double multiply(Ratio other){
        int chis=this.x*other.x;
        int del=this.y*other.y;
        return (double)chis/ (double)del;
    }
    double divide(Ratio other){
        int chis=this.x*other.y;
        int del=this.y*other.x;
        return (double)chis/ (double)del;
    }
    int Int(){
         int integer=x/y;
        return integer;
    }
    int Del(){
        int del=x%y;
        return del;
    }
}
