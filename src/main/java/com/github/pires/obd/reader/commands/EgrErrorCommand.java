package com.github.pires.obd.reader.commands;

import com.github.pires.obd.commands.ObdCommand;

public class EgrErrorCommand extends ObdCommand {

    protected float egrPercentage = 0.0f;

    public EgrErrorCommand() {
        super("01 2D");
    }

    public EgrErrorCommand(ObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        egrPercentage = (buffer.get(2) * (100/128)) - 100;

    }

    @Override
    public String getFormattedResult() {
        return String.format("%f%",egrPercentage);
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(egrPercentage);
    }

    @Override
    public String getName() {
        return "EGR Error";
    }
}
