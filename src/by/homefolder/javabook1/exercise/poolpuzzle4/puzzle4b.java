package by.homefolder.javabook1.exercise.poolpuzzle4;
class puzzle4b {
    int ivar;
    public int doStuff(int factor){
        if (ivar>100){
            return ivar*factor;
        } else {
            return ivar*(5-factor);
        }
    }

}
