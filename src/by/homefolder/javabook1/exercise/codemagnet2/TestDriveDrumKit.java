package by.homefolder.javabook1.exercise.codemagnet2;

class TestDriveDrumKit {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        if (d.snare == true) {
            d.playSnare();
        }
        d.snare = false;
        d.playTopHat();

    }
}
