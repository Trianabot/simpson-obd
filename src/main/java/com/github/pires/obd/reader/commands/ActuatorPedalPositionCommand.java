package com.github.pires.obd.reader.commands;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.commands.SystemOfUnits;

public class ActuatorPedalPositionCommand extends ObdCommand {

    protected float pedalPosition = 0;
    private String pid;
    public ActuatorPedalPositionCommand(String pid) {
        super(String.format("01 %s", pid));
        this.pid = pid;
    }

    public ActuatorPedalPositionCommand(ObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        pedalPosition = buffer.get(2)*(100/255);
    }

    @Override
    public String getFormattedResult() {
        return String.format("%f%", pedalPosition);
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(pedalPosition);
    }

    /** {@inheritDoc} */
    @Override
    public String getResultUnit() {
        return "%";
    }

    @Override
    public String getName() {
        if (this.pid == "49")
            return "Actuator Pedal Position D";
        if (this.pid == "4A")
            return "Actuator Pedal Position E";
        if (this.pid == "4B")
            return "Actuator Pedal Position F";
        return "";
    }
}
