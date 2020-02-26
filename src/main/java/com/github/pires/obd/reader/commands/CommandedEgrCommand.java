package com.github.pires.obd.reader.commands;

import com.github.pires.obd.commands.ObdCommand;

public class CommandedEgrCommand extends ObdCommand {

    protected float egrValue = 0.0f;

    public CommandedEgrCommand() {
        super("01 2C");
    }

    public CommandedEgrCommand(ObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        egrValue = buffer.get(2)*(100/255);
    }

    @Override
    public String getFormattedResult() {
        return String.format("%f%s",egrValue,"%");
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(egrValue);
    }

    @Override
    public String getName() {
        return "Commanded EGR";
    }
}
