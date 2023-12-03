/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateactionapp;

/**
 *
 * @author aaron
 */
public abstract class ClimateEducation {

    private int quizScore;

    private boolean desertVisible;

    private boolean iceVisible;

    private boolean landVisible;

    private boolean trueradio1;

    private boolean trueradio3;

    private boolean trueradio5;

    private boolean trueradio7;

    private boolean trueradio9;

    private boolean falseradio2;

    private boolean falseradio4;

    private boolean falseradio6;

    private boolean falseradio8;

    private boolean falseradio10;

    // Constructors

    public ClimateEducation() {
        this.quizScore = 0;
        this.desertVisible = false;
        this.iceVisible = false;
        this.landVisible = false;
        this.trueradio1 = true;
        this.trueradio3 = true;
        this.trueradio5 = true;
        this.trueradio7 = true;
        this.trueradio9 = true;
        this.falseradio2 = false;
        this.falseradio4 = false;
        this.falseradio6 = false;
        this.falseradio8 = false;
        this.falseradio10 = false;
    }

    public ClimateEducation(int quizScore, boolean desertVisible, boolean iceVisible,
            boolean landVisible, boolean trueradio1, boolean trueradio3,
            boolean trueradio5, boolean trueradio7, boolean trueradio9,
            boolean falseradio2, boolean falseradio4, boolean falseradio6,
            boolean falseradio8, boolean falseradio10) {
        this.quizScore = quizScore;
        this.desertVisible = desertVisible;
        this.iceVisible = iceVisible;
        this.landVisible = landVisible;
        this.trueradio1 = trueradio1;
        this.trueradio3 = trueradio3;
        this.trueradio5 = trueradio5;
        this.trueradio7 = trueradio7;
        this.trueradio9 = trueradio9;
        this.falseradio2 = falseradio2;
        this.falseradio4 = falseradio4;
        this.falseradio6 = falseradio6;
        this.falseradio8 = falseradio8;
        this.falseradio10 = falseradio10;
    }

    // Getter and Setter methods

    public int getQuizScore() {
        return quizScore;
    }

    public void setQuizScore(int quizScore) {
        this.quizScore = quizScore;
    }

    public boolean isDesertVisible() {
        return desertVisible;
    }

    public void setDesertVisible(boolean desertVisible) {
        this.desertVisible = desertVisible;
    }

    public boolean isIceVisible() {
        return iceVisible;
    }

    public void setIceVisible(boolean iceVisible) {
        this.iceVisible = iceVisible;
    }

    public boolean isLandVisible() {
        return landVisible;
    }

    public void setLandVisible(boolean landVisible) {
        this.landVisible = landVisible;
    }

    public boolean isTrueradio1() {
        return trueradio1;
    }

    public void setTrueradio1(boolean trueradio1) {
        this.trueradio1 = trueradio1;
    }

    public boolean isTrueradio3() {
        return trueradio3;
    }

    public void setTrueradio3(boolean trueradio3) {
        this.trueradio3 = trueradio3;
    }

    public boolean isTrueradio5() {
        return trueradio5;
    }

    public void setTrueradio5(boolean trueradio5) {
        this.trueradio5 = trueradio5;
    }

    public boolean isTrueradio7() {
        return trueradio7;
    }

    public void setTrueradio7(boolean trueradio7) {
        this.trueradio7 = trueradio7;
    }

    public boolean isTrueradio9() {
        return trueradio9;
    }

    public void setTrueradio9(boolean trueradio9) {
        this.trueradio9 = trueradio9;
    }

    public boolean isFalseradio2() {
        return falseradio2;
    }

    public void setFalseradio2(boolean falseradio2) {
        this.falseradio2 = falseradio2;
    }

    public boolean isFalseradio4() {
        return falseradio4;
    }

    public void setFalseradio4(boolean falseradio4) {
        this.falseradio4 = falseradio4;
    }

    public boolean isFalseradio6() {
        return falseradio6;
    }

    public void setFalseradio6(boolean falseradio6) {
        this.falseradio6 = falseradio6;
    }

      public boolean isFalseradio8() {
        return falseradio8;
    }

    public void setFalseradio8(boolean falseradio8) {
        this.falseradio8 = falseradio8;
    }

    public boolean isFalseradio10() {
        return falseradio10;
    }

    public void setFalseradio10(boolean falseradio10) {
        this.falseradio10 = falseradio10;
    }
}
                            
