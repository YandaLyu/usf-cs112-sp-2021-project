package project1;

import java.util.ArrayList;

public abstract class DummyPredictor extends Predictor {
    @Override
    ArrayList<DataPoint> readData(String filename) {
        return null;
    }

    @Override
    String test(DataPoint data) {
        return null;
    }

    @Override
    Double getAccuracy(ArrayList<DataPoint> data) {
        return null;
    }

    @Override
    Double getPrecision(ArrayList<DataPoint> data) {
        return null;
    }
}
